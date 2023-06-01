package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MyntraLocators extends BaseClass {

	public MyntraLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//a[@class='desktop-submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	private WebElement imgLogo;
	

	public WebElement getImgLogo() {
		return imgLogo;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}
