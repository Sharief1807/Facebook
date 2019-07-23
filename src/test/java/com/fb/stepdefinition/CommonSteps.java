package com.fb.stepdefinition;

import com.fb.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;

public class CommonSteps extends FunctionalLibrary{

	@Given("As a user i am in the home pagea")
	public void as_a_user_i_am_in_the_home_pagea() {

	    driver.get("https://www.facebook.com/");
	}
	
	
}
