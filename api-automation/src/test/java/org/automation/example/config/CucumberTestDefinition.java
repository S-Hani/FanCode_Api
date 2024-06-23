package org.automation.example.config;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = {CucumberTestConfig.class})
@SpringBootTest
@CucumberContextConfiguration
public class CucumberTestDefinition {
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }

}
