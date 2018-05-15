package android.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;
import tgfm.Keywords;

public class Base extends Keywords{
	
	@FindBy(id="menu_home")
	public WebElement eHome;
	
	@FindBy(id="menu_account")
	public WebElement eAccount;
	
	@FindBy(id="menu_cart")
	public WebElement eCart;
	
	@FindBy(id="menu_categories")
	public WebElement eSearch;
	
	public Base setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), Base.class);
	}
	
	
	
	
}
