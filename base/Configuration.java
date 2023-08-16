package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utilities.Generic_class;

public class Configuration extends Generic_class{
	
	 @BeforeSuite
		public void Before_Suite() {
		 applicationLogs.info("Started Test Suite");
		 //System.out.println("Started Test suite");
		}

	 @AfterSuite
		public void After_Suite() {
		 applicationLogs.info("Ends Test Suite");	
		 //System.out.println("Ends Test suite");
		}
// This class will hold:
	
	//1. Driver initilization
		//Initialization through the inheritance
	 @Parameters({"url", "browser"})
	
	//2. Set up browser
	 
	 
	@BeforeTest
	public void browserSetup(String baseURL,String browserName) {
		 if (driver==null) {
		if (browserName.equalsIgnoreCase("firefox")) {

			// Launch Firefox Browser
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sanme\\eclipse-workspace\\DRIVER\\geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver",System.getProperty(("user.dir")+"\\DRIVER\\geckodriver.exe"));
			driver = new FirefoxDriver();
			MaxPage();
			// Maximize the size of the browser window
			//System.out.println("Website successfully opened");
			applicationLogs.info("Website successfully opened");
		} else if (browserName.equalsIgnoreCase("edge")) {

			// Launch Edge Browser
			System.setProperty("webdriver.edge.driver","C:\\Users\\sanme\\eclipse-workspace\\DRIVER\\msedgedriver.exe");
			//System.setProperty("webdriver.edge.driver",System.getProperty(("user.dir")+"\\DRIVER\\msedgedriver.exe"));
			driver = new EdgeDriver();
			MaxPage();
			applicationLogs.info("Website successfully opened");
			//System.out.println("Website successfully opened");

		} else if (browserName.equalsIgnoreCase("chrome")) {

			// Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sanme\\eclipse-workspace\\DRIVER\\chromedriver.exe");
			driver = new ChromeDriver();
			MaxPage();
			applicationLogs.info("Website successfully opened");
			//System.out.println("Website successfully opened");
		} else {
			throw new IllegalArgumentException ("Browser Type is undefined");
		}}		
			//System.out.println("Unsupported web browser: " + browserName);
			//return; // exit the method
			driver.get(baseURL);
			applicationLogs.info("www.amazon.com is opened");
			//System.out.println("www.amazon.com is opened");

		}
	

	//3. Company's base URL
	/*
		@BeforeMethod
		public void BaseUrl(String url) {
			driver.get(url);
			MaxPage();
		}
		
		@AfterMethod 
		public void CloseURL() {
		applicationLogs.info("One test case is done");
		//System.out.println("One test case is done");
		}
*/

		//4. Database connection (if any)
		
		//5. Driver close
		@AfterTest
			public void browserClose() {
				driver.close();
				//System.out.println("Browser is closed");
				applicationLogs.info("Browser is closed");
			}


}


//Sequence for annotations:
//Before Suite
//Before Test
//Before Class

//Before Method
//Test Case 1
//After Method

//Before Method
//Test Case 2
//After Method

//Before Method
//Test Case 3
//After Method

//After Class
//After Test
//After Suite


