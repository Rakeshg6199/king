package com.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFolder\\ecom.feature", glue = "com.step",plugin ={"pretty","json:src/test/resources/report/cucumber.json"},dryRun = false)
public class TestRunner {
  

	@AfterClass
	public static void afterCLass() {
		JvmReport.report();
	}
	
}