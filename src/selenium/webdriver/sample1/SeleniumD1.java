package selenium.webdriver.sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class SeleniumD1 {
	
	 WebDriver driver;    //(1) a variable called drive of WebDriver type
	 JavascriptExecutor jse;	// (7)interface to run some script through the code . org.openqa.selenium
	 public void invokeBrowser(){  
		 
		 try {
			 // (2) Creating a function to instantiate the driver property
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\ChromeDriver\\chromedriver.exe"); //Using the driver
			 driver = new ChromeDriver();			 //Using driver as the object reference. 
			 driver.manage().deleteAllCookies();     //manage the browser properties. firstly deleting all the cookies
			 driver.manage().window().maximize();	//During this work the window remains half sized. so making it maximized
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//Synchronizing the piece of code with the web browser
			 																	//providing the timeout
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 
			 driver.get("http://www.edureka.co");	// fetch the url for the tested website
			 searchCourse();		// (6)Calling the searchCourse() function
		 	} 
		 
		 
		  catch (Exception e) {  //(3)
		
			 e.printStackTrace();
	}
		 
	 }
	 
	 public void searchCourse(){	// (4)Function to search the course from the website
		 
		 try {
		
			 driver.findElement(By.id("search-inp1")).sendKeys("Java"); //Element locator using id. "search-inp1" is the text-box id and sending the search item = Java as input
			 Thread.sleep(6000); 		// (5)To make the DOM wait for 3 secs
			 driver.findElement(By.id("search-button-bottom")).click();		//Then finding the search button to search the item "Java"
			 jse = (JavascriptExecutor)driver;		// (8)casting driver to executor
			 jse.executeScript("scroll(0,600)");	// (9)It's going to scroll vertically down
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//label[contains(text(), 'Weekend')]")).click();	//Finding the weekend checkbox using firepath and clicking it
			 
		 } 
	 
		 catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 }

	public static void main(String[] args) {
		
		SeleniumD1 con = new SeleniumD1();
		con.invokeBrowser();
	}

}
