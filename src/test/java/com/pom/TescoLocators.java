package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class TescoLocators extends BaseClass {

	
	public TescoLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "beans-masthead-desktop-search-input")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//h1[contains(text(), 'Results for')]")
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
