package AppModule;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P020_Maintenance_Page;
import Utility.ExcelUtils;

public class A020_Maintenance_Action {

    @Test
    public void JobType_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maintenance_lnkMaintenance(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_JT_lnkJobType(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_PInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.AlertJTMessageverify(driver);
	P020_Maintenance_Page.waitFor();
	String PJobType = ExcelUtils.getCellData(1, 4);
	P020_Maintenance_Page.TXT_Maint_JT_PJobType(driver).sendKeys(PJobType);
	P020_Maintenance_Page.waitFor();
	String PClient = ExcelUtils.getCellData(1, 6);
	Select oSelection2 = new Select(
		P020_Maintenance_Page.DDN_Maint_JT_PClient(driver));
	oSelection2.selectByVisibleText(PClient);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_JT_PActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_PInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.AlreadyExistJTValidation(driver);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.AlertJTSearchMessageverify(driver);
	P020_Maintenance_Page.waitFor();
	String JTJobType = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_Maint_JT_JobType(driver));
	oSelection1.selectByVisibleText(JTJobType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_Maint_JT_EditButton(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.TXT_Maint_JT_PEmailTo(driver).clear();
	P020_Maintenance_Page.waitFor();
	String EJobType = ExcelUtils.getCellData(1, 7);
	P020_Maintenance_Page.TXT_Maint_JT_PEmailTo(driver).sendKeys(EJobType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_PopupUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.UpdateJTValidation(driver);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_JT_ExportExcel(driver).click();
	P020_Maintenance_Page.waitFor();

    }

    @Test
    public void Status_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_Status_lnkStatus(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_status_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_status_PopupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.AlertSTMessageverify(driver);
	P020_Maintenance_Page.waitFor();
	String pstatus = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXT_Maint_Popupstatus(driver).sendKeys(pstatus);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_PActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_status_PopupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.AlreadyExistSTValidation(driver);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_status_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.UpdateSTValidation(driver);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Main_status_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.AlertSTSearchMessageverify(driver);
	P020_Maintenance_Page.waitFor();
	String status = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_Main_status(driver));
	oSelection1.selectByVisibleText(status);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Main_status_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_Maint_Status_Delete(driver).click();
	P020_Maintenance_Page.waitFor();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	P020_Maintenance_Page.waitFor();
	A020_Maintenance_Action.DeleteSTValidation(driver);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Main_status_Clear(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Main_status_ExportExcel(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_Pcancel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void InstallType_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_IT_lnkInstallType(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_IT_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String PInstallType = ExcelUtils.getCellData(1, 3);
	P020_Maintenance_Page.TXT_Maint_IT_PInstallType(driver).sendKeys(
		PInstallType);
	P020_Maintenance_Page.waitFor();
	String PJobType = ExcelUtils.getCellData(1, 4);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_Maint_IT_PJobType(driver));
	oSelection1.selectByVisibleText(PJobType);
	String Acknowledgement = ExcelUtils.getCellData(1, 5);
	P020_Maintenance_Page.TXT_Maint_IT_Acknowledgement(driver).sendKeys(
		Acknowledgement);
	String Booked = ExcelUtils.getCellData(1, 6);
	P020_Maintenance_Page.TXT_Maint_IT_Booked(driver).sendKeys(Booked);
	String Changed = ExcelUtils.getCellData(1, 7);
	P020_Maintenance_Page.TXT_Maint_IT_Changed(driver).sendKeys(Changed);
	String NotBooked = ExcelUtils.getCellData(1, 8);
	P020_Maintenance_Page.TXT_Maint_IT_NotBooked(driver)
		.sendKeys(NotBooked);
	String Completion = ExcelUtils.getCellData(1, 9);
	P020_Maintenance_Page.TXT_Maint_IT_Completion(driver).sendKeys(
		Completion);
	String DTOW = ExcelUtils.getCellData(1, 10);
	P020_Maintenance_Page.TXT_Maint_IT_DTOW(driver).sendKeys(DTOW);
	String Cancellation = ExcelUtils.getCellData(1, 11);
	P020_Maintenance_Page.TXT_Maint_IT_Cancellation(driver).sendKeys(
		Cancellation);
	String Abbreviation = ExcelUtils.getCellData(1, 12);
	P020_Maintenance_Page.TXT_Maint_IT_Abbreviation(driver).sendKeys(
		Abbreviation);
	P020_Maintenance_Page.TXT_Maint_IT_ActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_IT_PopupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_IT_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_IT_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String ITJobType = ExcelUtils.getCellData(1, 1);
	Select oSelection2 = new Select(
		P020_Maintenance_Page.DDN_Maint_IT_JobType(driver));
	oSelection2.selectByVisibleText(ITJobType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_IT_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_IT_exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();

    }

    @Test
    public void Priority_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_PR_lnkPriority(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String Priority = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXT_Maint_Priority(driver).sendKeys(Priority);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_PR_PopupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_PopupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_PR_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String SPriority = ExcelUtils.getCellData(1, 1);
	Select oSelection2 = new Select(
		P020_Maintenance_Page.DDN_Maint_Priority(driver));
	oSelection2.selectByVisibleText(SPriority);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_Maint_PR_PDelete(driver).click();
	P020_Maintenance_Page.waitFor();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_Clear(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_PR_Pcancel(driver).click();
	P020_Maintenance_Page.waitFor();

    }

    @Test
    public void State_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_ST_lnkState(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String PopupState = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TCT_Maint_ST_PopupState(driver).sendKeys(
		PopupState);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_ST_PopupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_PopupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_ST_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String State = ExcelUtils.getCellData(1, 1);
	Select oSelection2 = new Select(
		P020_Maintenance_Page.DDN_Maint_State(driver));
	oSelection2.selectByVisibleText(State);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_Maint_ST_PDelete(driver).click();
	P020_Maintenance_Page.waitFor();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_Clear(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_ST_Popupcancel(driver).click();
	P020_Maintenance_Page.waitFor();

    }

    @Test
    public void Exch_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_EX_lnkExchange(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_EX_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String PopupExcode = ExcelUtils.getCellData(1, 5);
	P020_Maintenance_Page.TXT_Maint_EX_PopupExcode(driver).sendKeys(
		PopupExcode);
	String PopupState = ExcelUtils.getCellData(1, 6);
	Select oSelection2 = new Select(
		P020_Maintenance_Page.DDN_Maint_EX_PopupState(driver));
	oSelection2.selectByVisibleText(PopupState);
	String popupSuburb = ExcelUtils.getCellData(1, 7);
	P020_Maintenance_Page.TXT_Maint_Ex_popupSuburb(driver).sendKeys(
		popupSuburb);
	String popupMapRef = ExcelUtils.getCellData(1, 8);
	P020_Maintenance_Page.TXT_Maint_Ex_popupMapRef(driver).sendKeys(
		popupMapRef);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_Ex_popupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_EX_PopupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	String Exchange = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXT_Maint_EX_Exchange(driver).sendKeys(Exchange);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_EX_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_EX_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_EX_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_EX_exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void LineType_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_LN_lnkLineType(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LN_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String popupLineType = ExcelUtils.getCellData(1, 4);
	P020_Maintenance_Page.TXT_Maint_LN_popupLineType(driver).sendKeys(
		popupLineType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_LN_popupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LN_popupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_LN_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LN_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String LineType = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXT_Maint_LN_LineType(driver).sendKeys(LineType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LN_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LN_Exportexcel(driver).click();

    }

    @Test
    public void ClearOffCodes_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_LOC_lnkClearofCodes(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LOC_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String pClearCode = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXT_Maint_LOC_popupClearCode(driver).sendKeys(
		pClearCode);
	String pClearCodeDesc = ExcelUtils.getCellData(1, 3);
	P020_Maintenance_Page.TXT_Maint_LOC_popupClearCodeDesc(driver)
		.sendKeys(pClearCodeDesc);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_LOC_popupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LOC_popupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_LOC_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LOC_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String LineType = ExcelUtils.getCellData(1, 1);
	Select oSelection2 = new Select(
		P020_Maintenance_Page.DDN_Maint_LOC_ClearOffCodes(driver));
	oSelection2.selectByVisibleText(LineType);
	P020_Maintenance_Page.DDN_Maint_LOC_ClearOffCodes(driver).sendKeys(
		LineType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LN_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_Maint_LOC_PDelete(driver).click();
	P020_Maintenance_Page.waitFor();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LOC_Clear(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LOC_Exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_LOC_Pcancel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void Zone_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_MZN_lnkZone(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNKBTN_MZN_Zaddnew(driver).click();
	P020_Maintenance_Page.waitFor();
	String addzone = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXTBX_MZN_addzone(driver).sendKeys(addzone);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHKBX_MZN_addactiveyn(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zinsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zedit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_editzoneupdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String zone = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_MZN_zone(driver));
	oSelection1.selectByVisibleText(zone);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zsearch(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zonedelete(driver).click();
	P020_Maintenance_Page.waitFor();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zclear(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zexcel(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MZN_Zcancel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void CPEType_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_CPE_lnkCPEType(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CPE_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String popupCPEType = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXT_Maint_CPE_popupCPEType(driver).sendKeys(
		popupCPEType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_CPE_popupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CPE_popupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_CPE_popupEdit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CPE_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String CPEType = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXT_Maint_CPE_CPEType(driver).sendKeys(CPEType);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CPE_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CPE_ExportExcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void Task_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_TASK_lnkTask(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_Task_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String popupTaskCode = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXT_Maint_Task_popupTaskCode(driver).sendKeys(
		popupTaskCode);
	String popupTaskDesc = ExcelUtils.getCellData(1, 3);
	P020_Maintenance_Page.TXT_Maint_Task_popupTaskDesc(driver).sendKeys(
		popupTaskDesc);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.CHK_Maint_Task_popupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_Task_popupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_Task_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_Task_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String Task = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_Maint_Task_Task(driver));
	oSelection1.selectByVisibleText(Task);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_Task_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_Task_Exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void NTUTypes_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_MNTU_lnkNTUTypes(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNKBTN_MNTU_ntuadd(driver).click();
	P020_Maintenance_Page.waitFor();
	String ntutype = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXTBX_MNTU_ntutype(driver).sendKeys(ntutype);
	P020_Maintenance_Page.CHKBX_MNTU_ntuactive(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MNTU_ntuinsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MNTU_ntuedit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MNTU_ntuupdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String Dntutype = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_MNTU_ntutype(driver));
	oSelection1.selectByVisibleText(Dntutype);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MNTU_ntusearch(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MNTU_ntuexcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void DTOWCategory_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_DW_lnkDTOWCategory(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNKBTN_DW_dtowaddnew(driver).click();
	P020_Maintenance_Page.waitFor();
	String dtowaddcategory = ExcelUtils.getCellData(1, 3);
	P020_Maintenance_Page.TXTBX_DW_dtowaddcategory(driver).sendKeys(
		dtowaddcategory);
	P020_Maintenance_Page.CHKBX_DW_dtowactive(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DW_addinsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DW_editdtow(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DW_dtowupdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String searcategry = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXTBX_DW_searcategry(driver)
		.sendKeys(searcategry);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DW_dtowsearch(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DW_dtowexcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void DTOWReason_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_DR_lnkDTOWReason(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNKBTN_DR_dtowRaddnew(driver).click();
	P020_Maintenance_Page.waitFor();
	String dtowRaddreason = ExcelUtils.getCellData(1, 3);
	P020_Maintenance_Page.TXTBX_DR_dtowRaddreason(driver).sendKeys(
		dtowRaddreason);
	String dtowRaddtype = ExcelUtils.getCellData(1, 4);
	P020_Maintenance_Page.TXTBX_DR_dtowRaddtype(driver).sendKeys(
		dtowRaddtype);
	P020_Maintenance_Page.CHKBX_DR_dtowRactive(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DR_addRinsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DR_editRdtow(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DR_dtowRupdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String searReason = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXTBX_DR_searReason(driver).sendKeys(searReason);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DR_dtowRsearch(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_DR_dtowRexcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void Client_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.LNK_Maint_CT_lnkClient(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CT_AddNew(driver).click();
	P020_Maintenance_Page.waitFor();
	String popupClient = ExcelUtils.getCellData(1, 3);
	P020_Maintenance_Page.TXT_Maint_CT_popupClient(driver).sendKeys(
		popupClient);
	P020_Maintenance_Page.CHK_Maint_CT_popupActiveYN(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CT_popupInsert(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.ICON_Maint_CT_Edit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CT_PUpdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String Client = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P020_Maintenance_Page.DDN_Maint_cT_Client(driver));
	oSelection1.selectByVisibleText(Client);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CT_Search(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_Maint_CT_Exportexcel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    @Test
    public void APIBooking_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_LHDR_apibooking(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MAPI_Apiedit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.TXTBX_MAPI_booking(driver).clear();
	String booking = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXTBX_MAPI_booking(driver).sendKeys(booking);
	P020_Maintenance_Page.BTN_MAPI_apiupdate(driver).click();
	P020_Maintenance_Page.waitFor();

    }

    @Test
    public void Contractors_Maint(WebDriver driver) throws Exception {

	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.IMG_LHDR_contracto(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MCON_conedit(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.TXTBX_MCON_conphone(driver).clear();
	String conphone = ExcelUtils.getCellData(1, 2);
	P020_Maintenance_Page.TXTBX_MCON_conphone(driver).sendKeys(conphone);
	P020_Maintenance_Page.BTN_MCON_conupdate(driver).click();
	P020_Maintenance_Page.waitFor();
	String filter = ExcelUtils.getCellData(1, 1);
	P020_Maintenance_Page.TXTBX_MCON_filter(driver).sendKeys(filter);
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MCON_congo(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MCON_clear(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MCON_conexcel(driver).click();
	P020_Maintenance_Page.waitFor();
	P020_Maintenance_Page.BTN_MCON_cancel(driver).click();
	P020_Maintenance_Page.waitFor();
    }

    public static void SaveJTValidation(WebDriver driver) throws Exception {
	String message = P020_Maintenance_Page.JT_Val_Savemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 14);
	if (Validation.equals(message)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void UpdateJTValidation(WebDriver driver) throws Exception {
	String message = P020_Maintenance_Page.JT_Val_Updatemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 15);
	if (Validation.equals(message)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void AlreadyExistJTValidation(WebDriver driver)
	    throws Exception {
	String message = P020_Maintenance_Page.JT_Val_AlreadyExistsmsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 17);
	if (Validation.equals(message)) {
	    Reporter.log(
		    "TC020_Maintenance_Page : "
			    + "Label Message - Already Exist Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log(
		    "TC020_Maintenance_Page : "
			    + "Label Message - Already Exist Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void SaveSTValidation(WebDriver driver) throws Exception {
	String message = P020_Maintenance_Page.JT_Val_Savemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 4);
	if (Validation.equals(message)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void UpdateSTValidation(WebDriver driver) throws Exception {
	String message = P020_Maintenance_Page.JT_Val_Updatemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 5);
	if (Validation.equals(message)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void DeleteSTValidation(WebDriver driver) throws Exception {
	String message = P020_Maintenance_Page.ST_Val_Deletemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 6);
	if (Validation.equals(message)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Delete Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Label Message - Delete Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void AlreadyExistSTValidation(WebDriver driver)
	    throws Exception {
	String message = P020_Maintenance_Page.JT_Val_AlreadyExistsmsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 7);
	if (Validation.equals(message)) {
	    Reporter.log(
		    "TC020_Maintenance_Page : "
			    + "Label Message - Already Exist Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log(
		    "TC020_Maintenance_Page : "
			    + "Label Message - Already Exist Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void AlertJTSearchMessageverify(WebDriver driver)
	    throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 18);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }

    public static void AlertJTMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 19);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }

    public static void AlertSTSearchMessageverify(WebDriver driver)
	    throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 8);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void AlertSTMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 9);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC020_Maintenance_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }
}
