package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P002_Tow_WorkOrder_Page {

    /*
     * String Path_OR = Constant.Path_OR; FileInputStream fs = null; private
     * Properties OR;{ try { fs = new FileInputStream(Path_OR); } catch
     * (FileNotFoundException e) { e.printStackTrace(); } OR = new
     * Properties(System.getProperties()); try { Properties OR = null;
     * OR.load(fs); } catch (IOException e1) { e1.printStackTrace(); } }
     */

    static WebElement element = null;

    public static WebElement LNK_lnkTOWHome(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkHome']"));
	return element;
    }

    public static WebElement DDN_Jobtype(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlJobType']"));
	return element;
    }

    public static WebElement txt_Ref(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtRef']"));
	return element;
    }

    public static WebElement txt_Ref2(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtRef2']"));
	return element;
    }

    public static WebElement txt_FNN(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFNNULL']"));
	return element;
    }

    public static WebElement DDN_contractor(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlContractor']"));
	return element;
    }

    public static WebElement DDN_State(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlECState']"));
	return element;
    }

    public static WebElement DDN_Exchange(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlECExchange']"));
	return element;
    }

    public static WebElement btn_WO_Save(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSaveWorkOrder']"));
	return element;
    }

    public static WebElement IMG_WO_cutover(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='imgCutOver']"));
	return element;
    }

    public static WebElement DATE_WO_cutdate(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpCutOverDate']"));
	return element;
    }

    public static WebElement BTN_WO_cutsave(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSave']"));
	return element;
    }

    public static WebElement IMG_WO_sheduletime(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='imgScheduleDate']"));
	return element;
    }

    public static WebElement TXTBX_WO_reviseddate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpReviseDate_dateInput']"));
	return element;
    }

    public static WebElement TXTBX_WO_revisedtime(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtReviseTime']"));
	return element;
    }

    public static WebElement DDN_WO_ChangeCausedBy(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlChangeCausedBy']"));
	return element;
    }

    public static WebElement DDN_WO_DTOWReason(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlDTOWReason']"));
	return element;
    }

    public static WebElement BTN_WO_schedulesave(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSave']"));
	return element;
    }

    public static WebElement BTN_WO_scheduleSMCancel(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnCancel']"));
	return element;
    }

    public static WebElement BTN_WO_Additem(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnAddItem']"));
	return element;
    }

    public static WebElement DDN_WO_AIitem(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlItems']"));
	return element;
    }

    public static WebElement TXTBX_WO_AIquantity(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtQuantity']"));
	return element;
    }

    public static WebElement DDN_WO_AIcontractor(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlContractor']"));
	return element;
    }

    public static WebElement DATE_WO_AIcomdate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpCompletedDate_dateInput']"));
	return element;
    }

    public static WebElement BTN_WO_AIsave(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSave']"));
	return element;
    }

    public static WebElement BNT_WO_Aicancel(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btncancel'] "));
	return element;
    }

    public static WebElement BNT_WO_AddDTOW(WebDriver driver) {

	element = driver
		.findElement(By.xpath(".//*[@id='btnAddDTOWCategory']"));
	return element;
    }

    public static WebElement DDN_WO_Dwcategory(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlDTOWCategory']"));
	return element;
    }

    public static WebElement DATE_WO_DWdate(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDTOWDate']"));
	return element;
    }

    public static WebElement DDN_WO_DWreason(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlDTOWReason']"));
	return element;
    }

    public static WebElement BTN_WO_DWsave(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSave']"));
	return element;
    }

    public static WebElement BTN_WO_DWmailCancel(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnCancel']"));
	return element;
    }

    public static WebElement BTN_WO_DWClose(WebDriver driver) {

	element = driver.findElement(By.id("btncancel"));
	return element;
    }

    public static WebElement TXTBX_WO_fault(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFaultCategory']"));
	return element;
    }

    public static WebElement BTN_WO_sendemail(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSendEmail']"));
	return element;
    }

    public static WebElement TXT_WO_SM_From(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFrom']"));
	return element;
    }

    public static WebElement TXT_WO_SM_To(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtTo']"));
	return element;
    }

    public static WebElement TXT_WO_SM_CC(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtCC']"));
	return element;
    }

    public static WebElement BTN_WO_SM_Attachment(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='fpuAttachment']"));
	return element;
    }

    public static WebElement BTN_WO_SM_Send(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSend']"));
	return element;
    }

    public static WebElement TXTBX_WO_searchref(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='SearchtxtRef1']"));
	return element;
    }

    public static WebElement BTN_WO_search(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSearch']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

    public static WebElement WO_iframeCutOverDate(WebDriver driver) {

	driver.switchTo().frame("EditCutOverDate");
	return element;

    }

    public static WebElement WO_iframeScheduledDate(WebDriver driver) {

	driver.switchTo().frame("EditScheduledDate");
	return element;

    }

    public static WebElement WO_iframeEditItem(WebDriver driver) {

	driver.switchTo().frame("AddEditItem");
	return element;

    }

    public static WebElement WO_iframeDTOWWindow(WebDriver driver) {

	driver.switchTo().frame("DTOWWindow");
	return element;

    }

    public static WebElement WO_iframeSendEmail(WebDriver driver) {

	driver.switchTo().frame("SendEmail");
	return element;

    }

    public static WebElement WO_iframeDOWSendEmail(WebDriver driver) {

	driver.switchTo().frame("ctl03");
	return element;

    }

    public static WebElement WO_iframeSISendEmail(WebDriver driver) {

	driver.switchTo().frame("ctl05");
	return element;

    }

    public static WebElement WO_Validation_Save(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='lblMessage']"));
	return element;

    }

    public static WebElement WO_Validation_Savemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='lblMessage']"));
	return element;

    }

    public static WebElement WO_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='lblMessage']"));
	return element;

    }

    public static WebElement WO_AddItemVal_Savemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='lblSuccessMsg']"));
	return element;

    }

    public static WebElement WO_SendM_FrmVal(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rxpEmail']"));
	return element;

    }

    public static WebElement WO_SendM_ToVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator1']"));
	return element;

    }

    public static WebElement WO_SendM_CCVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator2']"));
	return element;

    }
}
