package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FlipkartLocators extends BaseClass {

	public FlipkartLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnClose;

	public WebElement getBtnClose() {
		return btnClose;
	}

	@FindBy(xpath = "//img[@title='Flipkart']")
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
