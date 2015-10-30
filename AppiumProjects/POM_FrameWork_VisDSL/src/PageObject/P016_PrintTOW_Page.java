package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P016_PrintTOW_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_printow(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkPrintTOW']"));
	return element;
    }

    public static WebElement DATE_PT_Scheduledte(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rdpScheduledDate_dateInput']"));
	return element;
    }

    public static WebElement DDN_PT_PTcontractor(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlContractor']"));
	return element;

    }

    public static WebElement DDN_PT_status(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlStatus']"));
	return element;

    }

    public static WebElement BTN_PT_ptsend(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSend']"));
	return element;

    }

    public static WebElement TXT_PT_From(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFrom']"));
	return element;

    }

    public static WebElement TXT_PT_To(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtTo']"));
	return element;

    }

    public static WebElement TXT_PT_CC(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtCC']"));
	return element;

    }

    public static WebElement BTN_PT_Send(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSend']"));
	return element;

    }

    public static WebElement BTN_PT_ptpreview(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnPreview']"));
	return element;

    }

    public static WebElement BNT_PT_ptclear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement PT_iframeMailpopup(WebDriver driver) {

	driver.switchTo().frame("ctl05");
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(8000);

    }

    public static WebElement PTOW_SendM_FrmVal(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rxpEmail']"));
	return element;
    }

    public static WebElement PTOW_SendM_ToVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator1']"));
	return element;
    }

    public static WebElement PTOW_SendM_CCVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator2']"));
	return element;
    }
}
