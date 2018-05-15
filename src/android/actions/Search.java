package android.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;

public class Search extends Base{
	
	@FindBy(id="search_bar")
	public WebElement eSearchBar;
	
	@FindBy(id="search_icon")
	public WebElement eIcon;
	
	@FindBy(id="search_edit_frame")
	public WebElement eEdit;
	
	@FindBy(id="search_src_text")
	public WebElement eText;

	@FindBy(id="search_close_btn")
	public WebElement eClose;
	
	@FindBy(id="search_toolbar")
	public WebElement eToolbar;	
	
	@FindBy(id="place_holder")
	public WebElement eSearchText;
	
	@FindBy(id="barcode_icon")
	public WebElement eBarcode;
	
	public Search setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), Search.class);
	}
}
