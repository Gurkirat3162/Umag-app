package Time;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TimeCheck {

	WebDriver driver;
	//public static void main(String[] args) {
		
			 @BeforeTest
			 public void setUp() throws MalformedURLException {
			
			  DesiredCapabilities capabilities = new DesiredCapabilities();
			  capabilities.setCapability("deviceName", "");
			  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		      capabilities.setCapability(CapabilityType.VERSION, "8.0.0");
			  capabilities.setCapability("platformName", "Android");
	//		  capabilities.setCapability("unicodeKeyboard", true);
			  capabilities.setCapability("resetKeyboard", true);
			  //capabilities.setCapability("fastReset", "true");
			  //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
			  capabilities.setCapability("appPackage", "in.gov.umang.negd.g2c.staging");
			  capabilities.setCapability("appActivity", "in.spicedigital.umang.activities.SplashScreen");

			 
			  driver = new RemoteWebDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			  
			  
			  
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  
			  
			 }
			 
			 @Test
		 		public  void Clickapp() throws Exception {
					
				 
				 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/cb_i_agree")).click();
		 		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();*/
		 		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/loginImg")).click();
		 		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/loginTxt")).click();
			 }
			 
			 
			 @Test
			 	public void Entercredentials()
			 	{
				 
				 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/loginTxt")).click();
		 		 //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 		 //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 		 //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/mobile_num_input_fld")).sendKeys("9592787051");
		 		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/mpin_input_fld")).sendKeys("5555");
			 	}
			 
			 @Test
			 	public void logintime() throws InterruptedException
			 	{
				 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/login_btn")).click();
				 long start = System.currentTimeMillis();
				 //long finish = 0L;

				// driver.get("Some url");

				// WebElement ele = driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/bannerImg"));
				 //long finish = System.currentTimeMillis();
				 
				 WebElement tile = driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/categoryLay"));
				 
				 while (!tile.isDisplayed()) {
					 Thread.sleep(500);
				 }
				 
				 long finish = System.currentTimeMillis();
				 
				 long totalTime = finish - start; 
				 System.out.println("Total Time for page load - "+totalTime);
				 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/bannerImg")).click();
		 		
			 	

					 }

				/*@Test
			 	public void thome_page()
			 	{
					
					driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/categoryLay")).click();
			 		driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/moreTxt")).click();
			 		driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/categoryTitleTxt")).click();
					driver.findElement(By.name("National Consumer Helpline")).click();
			 		driver.findElement(By.className("android.view.View")).click();
			 		driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/serviceImg")).click();
				 
			 	}*/
				
			 
			 
			/* @AfterTest
			 public void quitDriver()
			 {
				 driver.quit();
			 }*/
			 
			 @AfterSuite
			 public void generatereport() throws Exception
			 {
				 Xl.generateReport("Time-Excel.xlsx");
			 }
	}


