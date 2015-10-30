package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid_2 {

		WebDriver driver;
		String baseUrl, nodeURL;
		
		@BeforeTest
		public void setup() throws MalformedURLException {
			baseUrl = "https://ss-t.vspl.net/zoptusmobilityUAT";
			nodeURL = "http://192.168.1.52:5566/wd/hub";
 
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeURL), capability);
		}
		
		@AfterTest
		public void aftrtest(){
			driver.quit();
		}
		
		@Test
		public void simpleTest() throws InterruptedException{
			driver.get(baseUrl);
			Thread.sleep(3000);
			driver.findElement(By.id("cphContent_txtUserName")).sendKeys("balajioptus");
			Thread.sleep(3000);
			driver.findElement(By.id("cphContent_txtPassword")).sendKeys("password");
			Thread.sleep(3000);
			driver.findElement(By.id("cphContent_btnLogin")).click();
			Thread.sleep(3000);
			Assert.assertEquals("Google",driver.getTitle());
		}
}
