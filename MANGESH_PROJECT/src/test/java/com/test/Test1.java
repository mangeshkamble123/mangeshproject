package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.Login_Page;
import com.testbase.TestBase;

public class Test1 extends TestBase {

	
	WebDriver driver = null;
	Login_Page lp;

	@BeforeSuite
	
	public void browserSetup() {
		driver = initialization();
		lp = loadLoginPages();
		reportInit();
		takescreanshot("name");
	}
	
	@Test(priority=1)
	public void verifyname() {
		Assert.assertTrue(lp.Name());
	}
	
	@Test(priority=2)
	public void verifyadd() {
		Assert.assertTrue(lp.Add());
	}
	@Test(priority=3)
	public void verifymailphone() {
		Assert.assertTrue(lp.Emailandphone());
	}
	@Test(priority=4)
	public void verifymaicheck() {
		Assert.assertTrue(lp.Radioand_Checkbox());
	}
	
	@Test(priority=5)
	public void verifytext()  {
		Assert.assertTrue(lp.textname());
	}
	@Test(priority=6)
	public void verifypass()  {
		Assert.assertTrue(lp.pass());
	}
	@Test(priority=7)
	public void verifycpass()  {
		Assert.assertTrue(lp.cpass());
	}
	@Test(priority=8)
	public void verifycount()  {
		Assert.assertTrue(lp.count());
	}
	@Test(priority=9)
	public void verifyimage()  {
		Assert.assertTrue(lp.image());
	}
	@Test(priority=10)
	public void verifyclick() throws InterruptedException, IOException  {
		Assert.assertTrue(lp.clik());
	}

		
	}

