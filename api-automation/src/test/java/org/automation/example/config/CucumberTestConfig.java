package org.automation.example.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "org.example.common",
        "org.automation.example"
})
public class CucumberTestConfig {
}
