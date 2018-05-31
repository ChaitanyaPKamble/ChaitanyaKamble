package com.test.AutomationPracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class signup {
	
	public WebDriver driver;
	public ExtentTest test;
	
  public signup(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test=test;
	}


  public void APsignup()
  {
	  WebElement signup = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	  signup.click();
	  
	 	  
	  WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("xyz@mail.com");
	  
	  WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
	  pass.sendKeys("abcxyz");
	  
	  WebElement signbtn = driver.findElement(By.id("SubmitLogin"));
	  signbtn.click();
	  
	  
  }
}

