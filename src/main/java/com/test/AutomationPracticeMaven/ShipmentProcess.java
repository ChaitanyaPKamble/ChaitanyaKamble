package com.test.AutomationPracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShipmentProcess {
	
	public static WebDriver driver;
	
	public ShipmentProcess(WebDriver driver2) {
		driver=driver2;
	}

	public void paymentprocess() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,550)", "");
		WebElement quantity = driver.findElement(By.xpath("//a[contains(@id, 'cart_quantity_up_3')]"));
		quantity.click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,550)", "");
		WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceedtocheckout2.click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,550)", "");
		WebElement updateaddress = driver.findElement(By.xpath("(//a[@title='Update'])[2]"));
		updateaddress.click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,450)", "");
		WebElement zipcodeupdate = driver.findElement(By.xpath("//input[@data-validate='isPostCode']"));
		zipcodeupdate.clear();
		Thread.sleep(2000);
		zipcodeupdate.sendKeys("44533");
		
		Thread.sleep(2000);
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,450)", "");
		WebElement save = driver.findElement(By.xpath("//button[@name='submitAddress']"));
		save.click();
				
		Thread.sleep(2000);
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,450)", "");
		WebElement Note = driver.findElement(By.xpath("//textarea[@name='message']"));
		Note.sendKeys("Testing");
		
		WebElement proceedtocheckout3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proceedtocheckout3.click();
		
	}

}

