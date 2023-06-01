package com.step;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{

	@Before
	public void beforeScenario() {
		
		browserLaunch("chrome");
			
	}
	
	@After
	public void afterScenario() {
		System.out.println("success");
	}
}
