package com.krn.actitime.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	  @BeforeClass
	  public void openBrowser() {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/ap/signin");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @BeforeMethod
	  public void login() {
		  /**
		   * Insert or modify the statement to pass "email/number"
		   */
		    driver.findElement(By.id("ap_email")).sendKeys("");
			
			driver.findElement(By.id("continue")).click();
			 /**
			   * Insert or modify the statement to put password
			   */
	        driver.findElement(By.id("ap_password")).sendKeys("");

			driver.findElement(By.id("signInSubmit")).click();
		//	driver.findElement(By.id("continue")).click();
	  }
	  @AfterMethod
	  public void logout() throws InterruptedException {
		  driver.findElement(By.id("nav-link-accountList"));
		  Actions actions = new Actions(driver);
		  actions.perform();
		  actions.sendKeys(Keys.ARROW_DOWN).perform();
		  Thread.sleep(300);
		  driver.findElement(By.id("nav-item-signout")).click();

	  }
	  @AfterClass
	  public void closeBrowser() {
		  driver.close();
  }
}
