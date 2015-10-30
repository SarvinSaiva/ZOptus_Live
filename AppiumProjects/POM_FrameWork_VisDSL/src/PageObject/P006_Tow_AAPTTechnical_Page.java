package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P006_Tow_AAPTTechnical_Page {

    static WebElement element = null;

    public static WebElement LNK_APPTT_lnkAAPTTechnical(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucLeftMenu_lnkAAPTTechnical']"));
	return element;
    }

    public static WebElement TXT_APPTT_NetworkBoundaryPointDetails(
	    WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_txtNetworkBoundaryPointDetails']"));
	return element;
    }

    public static WebElement TXT_APPTT_IADNo(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtIADNo']"));
	return element;
    }

    public static WebElement TXT_APPTT_Range1Source(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtRange1Source']"));
	return element;
    }

    public static WebElement TXT_APPTT_TerminationTerminalBox(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_txtTerminationTerminalBox']"));
	return element;
    }

    public static WebElement TXT_APPTT_TotalIADs(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtTotalIADs']"));
	return element;
    }

    public static WebElement BTN_APPTT_Save(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;
    }

    public static WebElement AAPT_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }
}
