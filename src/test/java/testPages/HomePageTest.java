package testPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	@Test (enabled=false)
	public void logoTest() throws InterruptedException {
		homePage.logoDisplayed();
		Thread.sleep(3000);
		}
	
	@Test (enabled = false)
	public void dropdown_selectByIndex_method01() throws InterruptedException {
		
		WebElement dropElement = driver.findElement(By.name("url"));
		Select select1 = new Select(dropElement);
		select1.selectByIndex(3);
		Thread.sleep(3000);
		}
		// Dropdown 
		@Test (enabled = false)
		public void dropdown_selectByIndex_method02() throws InterruptedException {
			
			WebElement dropElement = driver.findElement(By.name("url"));
			Select select2 = new Select(dropElement);
			select2.selectByVisibleText("Amazon Devices ");
			Thread.sleep(3000);
			}
		@Test (enabled = false)
		public void dropdown_selectByIndex_method03() throws InterruptedException {
			
			WebElement dropElement = driver.findElement(By.name("url"));
			Select select3 = new Select(dropElement);
			select3.selectByValue("search-alias=amazonfresh");
			Thread.sleep(3000);
			}
		
		// Hover Over Action
		
		@Test(enabled=false)
		public void mouseHoverAction01() throws InterruptedException{
			Actions actions = new Actions(driver);
			 //WebElement HelloSignIn =  driver.findElement(By.xpath("//a[@id='icp-nav-flyout"));
			 WebElement HelloSignIn =driver.findElement(By.id("icp-nav-flyout"));
			 Thread.sleep(3000);
			 actions.moveToElement(HelloSignIn).build().perform();
			 Thread.sleep(3000);
 
		}
		
		//Assertion
		//assertTrue = true and it will pass
		@Test (enabled=false)
		public void logoTest01() throws InterruptedException {
				WebElement logoElement = driver.findElement(By.xpath( "//a[@class= 'nav-logo-link nav-progressive-attribute']"));
				boolean flag = logoElement.isDisplayed();
				//System.out.print("Is the logo Displayed? /n Ans: "+flag);
				Assert.assertTrue(true, "Can't find the logo");//error massage is appeared when assertion is wrong
		}
		
		// assertTrue = false and error message will appear
		@Test (enabled=false)
		public void logoTest02() throws InterruptedException {
				WebElement logoElement = driver.findElement(By.xpath( "//a[@class= 'nav-logo-link nav-progressive-attribute']"));
				boolean flag = logoElement.isDisplayed();
				//System.out.print("Is the logo Displayed? /n Ans: "+flag);
				Assert.assertTrue(false, "Can't find the logo");
		}
		
		// assertFalse = false and it will pass
		@Test (enabled=false)
		public void logoTest03() throws InterruptedException {
				WebElement logoElement = driver.findElement(By.xpath( "//a[@class= 'nav-logo-link nav-progressive-attribute']"));
				boolean flag = logoElement.isDisplayed();
				//System.out.print("Is the logo Displayed? /n Ans: "+flag);
				Assert.assertFalse(false, "Can't find the logo");
		}
		
		// assertFalse = true and it will not pass and give the error message
		@Test (enabled=false)
		public void logoTest04() throws InterruptedException {
				WebElement logoElement = driver.findElement(By.xpath( "//a[@class= 'nav-logo-link nav-progressive-attribute']"));
				boolean flag = logoElement.isDisplayed();
				//System.out.print("Is the logo Displayed? /n Ans: "+flag);
				Assert.assertFalse(true, "Can't find the logo");
		}
		
		//title test
		@Test(enabled = false)
		public void use_of_getTitle_method01() {
			  
			System.out.println("The title of the Pase is: " + driver.getTitle());
		}
		//title assertion
		@Test(enabled = true)
		public void use_of_getTitle_method_use_assertation() {
			String expected = "Amazon.com. Spend less. Smile more.";
			String actual = driver.getTitle();
			//System.out.println("The title of the Pase is: " + driver.getTitle());
			Assert.assertEquals(actual, expected, "Title Doesn't match");
		}
		
		
		
}