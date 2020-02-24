package cs1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
@RunWith(Cucumber.class)
public class Runner {
	
}
