package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P014_NewWorkOrder_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_newwrkordr(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkNewWorkOrder']"));
	return element;
    }

    public static WebElement DDN_NWO_Njobtype(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlJobType']"));
	return element;
    }

    public static WebElement DDN_NWO_Ninstall(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlInstallType']"));
	return element;

    }

    public static WebElement TXTBX_NWO_Nref(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtRef']"));
	return element;

    }

    public static WebElement TXTBX_NWO_Nref2(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtRef2']"));
	return element;

    }

    public static WebElement TXTBX_NWO_Nfnn(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtFNNULL']"));
	return element;

    }

    public static WebElement BTN_NWO_Nsave(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSaveWorkOrder']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
