package seleniumFirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.aa.com/homePage.do");
		 
		System.out.println("Successfully opened the website https://www.aa.com/homePage.do");
		 
		 Thread.sleep(5000);
		 
		driver.quit();
	}
	
}
