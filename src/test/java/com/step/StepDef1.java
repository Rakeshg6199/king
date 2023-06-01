package com.step;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pom.ArgosLocators;
import com.pom.AsosLocators;
import com.pom.TescoLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef1 extends BaseClass {
	
	ArgosLocators a;
	TescoLocators t;
	AsosLocators as;
	
	@Given("User is on argos page")
	public void user_is_on_argos_page() throws Exception {
//	browserLaunch("chrome");
	launchUrl("https://www.argos.co.uk/");
	}
	@When("User enters {string} in the argos search box")
	public void user_enters_in_the_argos_search_box(String string) throws Exception {
		a=  new ArgosLocators();
		elementClick(a.getBtnCookies());
		elementSendkeys(a.getTxtSearch(), string);
		
	}
	@When("User clicks the search button of argos")
	public void user_clicks_the_search_button_of_argos() throws Exception {
		elementClick(a.getBtnSearch());
		
	}
	@Then("User see the logo of argos page")
	public void user_see_the_logo_of_argos_page() {
		boolean elementDisplayed = elementDisplayed(a.getImgLogo());
		System.out.println(elementDisplayed);
	}
	
	@Given("User is on tesco page")
	public void user_is_on_tesco_page() throws Exception {
//		browserLaunch("chrome");
		launchUrl("https://www.tesco.com/");
	}
	@When("User enters {string} in the tesco search box")
	public void user_enters_in_the_tesco_search_box(String string) throws Exception {
		t = new TescoLocators();
		elementSendkeys(t.getTxtSearch(), string);
	}
	@When("User clicks the search button of tesco")
	public void user_clicks_the_search_button_of_tesco() throws Exception {
		elementClick(t.getBtnSearch());
	}
	@Then("User see the logo of tesco page")
	public void user_see_the_logo_of_tesco_page() {
		System.out.println("true");
	}
	
	@Given("User is on Asos page")
	public void user_is_on_asos_page() throws Exception {
//		browserLaunch("chrome");
		launchUrl("https://www.asos.com/");
	}
	
	@When("User enters {string} in the Asos search box")
	public void user_enters_in_the_asos_search_box(String string) throws Exception {
		as = new AsosLocators();
		elementSendkeys(as.getTxtSearch(), string);
	}
	
	@When("User clicks the search button of Asos")
	public void user_clicks_the_search_button_of_asos() throws Exception {
		elementClick(as.getBtnSearch());
	}
	
	@Then("User see the logo of Asos page")
	public void user_see_the_logo_of_asos_page() {
		boolean elementDisplayed = elementDisplayed(as.getImgLogo());
		System.out.println(elementDisplayed);
	}

}
