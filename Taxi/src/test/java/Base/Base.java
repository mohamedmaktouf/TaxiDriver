package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileBy;


public class Base {
	public static WebDriver driver;

	
	
	@BeforeSuite
	 public void setUp() throws MalformedURLException, InterruptedException  {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "My Phone");
	    desiredCapabilities.setCapability("udid", "H8W0215B12000852");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "6.0");
	    desiredCapabilities.setCapability("appPackage", "tn.anypli.taxi216.debug");
	    desiredCapabilities.setCapability("appActivity", "tn.anypli.taxi216.ui.splash.SplashActivity");
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	    allowAppPermission();
	    Thread.sleep(1000);	 
	
	  }
	public void allowAppPermission(){
		 while (driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\n" + 
		 		"")).size()>0) 

		 {  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\n" + 
		 		"")).click();
		 }
		}	
}
