package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P020_Maintenance_Page {

    static WebElement element = null;

    public static WebElement LNK_Maintenance_lnkMaintenance(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkMaintenance']"));
	return element;
    }

    public static WebElement DDN_Maint_JT_JobType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlJobType']"));
	return element;
    }

    public static WebElement LNK_Maint_JT_lnkJobType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkJobType']"));
	return element;
    }

    public static WebElement BTN_Maint_JT_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_JT_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_JT_PJobType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl02_ctl03_txtJobType']"));
	return element;

    }

    public static WebElement DDN_Maint_JT_PClient(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl02_ctl03_ddlClient']"));
	return element;

    }

    public static WebElement CHK_Maint_JT_PActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_JT_PInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement IMG_Maint_JT_EditButton(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_JT_PopupUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement TXT_Maint_JT_PEmailTo(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgJobType_ctl00_ctl05_txtEmailTo']"));
	return element;

    }

    public static WebElement BTN_Maint_JT_ExportExcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_Maint_Status_lnkStatus(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkStatus']"));
	return element;

    }

    public static WebElement DDN_Main_status(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlStatus']"));
	return element;

    }

    public static WebElement BTN_Main_status_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Main_status_Clear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_Main_status_ExportExcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_Maint_status_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_Popupstatus(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl02_ctl03_txtStatus']"));
	return element;

    }

    public static WebElement CHK_Maint_PActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_status_PopupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_status_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement IMG_Maint_Status_Delete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgStatus_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_Pcancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement LNK_Maint_IT_lnkInstallType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkInstallType']"));
	return element;

    }

    public static WebElement DDN_Maint_IT_JobType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlJobType']"));
	return element;

    }

    public static WebElement BTN_Maint_IT_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_IT_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_PInstallType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtInstallType']"));
	return element;

    }

    public static WebElement DDN_Maint_IT_PJobType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_ddlJobType']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_Acknowledgement(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtAcknowledgement']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_Booked(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtBooked']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_Changed(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtChanged']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_NotBooked(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtNotBooked']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_Completion(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtCompletion']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_DTOW(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtDTOW']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_Cancellation(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtCancellation']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_Abbreviation(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_txtAbbreviation']"));
	return element;

    }

    public static WebElement TXT_Maint_IT_ActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_IT_PopupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_IT_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_IT_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInstallType_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_Maint_IT_exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_Maint_PR_lnkPriority(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkPriority']"));
	return element;

    }

    public static WebElement DDN_Maint_Priority(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlPriority']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_Clear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_Priority(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(". //*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl02_ctl03_txtPriority']"));
	return element;

    }

    public static WebElement CHK_Maint_PR_PopupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_PopupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_PR_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement IMG_Maint_PR_PDelete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgPriority_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement BTN_Maint_PR_Pcancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(". //*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement LNK_Maint_ST_lnkState(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkState']"));
	return element;

    }

    public static WebElement DDN_Maint_State(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlState']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_Clear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TCT_Maint_ST_PopupState(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl02_ctl03_txtState']"));
	return element;

    }

    public static WebElement CHK_Maint_ST_PopupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_PopupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_ST_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement IMG_Maint_ST_PDelete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgState_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement BTN_Maint_ST_Popupcancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement LNK_Maint_EX_lnkExchange(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkExchange']"));
	return element;

    }

    public static WebElement TXT_Maint_EX_Exchange(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtExchange']"));
	return element;

    }

    public static WebElement BTN_Maint_EX_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_EX_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_EX_PopupExcode(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl03_txtExchangeCode']"));
	return element;

    }

    public static WebElement DDN_Maint_EX_PopupState(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl03_ddlState']"));
	return element;

    }

    public static WebElement TXT_Maint_Ex_popupSuburb(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl03_txtSuburb']"));
	return element;

    }

    public static WebElement TXT_Maint_Ex_popupMapRef(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl03_txtMapRef']"));
	return element;

    }

    public static WebElement CHK_Maint_Ex_popupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_EX_PopupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_EX_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_EX_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgExchange_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_Maint_EX_exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_Maint_LN_lnkLineType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkLineType']"));
	return element;

    }

    public static WebElement TXT_Maint_LN_LineType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtLineType']"));
	return element;

    }

    public static WebElement BTN_Maint_LN_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_LN_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgLineType_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_LN_popupLineType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgLineType_ctl00_ctl02_ctl03_txtLineType']"));
	return element;

    }

    public static WebElement CHK_Maint_LN_popupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgLineType_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_LN_popupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgLineType_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_LN_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgLineType_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_LN_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgLineType_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_Maint_LN_Exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_Maint_LOC_lnkClearofCodes(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkClearofCodes']"));
	return element;

    }

    public static WebElement DDN_Maint_LOC_ClearOffCodes(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlClearOffCodes']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_Clear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_Exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_LOC_popupClearCode(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl02_ctl03_txtClearCode']"));
	return element;

    }

    public static WebElement TXT_Maint_LOC_popupClearCodeDesc(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl02_ctl03_txtClearCodeDescription']"));
	return element;

    }

    public static WebElement CHK_Maint_LOC_popupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_popupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_LOC_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement IMG_Maint_LOC_PDelete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClearOffCodes_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement BTN_Maint_LOC_Pcancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement IMG_MZN_lnkZone(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkZone']"));
	return element;

    }

    public static WebElement DDN_MZN_zone(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlZone']"));
	return element;

    }

    public static WebElement BTN_MZN_Zsearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_MZN_Zclear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_MZN_Zexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNKBTN_MZN_Zaddnew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl02_ctl00_InitInsertButton']"));
	return element;

    }

    public static WebElement TXTBX_MZN_addzone(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl02_ctl03_txtZone']"));
	return element;

    }

    public static WebElement CHKBX_MZN_addactiveyn(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_MZN_Zinsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement BTN_MZN_Zedit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_MZN_editzoneupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_MZN_Zonedelete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgZone_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement BTN_MZN_Zcancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement LNK_Maint_CPE_lnkCPEType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkCPEType']"));
	return element;

    }

    public static WebElement TXT_Maint_CPE_CPEType(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtCPEType']"));
	return element;

    }

    public static WebElement BTN_Maint_CPE_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_CPE_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgCPEType_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_CPE_popupCPEType(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgCPEType_ctl00_ctl02_ctl03_txtCPEType']"));
	return element;

    }

    public static WebElement CHK_Maint_CPE_popupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgCPEType_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_CPE_popupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgCPEType_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_CPE_popupEdit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgCPEType_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_CPE_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgCPEType_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_Maint_CPE_ExportExcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_Maint_TASK_lnkTask(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkTask']"));
	return element;

    }

    public static WebElement DDN_Maint_Task_Task(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlTask']"));
	return element;

    }

    public static WebElement BTN_Maint_Task_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_Task_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_Task_popupTaskCode(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl02_ctl03_txtTaskCode']"));
	return element;

    }

    public static WebElement TXT_Maint_Task_popupTaskDesc(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl02_ctl03_txtTaskDescription']"));
	return element;

    }

    public static WebElement CHK_Maint_Task_popupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_Task_popupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_Task_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_Task_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgTask_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_Maint_Task_Exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement IMG_MNTU_lnkNTUTypes(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkNTUTypes']"));
	return element;

    }

    public static WebElement DDN_MNTU_ntutype(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlNTUType']"));
	return element;

    }

    public static WebElement BTN_MNTU_ntusearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement LNKBTN_MNTU_ntuadd(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgNTUType_ctl00_ctl02_ctl00_InitInsertButton']"));
	return element;

    }

    public static WebElement TXTBX_MNTU_ntutype(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgNTUType_ctl00_ctl02_ctl03_txtNTUType']"));
	return element;

    }

    public static WebElement CHKBX_MNTU_ntuactive(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgNTUType_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_MNTU_ntuinsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgNTUType_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement BTN_MNTU_ntuedit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgNTUType_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_MNTU_ntuupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgNTUType_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_MNTU_ntuexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement IMG_DW_lnkDTOWCategory(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkDTOWCategory']"));
	return element;

    }

    public static WebElement TXTBX_DW_searcategry(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtDTOWCategory']"));
	return element;

    }

    public static WebElement BTN_DW_dtowsearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement LNKBTN_DW_dtowaddnew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWCategory_ctl00_ctl02_ctl00_InitInsertButton']"));
	return element;

    }

    public static WebElement TXTBX_DW_dtowaddcategory(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWCategory_ctl00_ctl02_ctl03_txtDTOWCategory']"));
	return element;

    }

    public static WebElement CHKBX_DW_dtowactive(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWCategory_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_DW_addinsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWCategory_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement BTN_DW_editdtow(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWCategory_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_DW_dtowupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWCategory_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_DW_dtowexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement IMG_DR_lnkDTOWReason(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkDTOWReason']"));
	return element;

    }

    public static WebElement TXTBX_DR_searReason(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtDTOWReason']"));
	return element;

    }

    public static WebElement BTN_DR_dtowRsearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement LNKBTN_DR_dtowRaddnew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXTBX_DR_dtowRaddreason(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl02_ctl03_txtDTOWReason']"));
	return element;

    }

    public static WebElement TXTBX_DR_dtowRaddtype(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl02_ctl03_txtType']"));
	return element;

    }

    public static WebElement CHKBX_DR_dtowRactive(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_DR_addRinsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement BTN_DR_editRdtow(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_DR_dtowRupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgDTOWReason_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_DR_dtowRexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_Maint_CT_lnkClient(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkClient']"));
	return element;

    }

    public static WebElement DDN_Maint_cT_Client(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlClient']"));
	return element;

    }

    public static WebElement BTN_Maint_CT_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Maint_CT_AddNew(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClient_ctl00_ctl02_ctl00_AddNewRecordButton']"));
	return element;

    }

    public static WebElement TXT_Maint_CT_popupClient(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClient_ctl00_ctl02_ctl03_txtClient']"));
	return element;

    }

    public static WebElement CHK_Maint_CT_popupActiveYN(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClient_ctl00_ctl02_ctl03_chkActiveYN']"));
	return element;

    }

    public static WebElement BTN_Maint_CT_popupInsert(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClient_ctl00_ctl02_ctl03_btnSave']"));
	return element;

    }

    public static WebElement ICON_Maint_CT_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClient_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_Maint_CT_PUpdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClient_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_Maint_CT_Exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement IMG_LHDR_apibooking(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkAPIBookingRules']"));
	return element;

    }

    public static WebElement BTN_MAPI_Apiedit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgAPIBookingRules_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement TXTBX_MAPI_booking(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgAPIBookingRules_ctl00_ctl05_txtTotBookingAllowed']"));
	return element;

    }

    public static WebElement BTN_MAPI_apiupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgAPIBookingRules_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_MAPI_apidelete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgAPIBookingRules_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement IMG_LHDR_contracto(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkContractors']"));
	return element;

    }

    public static WebElement TXTBX_MCON_filter(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtFilter']"));
	return element;

    }

    public static WebElement BTN_MCON_congo(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnGo']"));
	return element;

    }

    public static WebElement BTN_MCON_clear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_MCON_conexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_MCON_conedit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgContractor_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement TXTBX_MCON_conphone(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgContractor_ctl00_ctl05_txtPhone']"));
	return element;

    }

    public static WebElement BTN_MCON_conupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgContractor_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_MCON_condelete(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgContractor_ctl00_ctl04_gbcDelete']"));
	return element;

    }

    public static WebElement BTN_MCON_cancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement JT_Val_Savemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;

    }

    public static WebElement JT_Val_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;

    }

    public static WebElement ST_Val_Deletemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;

    }

    public static WebElement JT_Val_AlreadyExistsmsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(3000);

    }
}
