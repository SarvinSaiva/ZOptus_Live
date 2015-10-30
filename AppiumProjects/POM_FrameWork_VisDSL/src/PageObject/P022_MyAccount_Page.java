package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P022_MyAccount_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_myaccount(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkMyAccount']"));
	return element;
    }

    public static WebElement TXTBX_ACC_oldpassword(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtOldPassword']"));
	return element;
    }

    public static WebElement TXTBX_ACC_newpassword(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtNewPassword']"));
	return element;

    }

    public static WebElement TXTBX_ACC_confirmpasswd(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtConfirmPassword']"));
	return element;

    }

    public static WebElement LNK_logout(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lnkLogout']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(4000);

    }

}
