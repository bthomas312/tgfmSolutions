package android.actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tgfm.Browser;

public class Home extends Base{

	@FindBy(xpath="//*[@text='QA']")
	public WebElement eQA;
	
	
	public Home setElements() 
	{
		return PageFactory.initElements(Browser.getBrowser(), Home.class);
	}
	
	public void enviorment(String env) throws InterruptedException {
			
		androidDismiss();
		androidSwipFromRight();
		
		if(env.equals("QA")){
				eQA.click();
		}
		
		else {
			eQA.click();
		}
					
		androidDismiss();
		
	}
}
