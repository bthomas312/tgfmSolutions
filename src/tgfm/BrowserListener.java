package tgfm;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class BrowserListener extends Utilities implements IInvokedMethodListener {

	@Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		print("info","start beforeInvocation in browser");
		
        if (method.isTestMethod()) {						
        	
            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
            
            print("info","browser is a testMethod" + browserName);
            
            WebDriver driver = null;
            try {
				driver = BrowserFactory.createInstance(browserName);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Browser.setWebDriver(driver);
        }
    }
 
    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            WebDriver driver = Browser.getBrowser();
            if (driver != null) {
              //  driver.quit();
            }
        }
    }
	
}