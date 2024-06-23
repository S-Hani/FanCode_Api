- Install Java 22+
- Install Git 
- Install Maven 3.9.8+

Add MAVEN_HOME, JAVA_HOME variables in your environment variables via zshrc file, bashrc file or via Advanced System properties if you are using windows

Clone this repository
Go inside FanCode_Api folder

Run the below command to compile, install and run the tests
- mvn clean install test

After running the tests, you can find the reports in the below folder
- api-automation/target/cucumber/report.html

Open this file via browser to view the report