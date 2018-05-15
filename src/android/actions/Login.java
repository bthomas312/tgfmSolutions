package android.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;

public class Login extends Base{

	@FindBy(id="email_edit_text")
	public WebElement eEmail;
	
	@FindBy(id="password_edit_text")
	public WebElement ePassword;
	
	@FindBy(id="button_login")
	public WebElement eLogin;
	
	@FindBy(id="text_input_password_toggle")
	public WebElement eShowPassword;
	
	@FindBy(id="button_forgot_password")
	public WebElement eForgotPassword;
	
	@FindBy(className="//contains[text(),'Login']")
	public WebElement eLoginTab;
	//driver.findElement(By.xpath("//contains[text(),“xyz”)
	//@id/sliding_tab_layout
	
	
	public Login setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), Login.class);
	}

	
	public void login(String username, String password) throws InterruptedException {
		
		
			Base menu = new Base();			
			menu = menu.setElements();
			
			click(menu.eAccount);
			
			Thread.sleep(5000L);
			
			androidDismiss();
		
			
			eEmail.sendKeys(username); //"qa.1@wildtest.com"
			ePassword.sendKeys(password); //"Jet12345"
			eLogin.click();
						
			androidDismiss();		 
	}
			
}
