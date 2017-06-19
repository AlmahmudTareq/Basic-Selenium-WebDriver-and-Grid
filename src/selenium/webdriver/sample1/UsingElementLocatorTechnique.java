package selenium.webdriver.sample1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingElementLocatorTechnique {
	
	WebDriver driver;
	public void invokeBrowser(String url){
		try {
			
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\ChromeDriver\\chromedriver.exe"); 
			 driver = new ChromeDriver();			 
			 driver.manage().deleteAllCookies();     
			 driver.manage().window().maximize();	
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);														
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 driver.get(url);
			} 
		catch (Exception e) {
			
			e.printStackTrace();
		} 	
		
		}
	 public void ElementLocatorTechniqueUsingAmazon(){
		try {
			invokeBrowser("http://www.facebook.com");
			
		/*	invokeBrowser("http://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptops");	//id
			driver.findElement(By.className("nav-input")).click();	//class name
			
			String originalHandle = driver.getWindowHandle();
			
			driver.findElement(By.xpath("//li[@id='result_0']/div/div[2]/div/a/h2")).click();	//Xpath
			Thread.sleep(6000);
			 for(String handle : driver.getWindowHandles()) //This code closes all the tabs except the first tab
			 	{
			        if (!handle.equals(originalHandle)) 
			        {
			            driver.switchTo().window(handle);
			            driver.close();
			        }
			    }

			 	driver.switchTo().window(originalHandle);
			 	
			 Thread.sleep(3000);
			 driver.navigate().back(); 
			 
			driver.findElement(By.linkText("Your Amazon.in")).click();	//using link text
			Thread.sleep(3000);
			driver.navigate().back();	
			
			driver.findElement(By.partialLinkText("Today's")).click();	//using partial link text
			Thread.sleep(3000);
			driver.navigate().back();	*/
			
			} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}	
	public void ElementLocatorTechniqueUsingFacebook(){
		
		try {
			//driver.get("https://www.facebook.com/");
		/*	driver.findElement(By.name("firstname")).sendKeys("Almahmud");	//using name
			driver.findElement(By.name("lastname")).sendKeys("Tareq");
			
			driver.findElement(By.cssSelector("input#email")).sendKeys("almahmud@gmail.com");	//using css selector technique
			Thread.sleep(1000);
			
			driver.navigate().to("http://www.amazon.in");			//relative xpath
			driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[@class='nav-line-2'] ")).click();
			
			Thread.sleep(2000);	*/
			
			driver.navigate().to("https://www.yatra.com/");		//selecting the may 30 from the return date
			driver.findElement(By.xpath("//li[@id='BE_flight_ret_cal']/input[@id='BE_flight_return_date']")).click();
			driver.findElement(By.xpath("//div[@id='PegasusCal-0-month-5-2017']/div/table/tbody/tr[5]//td[@id='td_2017_5_30']/a[@id='a_2017_5_30']")).click();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	

	public static void main(String[] args) {
		
		UsingElementLocatorTechnique con3 = new UsingElementLocatorTechnique();
		con3.ElementLocatorTechniqueUsingAmazon();
		con3.ElementLocatorTechniqueUsingFacebook();

	}

}
