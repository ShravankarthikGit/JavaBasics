package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ObjectIdentification {

	public static WebDriver driver = null;

	@BeforeMethod
	@Parameters({"browser"})
	public void initializeWebDriver( @Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 		
		else {
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void testOpenBrowser() throws InterruptedException {
		driver.get("https://www.aa.com/homePage.do");
		System.out.println("Successfully opened the website https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		
		//Capture UI objects using identifiers for automation
		//Enter Origin airport
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.originAirport\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.originAirport\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.originAirport\"]")).sendKeys("PHX");
		
		Thread.sleep(5000);
		
		//Enter destination airport
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).click();
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("LAX");
		
		//Enter no of passengers
		driver.findElement(By.cssSelector("#flightSearchForm\\2e adultOrSeniorPassengerCount")).click();
		driver.findElement(By.cssSelector("#flightSearchForm\\2e adultOrSeniorPassengerCount")).sendKeys("2");
		
		//Enter origin date
		driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]")).sendKeys("01/23/2019");
		
		//Enter return date
		driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]")).sendKeys("01/28/2019");
		
		//Click on Search button
		driver.findElement(By.xpath("//*[@id=\"flightSearchForm.button.reSubmit\"]")).click();
		
		Thread.sleep(5000);
	}

	//@Test(enabled = true)
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
