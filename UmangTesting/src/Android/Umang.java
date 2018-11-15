package Android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;


	public class Umang {

	//private static final RemoteWebDriver je = null;
		 static WebDriver driver;
		//Dimension size;
		
		

		 @BeforeTest
		 public void setUp() throws MalformedURLException {
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", "29b6dc16");
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		  capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("unicodeKeyboard", true);
		  capabilities.setCapability("resetKeyboard", true);
		  //capabilities.setCapability("fastReset", "true");
		  //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
		  capabilities.setCapability("appPackage", "in.gov.umang.negd.g2c.staging");
		  capabilities.setCapability("appActivity", "in.spicedigital.umang.activities.SplashScreen");

		 
		  driver = new RemoteWebDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  
		  
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  
		 }
		 
		 @AfterTest
		 public void quitDriver()
		 {
			 driver.quit();
		 }
		 
		 @AfterSuite
		 public void generatereport() throws Exception
		 {
			 Xl.generateReport("Report Excel.xlsx");
		 }
  }
	

			
				
				

		 
	
	


