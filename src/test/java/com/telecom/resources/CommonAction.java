package com.telecom.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {
	public static WebDriver driver;
	public void BrowserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// TODO Auto-generated method stub

	}
	public void InsertValue(WebElement e,String value) {
		// TODO Auto-generated method stub
		e.sendKeys(value);
		}
	public void ClickOption(WebElement e) {
		// TODO Auto-generated method stub
		e.click();

	}
	public String gettext(WebElement e) {
		return e.getText();

	}
}
