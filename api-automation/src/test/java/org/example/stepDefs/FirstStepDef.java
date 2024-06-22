package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.services.JsonPlaceHolderService;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class FirstStepDef {

    @Autowired
    private JsonPlaceHolderService service;

    Logger logger = LogManager.getLogger(FirstStepDef.class);

    @Given("^User has todo tasks$")
    public void userHasTodoTasks(){
      logger.info( service.getAllUsers());
    }

    @And("^User belongs to the city (.*)$")
    public void userBelongsToTheCity(String cityName){

    }

    @Then("^User completed task percentage should be (.*) (\\d+)%$")
    public void userCompletedTaskPercentageShouldBe(String operator, String value){

    }


}
