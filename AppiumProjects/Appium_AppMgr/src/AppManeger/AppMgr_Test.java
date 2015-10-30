package AppManeger;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppMgr_Test {

    public static RemoteWebDriver driver;
    public static String applocation = "C:\\Users\\sjeyaram\\AppData\\Local\\Android\\sdk\\tools\\App-MManager_v1.0.apk";
    public static String appname = "App-MMManager_v1.0.apk";
    public static String devicename1 = "emulator-5554";
    public static String devicename2 = "emulator-5558";

    // public static String TestAppName = "whats";

    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {
	try {
	    File appDir = new File(applocation);
	    File app = new File(appDir, appname);

	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	    // capabilities.setCapability("deviceName", devicename1);
	    capabilities.setCapability("deviceName", devicename2);
	    capabilities.setCapability("platformVersion", "4.4.2");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("appPackage", "com.appsmanager");
	    capabilities.setCapability("appActivity",
		    "com.appsmanager.MainActivity");

	    driver = new RemoteWebDriver(
		    new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @AfterTest
    public void TearDown() {
	driver.quit();
    }

    @Test
    public void AppManager_Test() throws InterruptedException {
	// clickOnSearchBtn();
	searchContact(null);
	// sendText("Hello");
	clickAndBackup();
	// takeScreenShot(driver);
    }

    public static void searchContact(String searchCont)
	    throws InterruptedException {
	driver.findElement(By.id("com.appsmanager:id/add")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElementByClassName("android.widget.ImageView").click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static void clickAndBackup() {
	driver.findElement(By.id("com.appsmanager:id/cb_select_app")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	clickBackupBtn();
	// driver.findElement(By.id("com.whatsapp:id/ok")).click();

    }

    public static void horizontalswipe() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	HashMap<String, Double> swipeObject = new HashMap<String, Double>();
	swipeObject.put("startX", 116.00);
	swipeObject.put("startY", 1875.00);
	swipeObject.put("endX", 164.00);
	swipeObject.put("endY", 531.00);
	swipeObject.put("duration", 1.0);
	js.executeScript("mobile: swipe", swipeObject);
    }

    public static void clickonAllContactBtn() {
	WebElement frameLayout = driver.findElement(By
		.id("android:id/action_bar_container"));
	List<WebElement> textView = frameLayout.findElements(By
		.className("android.widget.TextView"));
	System.out.println(textView.size());
	textView.get(2).click();
    }

    public static void clickOnSearchBtn() {
	WebElement frameLayout = driver.findElement(By
		.id("android:id/action_bar_container"));
	List<WebElement> textView = frameLayout.findElements(By
		.className("android.wedget.TextView"));
	System.out.println(textView.size());
	textView.get(1).click();
    }

    public static void clickBackupBtn() {

	driver.findElementById("com.appsmanager:id/txt_backup").click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElementById("android:id/button1").click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static void takeScreenShot(WebDriver wd) {
	try {
	    WebDriver augmentedDriver = new Augmenter().augment(wd);
	    File f = ((TakesScreenshot) augmentedDriver)
		    .getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("./pics/screenshot.jpg"));
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
