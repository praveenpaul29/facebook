package org.question8.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources", glue = "org.question8", tags = "@Smoke")
public class Question8runner {

}
