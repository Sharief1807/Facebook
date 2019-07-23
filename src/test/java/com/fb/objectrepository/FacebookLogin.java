package com.fb.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.resources.FunctionalLibrary;

public class FacebookLogin {
	
	public FacebookLogin()
	{
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
