package tgfm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;


public class Keywords extends Utilities {
	
	//global elements

//	public static String URL =  "https://batman.qa.jet.com/";
	
	//static String URL =  "https://jet.com/";
	   

	   
		@FindBy(css = ".search_form .tt-input")
		public static WebElement searchInput;
	   
		@FindBy(css = ".loader.centered.loader_32")
		public static WebElement spinner;
		
    
	protected static void type(WebElement we, String text) throws InterruptedException {
    	we.clear();
    	Thread.sleep(200L);
        we.sendKeys(text);
        Thread.sleep(200L);
        
        }
    
	protected static String getURL() throws InterruptedException {
		
    	return Browser.getBrowser().getCurrentUrl();
    	
        }
    
	

	protected static void androidPressKey(String keyCode) throws InterruptedException	
	{
		int key = AndroidKeyCode.ENTER; //default to enter
		
		if (keyCode.toUpperCase().equals("ENTER"))
		{
			key=AndroidKeyCode.ENTER;
		}
			
		((PressesKeyCode) Browser.getBrowser()).pressKeyCode(key);
		
	}
	

	
	
	
	protected static void androidDismiss() throws InterruptedException
	{
			Thread.sleep(1000L);			
			org.openqa.selenium.Dimension size = Browser.getBrowser().manage().window().getSize();
			
			TouchAction touchAction = new TouchAction((PerformsTouchActions) Browser.getBrowser());			
			touchAction
				.press(1, size.height-1)
				.release()
				.perform();			
			Thread.sleep(1000L);
	}		
			
	protected static void androidSwipFromRight() throws InterruptedException {
			Thread.sleep(1000L);			
			org.openqa.selenium.Dimension size = Browser.getBrowser().manage().window().getSize();
			TouchAction touchAction = new TouchAction((PerformsTouchActions) Browser.getBrowser());	
			touchAction
					.press(size.width-1, 200)
					.waitAction()
					.moveTo(size.width-400, 200)
					.release()
					.perform();				
			Thread.sleep(1000L);
	}
	
    protected static void click(WebElement we) throws InterruptedException {
    	isClickable(we);
    	Thread.sleep(2000L);
        try{ we.click(); } catch (WebDriverException e)
        {
        	Thread.sleep(2000L);
        	isClickable(we);
        	try{ we.click(); } catch (WebDriverException e1)
        	{
        		Thread.sleep(2000L);
            	isClickable(we);            	
        	}
        }
        
        }

    
    protected static void isClickable(WebElement we) {
     new WebDriverWait(Browser.getBrowser(),30).until(ExpectedConditions.elementToBeClickable(we));
    }
    
    protected static void wait(WebElement we) throws InterruptedException {
//        if (we.isDisplayed()) //need t0 change to an explicit wait
  //      {
        //	System.out.println(we + " is on the page so we will stop looking");
        	new WebDriverWait(Browser.getBrowser(), 60).until(ExpectedConditions.visibilityOf(we));
    //    }
        
      //  else
        //{
        	
        //	System.out.println(we + " is not on the page so we will keep looking");
        //	wait(we);
        	
        //}
        
        }

    

    protected static void gotoURL(String URL) {
    	Browser.getBrowser().navigate().to(URL);
    	
        }
    
    
    protected static void validateText(WebElement we, String value) throws InterruptedException {
    	
    	Thread.sleep(2000L);  //will need to change this to am emplicted wait 
    	String textCheck = we.getText();
    	
    	System.out.println(textCheck + " was found in the element.");
    	
    	if (textCheck.contains(value)){
    		System.out.println(value + " matched");
    	}
    	else {
    		System.out.println(value + " did not match");
    	}
    	
        }

    protected static String getElementText(WebElement we) throws InterruptedException {
    	
    	Thread.sleep(2000L);  //will need to change this to am emplicted wait 
    	String textValue = we.getText();
    	
    	System.out.println(textValue + " was found in the element.");
    	
    	return textValue;
    	
        }


    
    protected void search(String term) throws InterruptedException {
       	
       	type(searchInput, term);
       	searchInput.sendKeys(Keys.RETURN);     
       	
       }
    

    
}
