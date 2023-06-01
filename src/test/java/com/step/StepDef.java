package com.step;

import com.base.BaseClass;
import com.pom.AmazonLocators;
import com.pom.FlipkartLocators;
import com.pom.MyntraLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass{
	AmazonLocators a;
	FlipkartLocators f;
	MyntraLocators m;

	@Given("User is on amazon search page")
	public void user_is_on_amazon_search_page() throws Exception {
//		browserLaunch("chrome");
		launchUrl("https://www.amazon.in/");
	}
	@When("User enter {string} in amazon search page")
	public void user_enter_in_amazon_search_page(String string) throws Exception {
		a = new AmazonLocators();
		elementSendkeys(a.getTxtSearch(), string);
	}
	@When("User click the search button in amazon")
	public void user_click_the_search_button_in_amazon() throws Exception {
		elementClick(a.getBtnSearch());
	}
	@Then("Verify the logo is displayed in amazon")
	public void verify_the_logo_is_displayed_in_amazon() {
		boolean elementDisplayed = elementDisplayed(a.getImgLogo());
		System.out.println(elementDisplayed);
	}
	
	

	@Given("User is on flipkart search page")
	public void user_is_on_flipkart_search_page() throws Exception {
//		browserLaunch("chrome");
		launchUrl("https://www.flipkart.com/");
	}
	@When("User enter {string} in flipkart search page")
	public void user_enter_in_flipkart_search_page(String string) throws Exception {
		f = new FlipkartLocators();
		elementClick(f.getBtnClose());
		elementSendkeys(f.getTxtSearch(), string);
	}
	@When("User click the flipkart search button")
	public void user_click_the_flipkart_search_button() throws Exception {
		elementClick(f.getBtnSearch());
	}
	@Then("Verify the logo is displayed in flipkart")
	public void verify_the_logo_is_displayed_in_flipkart() {
		boolean elementDisplayed = elementDisplayed(f.getImgLogo());
		System.out.println(elementDisplayed);

	}
	
	

	@Given("User is on myntra search page")
	public void user_is_on_myntra_search_page() throws Exception {
//		browserLaunch("chrome");
		launchUrl("https://www.myntra.com/");
	}
	@When("User enter {string} in Myntra search page")
	public void user_enter_in_myntra_search_page(String string) throws Exception {
		m = new MyntraLocators();
		elementSendkeys(m.getTxtSearch(), string);
	}
	@When("User click the search button of Myntra")
	public void user_click_the_search_button_of_myntra() throws Exception {
		elementClick(m.getBtnSearch());
	}
	@Then("Verify the logo is displayed in myntra")
	public void verify_the_logo_is_displayed_in_myntra() throws Exception {
		boolean elementDisplayed = elementDisplayed(m.getImgLogo());
		System.out.println(elementDisplayed);

	}


}
