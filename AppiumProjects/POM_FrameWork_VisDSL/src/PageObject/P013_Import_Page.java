package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P013_Import_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_Import(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkImportData']"));
	return element;
    }

    public static WebElement DDN_IMD_IDjobtype(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlJobType']"));
	return element;
    }

    public static WebElement DATE_IMD_IDrecdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rdpReceivedDateImport']"));
	return element;

    }

    public static WebElement BTNfile_IMD_choosefile(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_fuWorkOrder']"));
	return element;

    }

    public static WebElement BTN_IMD_IDimport(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnUpload']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
