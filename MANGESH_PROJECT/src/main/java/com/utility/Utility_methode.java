package com.utility;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_methode {

	WebDriver driver;
    WebDriverWait wait;
	

	public  Utility_methode(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void sendkeys(WebElement textbox, String value) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(textbox));
		//textbox.clear();
		textbox.sendKeys(value);
	}
	
	

	public void selectRadio(String Text, List<WebElement> Radios) {

		for (WebElement radio : Radios) {
			if (radio.getAttribute("value").equals(Text)) {
				radio.click();
				break;
			}
		}

	}

	public void selectcheckbox(List<String> values, List<WebElement> checkBoxes) {

		for (String value : values) {

			for (WebElement checkbox : checkBoxes) {
				if (checkbox.getAttribute("value").equals(value)) {
					checkbox.click();
					break;
				}
			}

		}

	}
	public void click(WebElement elem){
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		elem.click();
				
	}
	public void selectOption(String text, WebElement elem) {
		Select dropdown = new Select(elem);
		dropdown.selectByVisibleText(text);

	}
	
}
	