package com.fb.stepdefinition;

import java.util.List;

import com.fb.objectrepository.FacebookLogin;
import com.fb.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginSteps extends FunctionalLibrary {
	
	
	@When("I have enter invalid credentialsa {string} and {string}")
	public void i_have_enter_invalid_credentialsa_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials=dataTable.asList(String.class);
		
		FacebookLogin fb=new FacebookLogin();
		fb.getUsername().sendKeys(credentials.get(0));
		fb.getPassword().sendKeys(credentials.get(1));
		fb.getSubmit().click();
		
		
	}

	@Then("It should not successfully logged ina")
	public void it_should_not_successfully_logged_ina() {

		System.out.println("pass");
	}

	

}
