package android.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;

public class Cart extends Base{

	@FindBy(id="button_proceed_to_checkout")
	public WebElement eProceedToCheckout;
	
	/*@id/order_total
	@id/cold_pack
	@id/click_item_container
	@id/row_image
	@id/smart_item
	@id/now_text
	@id/deal_text
	@id/price
	@id/unit_price
	@id/saving_flipper
	@id/quantity_selector_down
	@id/quantity_selector_up
	@id/quantity_count
	@id/remove
	@id/save_for_later
	@id/list_promos_applied
	@id/snackbar_text
	@id/snackbar_action
	*/
	
	public Cart setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), Cart.class);
	}
	
	
	
}
