package com.test.AutomationPracticeMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class setup {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;



	//	public static void main(String[] args) throws InterruptedException {
	//		
	//		setup r1 = new setup();
	//		r1.APsetup();
	//		
	//		signup r2 = new signup(driver);
	//		r2.APsignup();
	//		
	//		dressselection r3 = new dressselection(driver);
	//		r3.APdress();
	//		
	//		ShipmentProcess r4 = new ShipmentProcess(driver);
	//		r4.paymentprocess();
	//		
	//		r1.teardown();

	//
	//	}
	@Parameters("browser")
	@BeforeTest
	//	public void APsetup(String brow) throws MalformedURLException
	public void APsetup()
	{
		//		DesiredCapabilities CAP = new DesiredCapabilities();
		//		CAP.setBrowserName(brow);
		//		driver= new RemoteWebDriver(new URL ("http://192.168.0.6:4444/wd/hub"), CAP);
		//		if (brow.equals("chrome"))
		//		{
		//				System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		//				driver = new ChromeDriver();
		//		
		//	}

		//	else if (brow.equals("firefox"))
		//	{
		//		System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		//		driver = new FirefoxDriver();
		//		
		//	}


		//	else if (brow.equals("ie"))
		//	{
		//		System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
		//		driver = new InternetExplorerDriver();
		//		
		//	}
		//	else 
		//	{
		//		System.out.println("The browser didn't match");
		//	}
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Resource/Selenium.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		test = extent.createTest("MyFirstTest");
		test.pass("Starting Execution");

		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		test.pass("Browser Launch Successfully");


		driver.navigate().to("http://automationpractice.com/index.php");
		test.pass("Opened URL");

		driver.manage().window().maximize();
		test.pass("Window is maximize");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	@Test
	public void signup1()
	{
		signup signup1 = new signup(driver,test);
		signup1.APsignup();
	}

	@Test(dependsOnMethods = "signup1")
	public void dressselection1() throws InterruptedException
	{
		dressselection dress = new dressselection(driver);
		dress.APdress();
	}

	@Test(priority = 2)
	public void shipmentprocess1() throws InterruptedException
	{
		ShipmentProcess sp = new ShipmentProcess(driver);
		sp.paymentprocess();
	}

	@Test(priority = 3)
	public void shippingproduct1() throws InterruptedException
	{
		shipping shippingproduct1 = new shipping(driver);
		shippingproduct1.shippingproduct();

	}

	@AfterTest
	public void teardown() throws InterruptedException
	{
		extent.flush();
		Thread.sleep(2000);
		driver.quit();



	}

}
