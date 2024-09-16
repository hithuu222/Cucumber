package StepsDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepsDefination"},
//To create reports
plugin = {
        "pretty", "html:target/cucumber-reports1/cucumber.html", // Generates HTML report
        "json:target/cucumber-reports1/cucumber.json",  // JSON report for extended reporting
        "junit:target/cucumber-reports1/cucumber.xml" // XML report
        
    },
monochrome=true // Makes console output more readable
)
public class TestRunner {
	
	
		
	}
	

	

