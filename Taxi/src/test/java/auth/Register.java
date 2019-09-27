package auth;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class Register extends Base {

	public void inscription() throws InterruptedException
	{
		
		/* MobileElement el2 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el4.click();
*/
		System.out.print("done splash"); 
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]\n" + 
	"")).click();
	    Thread.sleep(500);
	
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]\n" + 
	    	 	"")).sendKeys("azerty");	
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]\n" + 
	 	"")).sendKeys("azerty");
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]\n" + 
			 	"")).sendKeys("testt@gmail.com");
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]\n" + 
			 	"")).sendKeys("testt@gmail.com");
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[5]\n" + 
			 	"")).sendKeys("12345678");
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[6]\n" + 
			 	"")).sendKeys("testt@gmail.com");
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[7]\n" + 
			 	"")).sendKeys("123456789");
	
	
/*
	MobileElement el6 = (MobileElement) driver.findElement(By.id("tn.anypli.taxi216.debug:id/editTextLastNameRegister"));
	el6.sendKeys("test");
	MobileElement el7 = (MobileElement) driver.findElement(By.id("tn.anypli.taxi216.debug:id/editTextMailRegister"));
	el7.sendKeys("test@gmail.com");
	MobileElement el8 = (MobileElement) driver.findElement(By.id("tn.anypli.taxi216.debug:id/editTextPhoneNumberRegister"));
	el8.sendKeys("12345678");
	MobileElement el9 = (MobileElement) driver.findElement(By.id("tn.anypli.taxi216.debug:id/editTextPlateNumberRegister"));
	el9.sendKeys("123456789");
	 MobileElement el10 = (MobileElement) driver.findElement("android:id/text1");
	el10.sendKeys("Sfax");
	MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup");
	el11.click();
	MobileElement el12 = (MobileElement) driver.findElement("android:id/navigationBarBackground");
	el12.click();
	MobileElement el13 = (MobileElement) driver.findElement("tn.anypli.taxi216.debug:id/spinnerCitiesRegister");
	el13.click();
	MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	el14.click();
	MobileElement el15 = (MobileElement) driver.findElement("tn.anypli.taxi216.debug:id/editTextPassworRegister");
	el15.sendKeys("12345678");
	MobileElement el16 = (MobileElement) driver.findElement("android:id/navigationBarBackground");
	el16.click();
	MobileElement el17 = (MobileElement) driver.findElement("android:id/navigationBarBackground");
	el17.click();
	MobileElement el18 = (MobileElement) driver.findElement("tn.anypli.taxi216.debug:id/editTextPassworConfirmRegister");
	el18.sendKeys("12345678");
	MobileElement el19 = (MobileElement) driver.findElement("tn.anypli.taxi216.debug:id/editTextPassworConfirmRegister");
	el19.click();
	MobileElement el20 = (MobileElement) driver.findElement("tn.anypli.taxi216.debug:id/imageToolbarEndActionIcon");
	el20.click();
*/	
	
	}
}
