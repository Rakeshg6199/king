package com.step;

import org.openqa.selenium.WebDriver.TargetLocator;

import com.base.BaseClass;
import com.pom.MatalanLocators;
import com.pom.NextLocators;
import com.pom.PumaLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef3 extends BaseClass {

	NextLocators n;
	PumaLocators p;
	MatalanLocators m;
	
	@Given("User is on next search page")
	public void user_is_on_next_search_page() throws Exception {
		launchUrl("https://www.next.co.uk/");
	}
	@When("User enter {string} in next search page")
	public void user_enter_in_next_search_page(String string) throws Exception {
		n = new NextLocators();
		elementClick(n.getBtnClose());
		elementSendkeys(n.getTxtSearch(), string);
	}
	@When("User click the search button in next")
	public void user_click_the_search_button_in_next() throws Exception {
		elementClick(n.getBtnSearch());
	}
	@Then("Verify the logo is displayed in next")
	public void verify_the_logo_is_displayed_in_next() {
		System.out.println("Displayed");
	}
	
	@Given("User is on puma search page")
	public void user_is_on_puma_search_page() throws Exception {
		launchUrl("https://in.puma.com/in/en");
	}
	@When("User enter {string} in puma search page")
	public void user_enter_in_puma_search_page(String string) throws Exception {
	    p = new PumaLocators();
		
		elementSendkeys(p.getTxtSearch(), string);
	}
	@When("User click the puma search button")
	public void user_click_the_puma_search_button() {
		
		elementDisplayed(p.getBtnSearch());
		
	}
	@Then("Verify the logo is displayed in puma")
	public void verify_the_logo_is_displayed_in_puma() {
		System.out.println("displayed");
	}
	
	@Given("User is on matalan search page")
	public void user_is_on_matalan_search_page() throws Exception {
		launchUrl("https://www.matalan.co.uk/");
	}
	@When("User enter {string} in matalan search page")
	public void user_enter_in_matalan_search_page(String string) throws Exception {
		m = new MatalanLocators();
		elementSendkeys(m.getTxtSearch(), string);
	}
	@When("User click the search button of matalan")
	public void user_click_the_search_button_of_matalan() throws Exception {
		elementClick(m.getBtnSearch());
	}
	@Then("Verify the logo is displayed in matalan")
	public void verify_the_logo_is_displayed_in_matalan() {
		System.out.println("Displayed");
	}
}

