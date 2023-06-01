package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AsosLocators extends BaseClass{

	
	public AsosLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "chrome-search")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//img[@alt='ASOS logo']")
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
