package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P008_Tow_NonStandInstall_Page {

    static WebElement element = null;

    public static WebElement LNK_NSI_lnkStock(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucLeftMenu_lnkNonStandInstal']"));
	return element;
    }

    public static WebElement TXT_NSI_BillingAmount(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtBillingAmount']"));
	return element;
    }

    public static WebElement TXT_ApprovedBy(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtApprovedBy']"));
	return element;
    }

    public static WebElement TXT_NSI_NumberofHours(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtNumberofHours']"));
	return element;
    }

    public static WebElement TXT_NSI_MaterialValues(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtMaterialValues']"));
	return element;
    }

    public static WebElement TXT_NSI_Save(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;
    }

    public static WebElement NonStand_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
