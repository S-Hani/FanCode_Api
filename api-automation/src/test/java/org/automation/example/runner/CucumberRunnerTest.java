package org.automation.example.runner;

import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.restassured.RestAssured;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static org.example.common.constants.ApiEndpoints.BASE_URI;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org.automation.example"},
        tags = ""
)
@EnableAutoConfiguration
@ComponentScan

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = BASE_URI;
    }
}

