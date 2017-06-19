package selenium.webdriver.sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommands {
	
	WebDriver driver;
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
			 navigateCommands();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		} 	
		
		}
		
	 public void navigateCommands(){
		
		try {
			 driver.navigate().to("https://www.flipkart.com/");
			 driver.findElement(By.xpath("//span[contains(text(), 'Appliances')]")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//span[contains(text(), 'Microwave Ovens')]")).click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(5000);
			 driver.navigate().forward();
			 driver.navigate().refresh();	//refreshes the browser
			} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		
		
	}
	

	public static void main(String[] args) {
		TestNavigateCommands con2 = new TestNavigateCommands();
		con2.invokeBrowser();

	}

}
