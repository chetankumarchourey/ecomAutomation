package com.krn.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class Search extends BaseClass {
  @Test
  public void testCreateCustomer() {
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rice pantry");
	  driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	  driver.findElement(By.linkText("Daawat Rozana Super Basmati Rice, 5kg")).click();
	  driver.findElement(By.id("//select[@id='quantity']/option[2]")).click();
	  driver.findElement(By.id("submit.add-to-cart-announce")).click();
	  
	 
  }
}
