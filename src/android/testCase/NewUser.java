package android.testCase;

import io.appium.java_client.android.AndroidKeyCode;
import tgfm.Browser;
import tgfm.BrowserFactory;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.TouchAction;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import android.actions.Base;
import android.actions.Cart;
import android.actions.Home;
import android.actions.Login;
import android.actions.OrderReview;
import android.actions.PLV;
import android.actions.Search;

//@Listeners({tgfm.BrowserListener.class})
public class NewUser extends Base {


	
		@Test(enabled=true)
		public void newTest() throws InterruptedException
		{	
			
			
			Login login = new Login();			
			login = login.setElements();
			
			Search search = new Search();			
			search = search.setElements();
			
			PLV plv = new PLV();			
			plv = plv.setElements();			
					
			Cart cart = new Cart();			
			cart = cart.setElements();
			
			OrderReview orderReview = new OrderReview();			
			orderReview = orderReview.setElements();
			
			Home home = new Home();			
			home = home.setElements();			
			home.enviorment("QA");
			
			
			login.login("qa.1@wildtest.com","Jet12345");
			
			
			search.eSearchBar.sendKeys("dog");
			
			androidPressKey("enter");
			
			
			
	
			plv.eAddToCart.click();
			
			//menu.eCart.click();
			
			cart.eProceedToCheckout.click();
			
			Thread.sleep(5000L);
			orderReview.ePlaceOrder.click();
			
			
			
			/*
			

		
			@id/recycler_view
			@id/recycler_view
			id="@id/pager"

			@id/categories_button
			@id/reorder_button
			@id/ar_card


			@id/right_nav_view
			id="@id/design_navigation_view"
			@id/design_menu_item_text text =QA


			text="Create Account"

			text="Login"
			@id/email_edit_text
			@id/password_edit_text
			@id/text_input_password_toggle
			@id/button_login
			@id/button_forgot_password

			@id/view_contact_follow_jet_and_terms
			@id/contact_jet_text_view
			@id/imageview_feedback
			@id/imageview_call
			@id/imageview_rate_us
			@id/imageview_email

			@id/imageview_facebook
			@id/imageview_twitter
			@id/imageview_linkedin
			@id/imageview_instagram

			@id/logout_button
			@id/textview_app_version



			createaccount
			@id/referral_banner
			@id/promo_banner
			@id/email_edit_text
			@id/password_edit_text
			@id/zip
			@id/checkbox_marketing
			@id/button_register
			@id/terms


*/






		}
		
		
	/*	

		 public void swipFromRightOfScreen() throws InterruptedException {
		  //Get the size of screen.
		  org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		  
		  System.out.println(size);
		  
		  //Find swipe start and end point from screen's with and height.
		  //Find startx point which is at right side of screen.		  
		  int startx = (int) (size.width * 0.70);
		  
		  //Find endx point which is at left side of screen.
		  int endx = (int) (size.width * 0.30);
		  
		  //Find vertical point where you wants to swipe. It is in middle of screen height.
		  int starty = size.height / 2;
		  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		  //Swipe from Right to Left.
		  driver.swipe(startx, starty, endx, starty, 3000);
		  //Thread.sleep(2000);

		  //Swipe from Left to Right.
		  //driver.swipe(endx, starty, startx, starty, 3000);
		  //Thread.sleep(2000);
		 }*/
}

