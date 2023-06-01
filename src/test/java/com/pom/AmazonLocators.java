package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AmazonLocators extends BaseClass{
	
	public AmazonLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtSearch;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement btnSearch;
	
	@FindBy(id = "nav-logo")
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
