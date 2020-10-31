package com.usa.runnerpage;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"Features"},
		glue= {"com.usa.stepdefition"})

public class MyRunnerPage extends AbstractTestNGCucumberTests {

}
