package com.telecom.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerDetails {
	public static WebDriver driver;

	@Given("launch telecom website")
	public void launch_telecom_website() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		


	}

	@Given("click add customer details")
	public void click_add_customer_details() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
				


	}

	@When("fill all details in repective box")
	public void fill_all_details_in_repective_box() {
		driver.findElement(By.xpath("//label[@for=\"done\"]")).click();
		driver.findElement(By.id("fname")).sendKeys("vezha");
		driver.findElement(By.id("lname")).sendKeys("vendan");
		driver.findElement(By.id("email")).sendKeys("vezhaappu6@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("ponneri");
        driver.findElement(By.id("telephoneno")).sendKeys("9629939941");


	}

	@When("click submit")
	public void click_submit() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    
	}

	@Then("check customer id is generated")
	public void check_customer_id_is_generated() {
		WebElement verify = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
		String text = verify.getText();
		System.out.println(text);
		Assert.assertEquals("Please Note Down Your CustomerID", text);
	   
	}
}
