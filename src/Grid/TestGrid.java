package Grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestGrid {
	static WebDriver driver;
	static String nodeUrl;
	public static void main(String[] args) {
		try {
			nodeUrl = "http://192.168.0.100:5555/wd/hub";
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			driver.manage().deleteAllCookies();     //manage the browser properties. firstly deleting all the cookies
			driver.manage().window().maximize();	//During this work the window remains half sized. so making it maximized
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//Synchronizing the piece of code with the web browser
			 																	//providing the timeout
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 
			driver.get("https://www.w3schools.com/");
			driver.findElement(By.xpath("//a[@id='navbtn_references']/i[1]")).click();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
