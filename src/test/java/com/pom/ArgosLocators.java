package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ArgosLocators extends BaseClass {
	
	public ArgosLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "consent_prompt_submit")
	private WebElement btnCookies;
	
	public WebElement getBtnCookies() {
		return btnCookies;
	}

	@FindBy(id = "searchTerm")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//img[@alt='Argos logo']")
	private WebElement imgLogo;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getImgLogo() {
		return imgLogo;
	}
	

}
