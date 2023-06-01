package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MatalanLocators extends BaseClass {
	
	public MatalanLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@title='Search...']")
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
