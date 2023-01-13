package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = ".\\src\\test\\resources\\features\\ingAsoft.feature",glue = {"pasos"})
public class Run extends AbstractTestNGCucumberTests{
	
	

}
