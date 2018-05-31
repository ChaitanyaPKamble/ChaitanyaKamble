package com.test.AutomationPracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shipping {
	public static WebDriver driver;
	
	

	public shipping(WebDriver driver2) {
		driver=driver2;
	}



	public void shippingproduct() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("window.scrollBy(0,550)", "");
		WebElement TermofService = driver.findElement(By.xpath("//input[@name='cgv']"));
		TermofService.click();
		
		WebElement proceedtoCheckout = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceedtoCheckout.click();
		
		Thread.sleep(2000);
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		
		Thread.sleep(2000);
		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		
	}

}
