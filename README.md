- Install Java 22+
- Install Git 
- Install Maven 3.9.8+

Add ```MAVEN_HOME```, ```JAVA_HOME``` variables in your environment variables via zshrc file, bashrc file or via Advanced System properties if you are using windows

- Clone this repository
- Go inside FanCode_Api folder

Run the below command to compile, install and run the tests
```sh
mvn clean install test
```

After running the tests, you can find the reports in the below folder
- api-automation/target/cucumber/report.html

Open this file via browser to view the reportFolder PATH listing for volume Acer

## Project Structure
```
├───api-automation  ## the main automation module
│   ├───src
│   │   ├───main
│   │   │   └───java
│   │   │       └───org
│   │   │           └───automation
│   │   │               └───example
│   │   │                   ├───constants ## all the constants related to the specific use-case
│   │   │                   └───context ## all the classes to store the current context while execution is running
│   │   └───test
│   │       ├───java
│   │       │   └───org
│   │       │       └───automation
│   │       │           └───example
│   │       │               ├───config ## cucumber spring configuration files
│   │       │               ├───runner ## cucumber testng runner
│   │       │               └───stepDefs ## step definitions for the feature steps
│   │       └───resources
│   │           ├───features ## feature files comprising of scenarios
│   │           └───suite ## testng xml suite files
│   └───target
│       ├───classes ## all the after compilation files for src/main/java 
│       ├───cucumber ## cucumber reports
│       ├───surefire-reports ## testng reports
│       │   ├───junitreports
│       │   └───Run-All-Tests
│       └───test-classes ## all the after compilation files for src/test/java
└───api-services    ## the services module
├───src
│   └───main
│       └───java
│           └───org
│               └───example
│                   └───common
│                       ├───constants ## common constants like endpoints
│                       ├───pojo ## POJO classes for body parsing 
│                       └───services ## interfaces for services
│                           └───impls ## impl classes for service interfaces
└───target
    └───classes ## all the after compilation files for src/main/java 
```
