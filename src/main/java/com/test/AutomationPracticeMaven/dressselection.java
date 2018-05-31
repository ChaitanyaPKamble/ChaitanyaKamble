package com.test.AutomationPracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class dressselection {
	
	public static WebDriver driver;
	
	public dressselection(WebDriver driver2) {
		driver = driver2;
	}

	public void APdress() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Dress.click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)", "");
		WebElement listview = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
		listview.click();
		
		Thread.sleep(2000);
		WebElement dressselection = driver.findElement(By.xpath("//a[@data-id-product='3']"));
		dressselection.click();
		
		Thread.sleep(2000);
		WebElement proceedcheckout1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedcheckout1.click();
		

		
		//a[@title='Proceed to checkout']
		
//		Thread.sleep(2000);
//		WebElement Dress2 = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
//		Dress2.click();
//		
//		Thread.sleep(2000);
//		WebElement PrintedDress = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//		PrintedDress.click();
		
//		Thread.sleep(4000);
//		WebElement quantity = driver.findElement(By.xpath("//*[@id=quantity_wanted_p]/a[2]"));
//		quantity.click();
		
//		Thread.sleep(2000);
//		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
//		quantity.clear();
//		Thread.sleep(2000);
//		quantity.sendKeys("2");
//		
//		Thread.sleep(2000);
//		WebElement Sizedropdown = driver.findElement(By.xpath("//select[@name ='group_1']"));
//		Sizedropdown.click();
//		
//		Thread.sleep(2000);
//		WebElement dropdownvalueselect = driver.findElement(By.xpath("//option[@title ='M']"));
//		dropdownvalueselect.click();
//		
//		Thread.sleep(2000);
//		WebElement Addcartbutton = driver.findElement(By.xpath("//button[@class ='exclusive']"));
//		Addcartbutton.click();
		
				
	}

}
