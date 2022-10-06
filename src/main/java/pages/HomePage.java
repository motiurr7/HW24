package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // PageFactory class help to instantiate WebElement
	}
	// 1st way: Most common way to write the WebElement (@FindBy), you must know how to do that
	
	@FindBy(xpath = "//a[@class= 'nav-logo-link nav-progressive-attribute']")
	WebElement logo;

	
		
	
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	
	
	
}
