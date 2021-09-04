package com.telecom.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src//test//resources//AddTarrif1.Feature",
		glue="com.telecom.stepdefination",
		plugin="html:target1",
		monochrome=true,
		dryRun=false
		
		
		
		
		)

public class TestRun {

}
