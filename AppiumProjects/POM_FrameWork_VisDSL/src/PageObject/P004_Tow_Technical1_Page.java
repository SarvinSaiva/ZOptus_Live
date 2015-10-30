package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P004_Tow_Technical1_Page {

    static WebElement element = null;

    public static WebElement LNK_T1_lnkTechnical1(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucLeftMenu_lnkTechnical1']"));
	return element;
    }

    public static WebElement TXT_T1_MacquarieServiceID(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_txtMacquarieServiceID']"));
	return element;
    }

    public static WebElement TXT_T1_TelCblLength(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtTelCblLength']"));
	return element;
    }

    public static WebElement TXT_T1_Brand(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtBrand']"));
	return element;
    }

    public static WebElement DDN_T1_Alarm(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlAlarm']"));
	return element;
    }

    public static WebElement TXT_T1_ModemType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtModemType']"));
	return element;
    }

    public static WebElement BTN_T1_Save(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;
    }

    public static WebElement Tech1_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
