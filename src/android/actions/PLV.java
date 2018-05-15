package android.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;

public class PLV extends Base{
	
	
	@FindBy(id="add_to_cart_button")
	public WebElement eAddToCart;
	
	/*
	@FindBy(id="menu_close")
	public WebElement e;	
	
	@FindBy(id="smart_item")
	public WebElement e;
	
	@FindBy(id="cold_pack")
	public WebElement e;

	@FindBy(id="my_faves_icon")
	public WebElement e;
	
	@FindBy(id="row_image")
	public WebElement e;
	
	@FindBy(id="row_title")
	public WebElement e;
	
	//text="Babyganics All Purpose Surface Wipes, 75 Wipes"
	@FindBy(id="view_reviews")
	public WebElement e;
	
	@FindBy(id="row_two_day")
	public WebElement e;
	
	@FindBy(id="list_price")
	public WebElement e;
	
	@FindBy(id="item_started_price")
	public WebElement e;
	
	@FindBy(id="prices_container")
	public WebElement e;
	
	@FindBy(id="item_now_text")
	public WebElement e;
	
	@FindBy(id="main_price")
	public WebElement e;
	
	@FindBy(id="deal_off_percent")
	public WebElement e;
	
	@FindBy(id="unit_price")
	public WebElement e;
	
	@FindBy(id="min_quantity")
	public WebElement e;
	
	@FindBy(id="add_to_cart_vf")
	public WebElement e;
	

	@FindBy(id="quantity_selector")
	public WebElement e;
	
	@FindBy(id="icon_down")
	public WebElement e;
	
	@FindBy(id="icon_up")
	public WebElement e;
	
	@FindBy(id="quantity_count")
	public WebElement e;
	
	@FindBy(id="text_unavailable")
	public WebElement e;
	
	@FindBy(id="more_options")
	public WebElement e;

	*/
	
	
	public PLV setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), PLV.class);
	}
		

}
