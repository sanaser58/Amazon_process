package base;

import static java.time.Duration.ofSeconds;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExamPrep {

	public static void main(String[] args) throws InterruptedException {
		// this is for Firefox Browser ///
				System.setProperty("webdriver.gecko.driver","C:\\Users\\sanme\\eclipse-workspace\\DRIVER\\geckodriver.exe");
				
				// Instantiate the WebDriver object
				WebDriver driver = new FirefoxDriver();
				
				//String url = "https://automationexercise.com/#google_vignette";
				
				String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
				
				//String url = "https://jqueryui.com/droppable/";
				
				//String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
				
				//String url = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
				
				//String url = "https://accounts.google.com/signup/v2/createaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
				
				//String url = "https://demo.guru99.com/test/web-table-element.php";
				driver.get(url);
				
				//  maximizes the browser window
				driver.manage().window().maximize();
				
				// print a message to display the website to opened successfully
				System.out.println("Website Successfully opened.");
			
				
				WebDriverWait wait = new WebDriverWait(driver, ofSeconds(10)); // for wait pack 10 secs
				
				
			//WebElement button=driver.findElement(By.cssSelector("button[id='but2']"));
				
				//WebElement button=driver.findElement(By.name("q"));
				
				//List<WebElement> button=driver.findElements(By.tagName("a"));
				
				//int link = button.size();
				
			
			//button.sendKeys("sam");
				
			//System.out.println(link);
				/*
				//// drag and drop
				driver.switchTo().frame(0);
				
			WebElement sourch = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
			
			WebElement target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
			
			
			Actions obj = new Actions(driver);
			
			obj.dragAndDrop(sourch, target).build().perform();
			
			*/
			/* right click
			Actions obj = new Actions(driver);
			
			WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

				obj.contextClick(rightClick).build().perform();
				
				*/
				/*
				Actions obj = new Actions(driver);
				
				WebElement hoverText = driver.findElement(By.linkText("For Companies"));
				
				obj.moveToElement(hoverText).build().perform();
				
				WebElement subMune = driver.findElement(By.linkText("Hire GA Graduates"));
				
				subMune.click();
				
				
				*/
				
				/*
				WebElement alertPop = driver.findElement(By.xpath("//input[@name='alert']"));
				
				alertPop.click();
				
				Alert name =driver.switchTo().alert();
				
				Thread.sleep(3000);
				
				name.accept();
				
				System.out.println(name.getText());
				
				*/
				
				/*
				// single box
				WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
				
				checkBox.click();
				
*/
				/*
				// multiple checkbox
				List<WebElement> checkBoxs = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'checkBoxOption')]"));
				
				System.out.println("total chekbox:" + checkBoxs.size());
				
				//using for loop
				
				for(int i=0; i<checkBoxs.size(); i++) {
					checkBoxs.get(i).click();
					
				}
				*/
				
				/*
				// single radio button
				WebElement radio = driver.findElement(By.xpath("//input[@value='radio1']"));
				
				radio.click();
				*/
				
				
				WebElement dropDown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
				
				Select drop = new Select(dropDown);
				
				drop.selectByValue("option2");
				
				
				
				/*
				//webTable
				WebElement table= driver.findElement(By.xpath("//table[@class='dataTable']"));
				
				
				List<WebElement> row = table.findElements(By.tagName("tr"));
				
				
				
				List<WebElement> col = row.get(2).findElements(By.tagName("td"));
				
				
				System.out.println(col.get(3).getText());
				*/
				
				
				/*
				WebElement table= driver.findElement(By.xpath("//table[@class='dataTable']"));
				
				
				List<WebElement> row = table.findElements(By.tagName("tr"));
				
				
				for(int i=0; i<row.size(); i++) {
					
					List<WebElement> col = row.get(i).findElements(By.tagName("td"));
					
					for(int j=0; j<col.size();j++) {
						
						System.out.println(col.get(j).getText());
					}
					
				}
				
				*/
				
		
				
				
				
				
				

				
				
			
	}

}
