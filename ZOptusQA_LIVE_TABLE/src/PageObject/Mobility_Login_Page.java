package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobility_Login_Page {
    static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver) {

	element = driver.findElement(By.id("cphContent_txtUserName"));
	return element;
    }

    public static WebElement txtbx_Password(WebDriver driver) {

	element = driver.findElement(By.id("cphContent_txtPassword"));
	return element;
    }

    public static WebElement btn_LogIn(WebDriver driver) {

	element = driver.findElement(By.id("cphContent_btnLogin"));
	return element;

    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(3000);
	return element;
    }

    public static WebElement PageloadTimeout(WebDriver driver) {
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	return element;
    }
}
