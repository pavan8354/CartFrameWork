package Com.Qa.Automationpractise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.implementation.Seleniumimplementation;

public class AddToCartPage {
	
	@FindBy(xpath="/html/body/div/div/div[1]/div/div[1]/div[1]/img")
	WebElement itempage;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div/div[2]/div[2]/input")
	WebElement textquantity;
	@FindBy(xpath="/html/body/div/div/div[1]/div/div[2]/div[3]/button")
	WebElement btnaddtocart;
	@FindBy(css="div[class='cart-preview active'] button[type='button']")
	WebElement btncheckout;
	@FindBy(xpath="//button[normalize-space()='Place Order']")
	WebElement btnplaceorder;
	@FindBy(xpath="//div[@class='wrapperTwo']//div//select")
	WebElement btnchoosecountry;
	@FindBy(xpath="//input[@class='chkAgree']")
	WebElement btncheckbox;
	@FindBy(xpath="//button[normalize-space()='Proceed']")
	WebElement proceed;
	@FindBy(xpath="//div[@class='brand greenLogo']")
	WebElement homepage;
	
	Seleniumimplementation selenium;
	public AddToCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		selenium = new Seleniumimplementation();
	}
	
	public boolean validateAddToCart(WebDriver driver) {
		selenium.performmouseover(itempage, driver);
		selenium.clear(textquantity);
		selenium.settext("3", textquantity);
		selenium.click(btnaddtocart);
		selenium.clickusingjavascriptexecutor(btncheckout, driver);
		selenium.click(btnplaceorder);
		selenium.selectbyvisibletext(btnchoosecountry, "India");
		selenium.click(btncheckbox);
		selenium.click(proceed);
		selenium.refresh(driver);
		selenium.validatetext(driver, homepage, "GREEN");
		return false;
	}
	
	
	
	

}
