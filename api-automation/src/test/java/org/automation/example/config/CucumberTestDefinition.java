package org.automation.example.config;


import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.BeforeClass;

import static org.example.common.constants.ApiEndpoints.BASE_URI;

@ContextConfiguration(classes = {CucumberTestConfig.class})
@SpringBootTest
@CucumberContextConfiguration
public class CucumberTestDefinition {
    public void setup_cucumber_spring_context(){
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }

}
