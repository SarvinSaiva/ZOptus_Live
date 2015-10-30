package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P009_Tow_Documentation_Page {

    static WebElement element = null;

    public static WebElement LNK_DCM_lnkDocumentation(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucLeftMenu_lnkDocumentation']"));
	return element;
    }

    public static WebElement BTN_DCM_AddNewRecordButton(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDocument_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;
    }

    public static WebElement BTN_DCM_SaveUpload(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDocument_ctl00_ctl02_ctl03_btnSaveUpload']"));
	return element;
    }

    public static WebElement FileUpload_DCM_Document(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDocument_ctl00_ctl02_ctl03_FileUpload1']"));
	return element;
    }

    public static WebElement BTN_DCM_SendEmail(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSendEmail']"));
	return element;
    }

    public static WebElement TXT_DCM_MAILPopup_From(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFrom']"));
	return element;
    }

    public static WebElement TXT_DCM_MAILPopup_TO(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtTo']"));
	return element;
    }

    public static WebElement TXT_DCM_MAILPopup_CC(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtCC']"));
	return element;
    }

    public static WebElement TXT_DCM_MAILPopup_Attachment(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='fpuAttachment']"));
	return element;
    }

    public static WebElement TXT_DCM_MAILPopup_Subject(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtSubject']"));
	return element;
    }

    public static WebElement BTN_DCM_MAILPoupup_Send(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSend']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

    public static WebElement DCM_iframeSendEmail(WebDriver driver) {

	driver.switchTo().frame("SendEmail");
	return element;

    }

    public static WebElement Doc_Val_FileUpload(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDocument_ctl00_ctl02_ctl03_rfvFileUpload']"));
	return element;
    }

    public static WebElement Doc_SendM_FrmVal(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rxpEmail']"));
	return element;
    }

    public static WebElement Doc_SendM_ToVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator1']"));
	return element;
    }

    public static WebElement Doc_SendM_CCVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator2']"));
	return element;
    }

    public static WebElement Doc_Save_Val(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

}
