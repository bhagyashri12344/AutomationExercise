package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "C:\\eclipse2\\CucumberProject\\src\\test\\resources\\features\\LoginStep.feature",
	    glue = "StepDefinations",
	    plugin = {
	        "pretty", 
	        "html:target/cucumber-reports/html/report.html", 
	        "json:target/cucumber-reports/json/cucumber.json",
	        "junit:target/cucumber-reports/junit/cucumber.xml"
	    }
	)
	public class RunnerTest {
	}


