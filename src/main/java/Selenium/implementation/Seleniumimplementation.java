package Selenium.implementation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Seleniumimplementation {
	
	
	Actions action;
	
	public void performmouseover(WebElement element, WebDriver driver) {
		
		
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
	public void click(WebElement element) {
		
		element.click();
	}
	
	public void clear(WebElement element) {
		
		element.clear();
	}
	
	public void settext(String text,WebElement element) {
		element.sendKeys(text);
	}
	
	public void selectbyvisibletext(WebElement  dropdownexample, String text) {
		
		Select se =new Select(dropdownexample);
		se.selectByVisibleText(text);
	}
	
public void clickusingjavascriptexecutor(WebElement element, WebDriver driver) {
	
	JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", element);	
		
	}

public void refresh(WebDriver driver) {
	
	driver.navigate().refresh();
}

public boolean validatetext(WebDriver driver, WebElement element,String expectedText) {
	
	String observedtext= element.getText();
	if(observedtext.equals(expectedText)) {		
		return true;
	}
	return false;
}

}
