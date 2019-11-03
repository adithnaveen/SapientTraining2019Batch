package training.sapient.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.sapient.pom.LoginPOM;
import training.sapient.utility.DriverFactory;
import training.sapient.utility.DriverNames;

public class LoginTest {


	private String url; 
	private WebDriver webDriver; 
	private LoginPOM loginPom; 
	@Before
	public void setUp() {
		webDriver = DriverFactory.getDriver(DriverNames.CHROME);
		url  = "http://elearning.ohbreaks.com/";
		loginPom = new LoginPOM(webDriver); 
	}
	
	
	@Ignore
	@Test
	public void loginTest() throws InterruptedException{
		// open the browser (Chrome) 
		webDriver.get(url);
		
		// TODO 
		String loginBtn = "login_main_btn"; 
		String userNameLocator ="//*[@id=\"log_in_form\"]/form/div[1]/div[2]/input"; 
		String passwordLocator = "//*[@id=\"log_in_form\"]/form/div[2]/input"; 
		String signInLocator="//*[@id=\"log_in_form\"]/form/div[4]/div[1]/button"; 
		
		// eventually come from db / excel 
		String userName = "admin"; 
		String password ="admin@123"; 
		
		
		
		webDriver.findElement(By.id(loginBtn)).click(); 
		
		webDriver.findElement(By.xpath(userNameLocator)).clear();
		webDriver.findElement(By.xpath(userNameLocator)).sendKeys(userName);
		
		webDriver.findElement(By.xpath(passwordLocator)).clear();
		webDriver.findElement(By.xpath(passwordLocator)).sendKeys(password);
		
		webDriver.findElement(By.xpath(signInLocator)).click();
		
		Thread.sleep(2000);
		
		String loggedUserNameLocator="//*[@id=\"main_page\"]/header/div/div/div[2]/div/div/div/div[2]/p"; 
		
		String loggedInUserName = webDriver.findElement(By.xpath(loggedUserNameLocator)).getText(); 
		System.out.println(loggedInUserName);
		
	}
	
	
	
	@Test
	public void loginTestPom() throws InterruptedException{
		
		webDriver.get(url);
		
		loginPom.clickLoginButtonOnHeader();
		loginPom.sendUserName("admin");
		loginPom.sendPassword("admin@123");
		loginPom.clickLoginButton();
		
		Assert.assertEquals("Gordan", loginPom.getLoggedInUserName());
	}
	
	
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		
		webDriver.close();
	}

}





