package Com.Qa.Automationpractise.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Qa.Automationpractise.pages.AddToCartPage;

public class AddToCartTest {
	WebDriver driver;
	AddToCartPage page;
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		page= new AddToCartPage(driver);
	
	}
	
	@Test
	
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToCart(driver));
	}

}
