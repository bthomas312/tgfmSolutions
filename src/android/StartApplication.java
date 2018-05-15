package android;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import tgfm.Browser;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.TouchAction;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import android.actions.Base;
import android.actions.Cart;
import android.actions.Home;
import android.actions.Login;
import android.actions.OrderReview;
import android.actions.PLV;
import android.actions.Search;


public class StartApplication {


		private static AndroidDriver driver;
		
		 
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
			/*File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/App/");
			File app = new File(appDir, "app-staging.apk");
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "Nexus 4");
			capabilities.setCapability("platformVersion", "5.0.1");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.jet.jet.staging");
			capabilities.setCapability("appActivity", "com.jet.baselib.activities.RootActivity");
			
 
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);			
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	*/
			
	//		WebElement eCategories = driver.findElement(By.name("android.support.v7.widget.AppCompatImageButton"));
			
			Base menu = new Base();			
			menu = menu.setElements();
			
			
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
			
			Thread.sleep(1000L);			
			TouchAction touchAction = new TouchAction((PerformsTouchActions) Browser.getBrowser());
			
			touchAction
				.press(100, 100)
				.release()
				.perform();
			
			Thread.sleep(1000L);
			
			Thread.sleep(1000L);			
			org.openqa.selenium.Dimension size = Browser.getBrowser().manage().window().getSize();
				
			touchAction
					.press(size.width-1, 200)
					.waitAction()
					.moveTo(size.width-400, 200)
					.release()
					.perform();
				
			Thread.sleep(1000L);
			
			
			home.eQA.click();
			
			Thread.sleep(1000L);
			
			touchAction
				.press(100, 100)
				.release()
				.perform();
			
			Thread.sleep(1000L);
			
			
			menu.eAccount.click();
			
			Thread.sleep(5000L);
			
			touchAction
				.press(100, 100)
				.release()
				.perform();
			
		
			
			login.eEmail.sendKeys("qa.1@wildtest.com");
			login.ePassword.sendKeys("Jet12345");
			login.eLogin.click();
						
			Thread.sleep(10000L);			
			touchAction.press(100, 100).release().perform();
			Thread.sleep(1000L);
					 

			menu.eSearch.click();
			
			search.eSearchBar.sendKeys("dog");
			((PressesKeyCode) Browser.getBrowser()).pressKeyCode(AndroidKeyCode.ENTER);
			
	
			plv.eAddToCart.click();
			
			menu.eCart.click();
			
			cart.eProceedToCheckout.click();
			
			Thread.sleep(5000L);
			orderReview.ePlaceOrder.click();
			
		//	driver.quit();

	}
		
		@org.testng.annotations.Test
		public static void newTest()
		{/*
			

		
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

