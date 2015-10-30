package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P005_Tow_Technical2_Page {

    static WebElement element = null;

    public static WebElement LNK_T2_lnkTechnical2(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucLeftMenu_lnkTechnical2']"));
	return element;
    }

    public static WebElement TXT_T2_DoorKeys(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtDoorKeys']"));
	return element;
    }

    public static WebElement TXT_T2_UplinkMedia(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtUplinkMedia']"));
	return element;
    }

    public static WebElement TXT_T2_ULLSSS(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtULLSSS']"));
	return element;
    }

    public static WebElement TXT_T2_GateKeys(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtGateKeys']"));
	return element;
    }

    public static WebElement TXT_T2_ECNPort(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtECNPort']"));
	return element;
    }

    public static WebElement TXT_T2_Cpair(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtCPair']"));
	return element;
    }

    public static WebElement BTN_T2_Save(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;
    }

    public static WebElement Tech2_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
