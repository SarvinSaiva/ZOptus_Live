package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P007_Tow_Stock_Page {

    static WebElement element = null;

    public static WebElement LNK_Stock_lnkStock(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucLeftMenu_lnkStock']"));
	return element;
    }

    public static WebElement TXT_Stock_CPEStatus(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtCPEStatus']"));
	return element;
    }

    public static WebElement TXT_Stock_CPEManagementType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_txtCPEManagementType']"));
	return element;
    }

    public static WebElement DDN_Stock_ddlNTUInstalled(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlNTUInstalled']"));
	return element;
    }

    public static WebElement DDN_Stock_NTUType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlNTUType']"));
	return element;
    }

    public static WebElement BTN_Stock_Save(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;
    }

    public static WebElement BTN_Stock_SendInventoryUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_btnSendInventoryUpdate']"));
	return element;
    }

    public static WebElement TXT_Stock_MAILPopup_From(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFrom']"));
	return element;
    }

    public static WebElement TXT_Stock_MAILPopup_TO(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtTo']"));
	return element;
    }

    public static WebElement TXT_Stock_MAILPopup_CC(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtCC']"));
	return element;
    }

    public static WebElement TXT_Stock_MAILPopup_Attachment(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='fpuAttachment']"));
	return element;
    }

    public static WebElement BTN_Stock_MAILPoupup_Send(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSend']"));
	return element;
    }

    public static WebElement Stock_iframeSendEmail(WebDriver driver) {

	driver.switchTo().frame("UserListDialog");
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

    public static WebElement Stock_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static WebElement Stock_SendM_FrmVal(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rxpEmail']"));
	return element;
    }

    public static WebElement Stock_SendM_ToVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator1']"));
	return element;
    }

    public static WebElement Stock_SendM_CCVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator2']"));
	return element;
    }
}
