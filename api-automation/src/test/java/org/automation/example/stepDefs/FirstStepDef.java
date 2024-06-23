package org.automation.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.automation.example.constants.City;
import org.automation.example.constants.Operator;
import org.automation.example.context.KnowsContext;
import org.example.common.pojo.ToDo;
import org.example.common.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.common.services.JsonPlaceHolderService;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class FirstStepDef {

    @Autowired
    private JsonPlaceHolderService service;

    @Autowired
    private KnowsContext knowsContext;

    private List<User> usersUnderTest;

    static Logger logger = LogManager.getLogger(FirstStepDef.class);

    @Given("^User takes all the information$")
    public void userTakesAllInformation() {
        knowsContext.setUsers(service.getAllUsers());
        knowsContext.setToDos(service.getAllToDos());
    }

    @Given("^User has todo tasks$")
    public void userHasTodoTasks() {
        usersUnderTest = new ArrayList<>(knowsContext.getUsers().stream().filter(user -> knowsContext.getToDos().stream().anyMatch(todo -> todo.getUserId() == user.getId())).toList());
        logger.info("Users having todo tasks: " + usersUnderTest);
    }

    @And("^User belongs to the city (.*)$")
    public void userBelongsToTheCity(String cityName) {
        if (City.valueOfFullName(cityName) == City.FANCODE) {
            List<User> usersBelongToCity = knowsContext.getUsers().parallelStream().filter(user -> {
                double lat = Double.parseDouble(user.getAddress().getGeo().getLat());
                double lng = Double.parseDouble(user.getAddress().getGeo().getLng());
                return City.FANCODE.inRange(lat, lng);
            }).toList();
            usersUnderTest.retainAll(usersBelongToCity);
        }
        logger.info("Users belonging to city " + cityName + ": " + usersUnderTest);
    }

    @Then("^User completed task percentage should be (\\D+) (\\d+)%$")
    public void userCompletedTaskPercentageShouldBe(String operator, int value) {
        List<ToDo> tasks = knowsContext.getToDos().stream().filter(todo -> usersUnderTest.stream().anyMatch(user -> user.getId() == todo.getUserId())).toList();
        List<ToDo> completedTasks = tasks.stream().filter(ToDo::isCompleted).toList();
        logger.info("Total tasks of users belonging to city: " + tasks.size());
        logger.info("Total completed tasks of users belonging to city: " + completedTasks.size());

        if (Operator.valueOfLabel(operator) == Operator.GT) {
            Assert.assertTrue(100.0 * completedTasks.size() / tasks.size() > value);
        }
    }


}
