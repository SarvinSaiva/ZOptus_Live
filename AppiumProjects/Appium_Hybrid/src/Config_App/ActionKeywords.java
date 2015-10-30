package Config_App;

import static executionEngine.Appium_DriverScript.OR;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utility.Log;

public class ActionKeywords {
    // public static WebDriver driver;
    public static RemoteWebDriver driver;

    @Test
    public static void openApp(String object, String data) {
	Log.info("Opening App");
	try {
	    if (data.equals("Emulator")) {

		File appDir = new File(Constants.applocation);
		File app = new File(appDir, Constants.appname);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName",
			Constants.Emulator_devicename);
		capabilities.setCapability("platformVersion",
			Constants.Platform_Version);
		capabilities.setCapability("platformName",
			Constants.Platform_Name);
		capabilities.setCapability("appPackage", Constants.App_Package);
		capabilities.setCapability("appActivity",
			Constants.App_Activity);

		driver = new RemoteWebDriver(new URL(Constants.URL),
			capabilities);
		driver.manage().timeouts()
			.implicitlyWait(500, TimeUnit.SECONDS);
		Log.info("Emulator Process started");

	    } else if (data.equals("Simulator")) {
		File appDir = new File(Constants.applocation);
		File app = new File(appDir, Constants.appname);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName",
			Constants.Simulator_devicename);
		capabilities.setCapability("platformVersion",
			Constants.Platform_Version);
		capabilities.setCapability("platformName",
			Constants.Platform_Name);
		capabilities.setCapability("appPackage", Constants.App_Package);
		capabilities.setCapability("appActivity",
			Constants.App_Activity);

		driver = new RemoteWebDriver(new URL(Constants.URL),
			capabilities);
		driver.manage().timeouts()
			.implicitlyWait(500, TimeUnit.SECONDS);
		Log.info("Simulator Process started");

	    } else if (data.equals("RealDevice")) {
		File appDir = new File(Constants.applocation);
		File app = new File(appDir, Constants.appname);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName",
			Constants.Realdevice_devicename);
		capabilities.setCapability("platformVersion",
			Constants.Platform_Version);
		capabilities.setCapability("platformName",
			Constants.Platform_Name);
		capabilities.setCapability("appPackage", Constants.App_Package);
		capabilities.setCapability("appActivity",
			Constants.App_Activity);

		driver = new RemoteWebDriver(new URL(Constants.URL),
			capabilities);
		driver.manage().timeouts()
			.implicitlyWait(500, TimeUnit.SECONDS);
		Log.info("Realdevice Process started");

	    }

	    int implicitWaitTime = (10);
	    driver.manage().timeouts()
		    .implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.info("Not able to open the App --- " + e.getMessage());

	}
    }

    @Test
    public static void click_id(String object, String data) {
	try {
	    Log.info("Clicking on App element " + object);
	    driver.findElementById(OR.getProperty(object)).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.error("Not able to click on App element--- " + e.getMessage());
	}
    }

    @Test
    public static void click_class(String object, String data) {
	try {
	    Log.info("Clicking on App element " + object);
	    driver.findElementByClassName(OR.getProperty(object)).click();
	    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.error("Not able to click on App element--- " + e.getMessage());
	}
    }

    @Test
    public static void closeApp(String object, String data) {
	try {
	    Log.info("Closing the App");
	    driver.quit();
	} catch (Exception e) {
	    Log.error("Not able to Close the App --- " + e.getMessage());
	}
    }

    @Test
    public static void QuitApp(String object, String data) {
	try {
	    Log.info("Quit the App");
	    driver.quit();
	} catch (Exception e) {
	    Log.error("Not able to quit the App --- " + e.getMessage());
	}
    }

    @Test
    public static void Impwait_60(String object, String data) {
	try {
	    Log.info("wait for 60 seconds");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.error("Not able to wait for the App --- " + e.getMessage());
	}
    }

    @Test
    public static void Impwait_300(String object, String data) {
	try {
	    Log.info("wait for 300 seconds");
	    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.error("Not able to wait for the App --- " + e.getMessage());
	}
    }

    @Test
    public static void Impwait_500(String object, String data) {
	try {
	    Log.info("wait for 500 seconds");
	    driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.error("Not able to wait for the App --- " + e.getMessage());
	}
    }

    @Test
    public static void Impwait_1000(String object, String data) {
	try {
	    Log.info("wait for 1000 seconds");
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	} catch (Exception e) {
	    Log.error("Not able to wait for the App --- " + e.getMessage());
	}
    }

}
