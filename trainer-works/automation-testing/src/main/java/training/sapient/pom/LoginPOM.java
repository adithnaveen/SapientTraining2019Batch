package training.sapient.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "login_main_btn")
	private WebElement loginBtn; 
	
	@FindBy(xpath = "//*[@id=\"log_in_form\"]/form/div[1]/div[2]/input")
	private WebElement inputUserName; 
	
	@FindBy(xpath = "//*[@id=\"log_in_form\"]/form/div[2]/input")
	private WebElement inputPassword; 
	
	@FindBy(xpath = "//*[@id=\"log_in_form\"]/form/div[4]/div[1]/button" )
	private WebElement clickLoginBtn ;
	
	@FindBy(xpath = "//*[@id=\"main_page\"]/header/div/div/div[2]/div/div/div/div[2]/p")
	private WebElement loggedInUser; 
	
	
	
	public void clickLoginButtonOnHeader() {
		this.loginBtn.click(); 
	}
	
	public void sendUserName(String userName) {
		this.inputUserName.clear(); 
		this.inputUserName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.inputPassword.clear(); 
		this.inputPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		this.clickLoginBtn.click(); 
	}
	
	public String getLoggedInUserName() {
		return this.loggedInUser.getText(); 
	}
	
	
	
}








