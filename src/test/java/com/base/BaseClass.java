package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		return driver;
		
	}
	
	public static void launchUrl(String uRL) throws Exception {
		try {
			driver.get(uRL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.MILLISECONDS);
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	public static void elementClick(WebElement element) throws Exception {
		try {
			WebDriverWait w = new WebDriverWait(driver,3);
			w.until(ExpectedConditions.visibilityOf(element));
			w.until(ExpectedConditions.elementToBeClickable(element));
			w.ignoring(StaleElementReferenceException.class);
			element.click();
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
			}
	}
	
	public static void elementSendkeys(WebElement element,String value) throws Exception {
		try {
			element.sendKeys(value);
		}catch (Exception e) {
		e.printStackTrace();
		throw new Exception(e);
		}
		
	}
	public static String getElementAttribute(WebElement element,String value) throws Exception {
		try {
			String attribute = element.getAttribute(value);
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get element from webelement");
		}
		
	}
	
	public static boolean elementDisplayed(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver,3);
		w.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
		
	}
	
	
	
	public static void driverQuit() {
		driver.quit();
	}
}
