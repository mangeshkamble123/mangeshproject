package com.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utility.Utility_methode;

public class Login_Page extends Utility_methode {

	WebDriver driver;
	Actions action;

	public Login_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@ng-model='LastName']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@rows='3']")
	private WebElement address;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;

	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> check;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radio;

	@FindBy(xpath = "//div[@id='msdd']")
	private WebElement lang;

	@FindBy(id = "Skills")
	private WebElement sk;

	@FindBy(id = "yearbox")
	private WebElement yr;

	@FindBy(xpath = "//select[@ng-model='monthbox']")
	private WebElement mh;

	@FindBy(id = "firstpassword")
	private WebElement pass;
	
	@FindBy(id = "secondpassword")
	private WebElement cpass;
	
	@FindBy(id = "imagetrgt")
	private WebElement image;
	
	@FindBy(xpath = "//input[@onchange='uploadimg()']")
	private WebElement cl;
	
	

	public boolean Name() {

		firstname.sendKeys("mangesh");
		lastname.sendKeys("kamble");
		return true;
	}

	public boolean Add() {

		address.sendKeys("survey no.7516, indrayani vihar sant nagar lohegaon pune-411047 ");
		return true;

	}

	public boolean Emailandphone() {
		email.sendKeys("kamblemangesh632@gmail.com");
		phone.sendKeys("7972004619");
		return true;

	}

	public boolean Radioand_Checkbox() {

		List<WebElement> Radios = radio;
		selectRadio("Male", Radios);

		List<WebElement> checkBoxes = check;
		List<String> values = new ArrayList<String>();
		values.add("Movies");
		values.add("Hockey");
		selectcheckbox(values, checkBoxes);

		return true;

	}

	public boolean textname() {
		WebElement select = sk;
		WebElement year = yr;
		WebElement month = mh;

		selectOption("C", select);
		selectOption("1920", year);
		selectOption("February", month);
		System.out.println("select option done");

		return true;
	}

	public boolean pass() {

		pass.sendKeys("mangesh123");
		return true;

	}
	public boolean cpass() {

		cpass.sendKeys("mangesh123");
		return true;

	}
	public boolean count() {

		WebElement select = sk;
		Select dropdown = new Select(select);
		List<WebElement> dropcount = dropdown.getOptions();
		System.out.println(dropcount.size());

		for (WebElement drop : dropcount) {
			System.out.println(drop.getText());

		}
		return true;

	}
	public boolean image() {

		image.isDisplayed();
		return true;

	}
	public boolean clik() throws InterruptedException, IOException {
		action = new Actions(driver);
        action.moveToElement(cl).click().perform();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("C:\\Users\\PC\\11dec.exe");
		
		
		return true;

	}
}