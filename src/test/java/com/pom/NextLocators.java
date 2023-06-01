package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class NextLocators extends BaseClass {
	
	public NextLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Close']")
	private WebElement btnClose;
	
	public WebElement getBtnClose() {
		return btnClose;
	}

	@FindBy(id = "header-big-screen-search-box")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
}
