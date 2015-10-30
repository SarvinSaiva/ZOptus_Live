package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P001_SignIn_Page {
    static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtUserName']"));
	return element;
    }

    public static WebElement txtbx_Password(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtPassword']"));
	return element;
    }

    public static WebElement btn_LogIn(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnLogin']"));
	return element;

    }

    public static WebElement Login_Validation(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
