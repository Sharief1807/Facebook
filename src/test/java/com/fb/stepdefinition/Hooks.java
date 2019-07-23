package com.fb.stepdefinition;


import com.fb.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public static void method1() {
		FunctionalLibrary.browserLaunch();
	}

	@After
	public static void method2() {
		

	
	}

}
