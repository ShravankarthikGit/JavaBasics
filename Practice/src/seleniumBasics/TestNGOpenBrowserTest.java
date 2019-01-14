package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOpenBrowserTest {

	public static WebDriver driver = null;

	@BeforeMethod
	public void initializeWebDriver() {
		driver = new ChromeDriver();
	}

	@Test
	public void testOpenBrowser() throws InterruptedException {
		driver.get("https://www.aa.com/homePage.do");
		System.out.println("Successfully opened the website https://www.aa.com/homePage.do");
		Thread.sleep(5000);
	}
	
	@Test(enabled = true)
	public void testOpenBrowser2() throws InterruptedException {
		driver.get("https://www.aa.com/homePage.do");
		System.out.println("Successfully opened the website https://www.aa.com/homePage.do");
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
