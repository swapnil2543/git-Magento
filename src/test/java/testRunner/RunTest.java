package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Feature/SignUp.feature"},
				glue = {"stefdefination"},
				dryRun =  false,
				monochrome = true,
				plugin = {"pretty","html:target/cucumber/cucumber_reports.html"}
		
		
		
		)


public class RunTest {

}
