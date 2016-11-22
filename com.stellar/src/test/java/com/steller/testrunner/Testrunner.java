package com.steller.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue={"com.stellar/stepdefinations"}
		)

public class Testrunner {
	
	

}
