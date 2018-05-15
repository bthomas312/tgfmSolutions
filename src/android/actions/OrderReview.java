package android.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;

public class OrderReview extends Base{

	@FindBy(id="button_place_order")
	public WebElement ePlaceOrder;
	
	/*
	 @id/
	 @id/visaCheckoutButton
	 @id/change_address
	 @id/add_shipping
	 @id/choose_shipping
	 @id/change_payments
	 @id/choose_payment
	 @id/add_payment
	 @id/jet_cash_switch
	 @id/jet_credits_switch
	 @id/starting_subtotal @id/value	 
	 @id/jet_extra_savings @id/value	 
	 @id/list_itemized_promo @id/value
	 @id/subtotal @id/value	  
	 @id/shipping_fee @id/value
	 @id/shipping_savings @id/value
	 @id/tax -@id/value
	 @id/order_total - @id/value
	 @id/cart_promo_edittext
	 @id/promo_apply
	*/
	
	public OrderReview setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), OrderReview.class);
	}
	
	
	
}
