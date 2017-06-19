package selenium.webdriver.sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	
	WebDriver driver;
	public void invokeBrowser(){
		// (2) Creating a function to instantiate the driver property
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\ChromeDriver\\chromedriver.exe"); //Using the driver
		 driver = new ChromeDriver();			 //Using driver as the object reference. 
		 driver.manage().deleteAllCookies();     //manage the browser properties. firstly deleting all the cookies
		 driver.manage().window().maximize();	//During this work the window remains half sized. so making it maximized
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//Synchronizing the piece of code with the web browser
		 																	//providing the timeout
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 callGetCommands();
		 
		
	}
	
	 public void callGetCommands(){
		
		 try {
			driver.get("https://amazon.com");
			 String titleOfThePage = driver.getTitle();
			 System.out.println("Title of the page is: " +titleOfThePage);		//prints the title of the page
			 driver.findElement(By.linkText("Sell")).click();;
			 String currentUrl = driver.getCurrentUrl();
			 System.out.println("The current URL is: " +currentUrl);	//prints the current page url
			 //System.out.println("The current page source is: " + driver.getPageSource());	//get the page source of the current page
			 
		} 
		 catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		TestGetCommands con1 = new TestGetCommands();
		con1.invokeBrowser();

	}

}
