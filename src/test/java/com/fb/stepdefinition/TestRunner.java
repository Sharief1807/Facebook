package com.fb.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Facebook\\src\\test\\resources\\features\\FB.feature", glue="com.fb.stepdefinition", strict=true,monochrome=true,plugin= {"html:target"})
public class TestRunner {

}
