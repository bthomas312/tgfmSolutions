package tgfm;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
 
public class BrowserFactory extends Utilities {
    public static WebDriver createInstance(String browserName) throws MalformedURLException {
        WebDriver theBrowser = null;
        
        print("info","creating ["+browserName+"] as the new browser");
        
        
        
        if (browserName.toLowerCase().contains("firefox")) {
        	//FirefoxProfile profile = new FirefoxProfile();
        	  
        	  ProfilesIni firProfiles = new ProfilesIni();        	  
        	  FirefoxProfile wbdrverprofile = firProfiles.getProfile("Jet");        	  
        	  theBrowser = new FirefoxDriver();
        	 
        	//profile.setPreference("browser.download.foldersList", 2);
            //theBroswser = new FirefoxDriver(profile);
            theBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return theBrowser;
        }
        else if (browserName.toLowerCase().contains("internet")) {
            theBrowser = new InternetExplorerDriver();
            theBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return theBrowser;
        }
        else if (browserName.toLowerCase().contains("chrome")) {
            theBrowser = new ChromeDriver();
            theBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return theBrowser;
        }
        
        
        else if(browserName.toLowerCase().contains("android")) {
        	
        	//where to get the file from, this is just for one app right now so no need to pass this around        	
        	File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/App/");
			File app = new File(appDir, "app-staging-debug.apk");
			
			//what device will we be running on , will need to change this to some xml param
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "Nexus 4");
			capabilities.setCapability("platformVersion", "5.0.1");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.jet.jet.staging");
			capabilities.setCapability("appActivity", "com.jet.baselib.activities.RootActivity");
			
 
			theBrowser = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);			
			theBrowser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        	
        	return theBrowser;
        }
        
        System.out.print("no Browser was sent in to open");
        
        return theBrowser;
    }
}


