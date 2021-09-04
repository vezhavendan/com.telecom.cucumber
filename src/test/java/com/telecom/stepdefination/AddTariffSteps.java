package com.telecom.stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddTarrifPage;
import com.telecom.resources.CommonAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffSteps extends CommonAction{
	CommonAction ca=new CommonAction();
	AddTarrifPage a=new AddTarrifPage();

	@Given("click add tarrif details")
	public void click_add_tarrif_details() {
		//WebElement addtariffbutton = driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]"));
		ca.ClickOption(a.getAddtariffButton());
	}

	@When("fill all details in {int}D list")
	public void fill_all_details_in_D_list(Integer i, DataTable data) {
		List<String> datas = data.asList(String.class);
		//WebElement fname = driver.findElement(By.name("rental"));
		ca.InsertValue(a.getFname(), datas.get(0));
		//WebElement lname = driver.findElement(By.id("local_minutes"));
		ca.InsertValue(a.getLocalminutes(), datas.get(1));
		//WebElement number = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		ca.InsertValue(a.getNumber(), datas.get(2));
		//WebElement sms = driver.findElement(By.id("sms_pack"));
		ca.InsertValue(a.getSms_pack(), datas.get(3));
		//WebElement min = driver.findElement(By.id("minutes_charges"));
		ca.InsertValue(a.getMinutesCharge(), datas.get(4));
		///WebElement inter = driver.findElement(By.id("inter_charges"));
		ca.InsertValue(a.getIntercharges(), datas.get(5));
		//WebElement smscha = driver.findElement(By.id("sms_charges"));
		ca.InsertValue(a.getSmscharges(), datas.get(6));
		//.sendKeys(datas.get(6));

	}

	@When("click submit button")
	public void click_submit_button() {
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	ca.ClickOption(a.getSubmitButton());
	}

	@Then("validate details entered succssfully")
	public void validate_details_entered_succssfully() {
		//WebElement validate = driver.findElement(By.xpath("//*[text()='Congratulation you add Tariff Plan']"));
		//String text = validate.getText();
		String text=ca.gettext(a.getValidate());
		System.out.println(text);
		Assert.assertEquals("Congratulation you add Tariff Plan", text);
	}

	

	
	

	@Given("click add tarrif detailss")
	public void click_add_tarrif_detailss() {
		//driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();
		ca.ClickOption(a.getAddtariffButton());
	}

	@When("fill all details in {int}D map")
	public void fill_all_details_in_D_map(Integer i, DataTable dat) {
		Map<String, String> datt = dat.asMap(String.class, String.class);
		
		//driver.findElement(By.name("rental")).sendKeys(datt.get("Monthly"));
		ca.InsertValue(a.getFname(), datt.get("Monthly"));
		//driver.findElement(By.id("local_minutes")).sendKeys(datt.get("Free"));
		ca.InsertValue(a.getLocalminutes(), datt.get("Free"));
		//driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys(datt.get("Free1"));
		ca.InsertValue(a.getNumber(), datt.get("Free1"));
		//driver.findElement(By.id("sms_pack")).sendKeys(datt.get("Free_SMS"));
		ca.InsertValue(a.getSms_pack(), datt.get("Free_SMS"));
		//driver.findElement(By.id("minutes_charges")).sendKeys(datt.get("Local"));
		ca.InsertValue(a.getMinutesCharge(), datt.get("Local"));
		//driver.findElement(By.id("inter_charges")).sendKeys(datt.get("International"));
		ca.InsertValue(a.getIntercharges(), datt.get("International"));
		//driver.findElement(By.id("sms_charges")).sendKeys(datt.get("SMS"));
		ca.InsertValue(a.getSmscharges(), datt.get("SMS"));
	    
	}

	@When("click submit buttons")
	public void click_submit_buttons() {
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		ca.ClickOption(a.getSubmitButton());
	}

	@Then("validate details entered succssfullys")
	public void validate_details_entered_succssfullys() {
		//WebElement validate = driver.findElement(By.xpath("//*[text()='Congratulation you add Tariff Plan']"));
		String text = ca.gettext(a.getValidate());
		System.out.println(text);
		Assert.assertEquals("Congratulation you add Tariff Plan", text);
	}





}
