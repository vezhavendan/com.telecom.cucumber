package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.CommonAction;

public class AddTarrifPage extends CommonAction {
	public AddTarrifPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "(//a[text()='Add Tariff Plan'])[1]")
			private WebElement AddtariffButton;
	@FindBy(name="rental")
	private WebElement fname;
		@FindBy(id="local_minutes")
		private WebElement localminutes;
		@FindBy(xpath="(//input[@type=\"text\"])[3]")
		private WebElement Number;
		@FindBy(id="sms_pack")
		private WebElement sms_pack;
		@FindBy(id="minutes_charges")
		private WebElement MinutesCharge;
		@FindBy(id="inter_charges")
		private WebElement Intercharges;
		@FindBy(id="sms_charges")
		private WebElement smscharges;
		@FindBy(xpath="//input[@type=\"submit\"]")
		private WebElement SubmitButton;
		
		@FindBy(xpath="//*[text()='Congratulation you add Tariff Plan']")
		private WebElement validate;

		public WebElement getAddtariffButton() {
			return AddtariffButton;
		}

		public WebElement getFname() {
			return fname;
		}

		public WebElement getLocalminutes() {
			return localminutes;
		}

		public WebElement getNumber() {
			return Number;
		}

		public WebElement getSms_pack() {
			return sms_pack;
		}

		public WebElement getMinutesCharge() {
			return MinutesCharge;
		}

		public WebElement getIntercharges() {
			return Intercharges;
		}

		public WebElement getSmscharges() {
			return smscharges;
		}

		public WebElement getSubmitButton() {
			return SubmitButton;
		}

		public WebElement getValidate() {
			return validate;
		}
		
		
		

	

}
