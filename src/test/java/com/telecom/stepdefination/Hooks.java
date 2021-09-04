package com.telecom.stepdefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.CommonAction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonAction {
	CommonAction ca=new CommonAction();
			
	/*public static WebDriver driver; 
	@Before
	@Given("launch telecom application")*/
	@Before
	public void launch_telecom_application() {
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();*/
		ca.BrowserLaunch("http://demo.guru99.com/telecom/");
	}
	@After
	@Then("Close the browsers")
	public void close_the_browsers(Scenario sc) {
		if(sc.isFailed()) {
			final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, "image/png");
		}else {
			
			sc.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
		
	 driver.quit();
	}

}
