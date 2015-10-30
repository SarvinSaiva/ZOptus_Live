package AppModule;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P017_Reports_Page;
import Utility.ExcelUtils;

public class A017_Reports_Action {

    @Test
    public void Report_Acknowledgement_Page(WebDriver driver) throws Exception {

	P017_Reports_Page.LNK_RPT_lnkReports(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_AcknowledgementRpt_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AcknowledgementRpt_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation1(driver);
	P017_Reports_Page.waitFor();
	String Ackclient = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_AcknowledgementRpt_client(driver));
	oSelection1.selectByVisibleText(Ackclient);
	P017_Reports_Page.waitFor();
	String AckDate = ExcelUtils.getCellData(1, 2);
	P017_Reports_Page.Date_AcknowledgementRpt_Date(driver)
		.sendKeys(AckDate);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AcknowledgementRpt_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AcknowledgementRpt_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();
    }

    @Test
    public void Report_NoAppointment_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_NoAppointmentRpt_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_NoAppointmentRpt_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation1(driver);
	P017_Reports_Page.waitFor();
	String NoAppclient = ExcelUtils.getCellData(1, 3);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_NoAppointmentRpt_client(driver));
	oSelection1.selectByVisibleText(NoAppclient);
	P017_Reports_Page.waitFor();
	String NoAppDate = ExcelUtils.getCellData(1, 4);
	P017_Reports_Page.Date_NoAppointmentRpt_Date(driver)
		.sendKeys(NoAppDate);
	P017_Reports_Page.BTN_NoAppointmentRpt_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_NoAppointmentRpt_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_Appointment_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_AppointmentRpt_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AppointmentRpt_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation1(driver);
	P017_Reports_Page.waitFor();
	String Appclient = ExcelUtils.getCellData(1, 5);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_AppointmentRpt_client(driver));
	oSelection1.selectByVisibleText(Appclient);
	P017_Reports_Page.waitFor();
	String AppDate = ExcelUtils.getCellData(1, 6);
	P017_Reports_Page.Date_AppointmentRpt_Date(driver).sendKeys(AppDate);
	P017_Reports_Page.BTN_AppointmentRpt_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AppointmentRpt_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_Completion_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_Completion_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_Completion_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation1(driver);
	P017_Reports_Page.waitFor();
	String Comclient = ExcelUtils.getCellData(1, 7);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_Completion_client(driver));
	oSelection1.selectByVisibleText(Comclient);
	P017_Reports_Page.waitFor();
	String ComDate = ExcelUtils.getCellData(1, 8);
	P017_Reports_Page.Date_Completion_Date(driver).sendKeys(ComDate);
	P017_Reports_Page.BTN_Completion_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_Completion_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_OutstandingPaperwork_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_OutSPW_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_OutSPW_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation2(driver);
	P017_Reports_Page.waitFor();
	String OSPContractor = ExcelUtils.getCellData(1, 9);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_OutSPW_Contractor(driver));
	oSelection1.selectByVisibleText(OSPContractor);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.chk_OutSPW_Email(driver).click();
	P017_Reports_Page.BTN_OutSPW_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_OutSPW_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_DSLMonthlyEmissions_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_DSLMonthly_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_DSLMonthly_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation3(driver);
	P017_Reports_Page.waitFor();
	String DSLStartDate = ExcelUtils.getCellData(1, 10);
	P017_Reports_Page.date_DSLMonthly_StartDate(driver).sendKeys(
		DSLStartDate);
	P017_Reports_Page.waitFor();
	String DSLEndDate = ExcelUtils.getCellData(1, 11);
	P017_Reports_Page.date_DSLMonthly_EndDate(driver).sendKeys(DSLEndDate);
	P017_Reports_Page.BTN_DSLMonthly_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_DSLMonthly_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_AAPTStock_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_AAPTStock_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AAPTStock_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation4(driver);
	P017_Reports_Page.waitFor();
	String AAPTStockDate = ExcelUtils.getCellData(1, 12);
	P017_Reports_Page.date_AAPTStock_Date(driver).sendKeys(AAPTStockDate);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AAPTStock_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_AAPTStock_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_TOWCompleted_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_TOWComplete_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_TOWComplete_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation4(driver);
	P017_Reports_Page.waitFor();
	String TOWDate = ExcelUtils.getCellData(1, 13);
	P017_Reports_Page.date_TOWComplete_Date(driver).sendKeys(TOWDate);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_TOWComplete_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_TOWComplete_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_ScheduleItem_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_ScheduleItemQty_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_ScheduleItemQty_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation5(driver);
	P017_Reports_Page.waitFor();
	String ScheduleItemQty = ExcelUtils.getCellData(1, 14);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_ScheduleItemQty_client(driver));
	oSelection1.selectByVisibleText(ScheduleItemQty);
	P017_Reports_Page.waitFor();
	String SIStartDate = ExcelUtils.getCellData(1, 15);
	P017_Reports_Page.date_ScheduleItemQty_StartDate(driver).sendKeys(
		SIStartDate);
	P017_Reports_Page.waitFor();
	String SIEndDate = ExcelUtils.getCellData(1, 16);
	P017_Reports_Page.date_ScheduleItemQty_EndDate(driver).sendKeys(
		SIEndDate);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_ScheduleItemQty_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_ScheduleItemQty_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_P1JobCardsReceived_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_P1_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P1_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation4(driver);
	P017_Reports_Page.waitFor();
	String P1Date = ExcelUtils.getCellData(1, 17);
	P017_Reports_Page.date_P1_Date(driver).sendKeys(P1Date);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P1_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_P2AppointmentBooked_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_P2_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P2_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation4(driver);
	P017_Reports_Page.waitFor();
	String P2Date = ExcelUtils.getCellData(1, 18);
	P017_Reports_Page.date_P2_Date(driver).sendKeys(P2Date);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P2_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P2_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();
    }

    @Test
    public void Report_P3AppointmentsNotBooked_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_P3_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P3_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation4(driver);
	P017_Reports_Page.waitFor();
	String P3Date = ExcelUtils.getCellData(1, 19);
	P017_Reports_Page.date_P3_Date(driver).sendKeys(P3Date);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P3_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P3_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();
    }

    @Test
    public void Report_P4InstallationCompleted_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_P4_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P4_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation4(driver);
	P017_Reports_Page.waitFor();
	String P3Date = ExcelUtils.getCellData(1, 20);
	P017_Reports_Page.date_P4_Date(driver).sendKeys(P3Date);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_P4_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();
    }

    @Test
    public void Report_PxxAppointmentBooked_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_Pxx_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_Pxx_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation1(driver);
	P017_Reports_Page.waitFor();
	String pxxclient = ExcelUtils.getCellData(1, 21);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_PXX_Client(driver));
	oSelection1.selectByVisibleText(pxxclient);
	P017_Reports_Page.waitFor();
	String pxxDate = ExcelUtils.getCellData(1, 22);
	P017_Reports_Page.date_Pxx_Date(driver).sendKeys(pxxDate);
	P017_Reports_Page.BTN_Pxx_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_Pxx_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_EndOfDayDaily_Page(WebDriver driver) throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_EndOfDay_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_EndOfDay_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	A017_Reports_Action.MandatoryValidation1(driver);
	P017_Reports_Page.waitFor();
	String EODclient = ExcelUtils.getCellData(1, 23);
	Select oSelection1 = new Select(
		P017_Reports_Page.DDN_EndOfDay_Client(driver));
	oSelection1.selectByVisibleText(EODclient);
	P017_Reports_Page.waitFor();
	String EODDate = ExcelUtils.getCellData(1, 24);
	P017_Reports_Page.date_EndOfDay_Date(driver).sendKeys(EODDate);
	P017_Reports_Page.BTN_EndOfDay_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_EndOfDay_Clear(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    @Test
    public void Report_iiNetdailyWiFiStatus_Page(WebDriver driver)
	    throws Exception {
	P017_Reports_Page.waitFor();
	P017_Reports_Page.IMG_rpt_iiNet_View(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.Report_iframe(driver);
	P017_Reports_Page.waitFor();
	P017_Reports_Page.BTN_iiNet_ViewReport(driver).click();
	P017_Reports_Page.waitFor();
	P017_Reports_Page.ICON_AcknowledgementRpt_Close(driver);
	P017_Reports_Page.waitFor();

    }

    public static void MandatoryValidation1(WebDriver driver) throws Exception {
	String message1 = P017_Reports_Page.RptVal_Client(driver).getText();
	String message2 = P017_Reports_Page.RptVal_Date(driver).getText();
	String Validation1 = ExcelUtils.getCellData(1, 25);
	String Validation2 = ExcelUtils.getCellData(1, 26);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message2);
	}
    }

    public static void MandatoryValidation2(WebDriver driver) throws Exception {

	String message1 = P017_Reports_Page.OSP_RptVal_Check(driver).getText();
	String Validation1 = ExcelUtils.getCellData(1, 33);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message1);
	}
    }

    public static void MandatoryValidation3(WebDriver driver) throws Exception {

	String message1 = P017_Reports_Page.DSL_RptVal_StartDate(driver)
		.getText();
	String message2 = P017_Reports_Page.DSL_RptVal_EndDate(driver)
		.getText();
	String Validation1 = ExcelUtils.getCellData(1, 37);
	String Validation2 = ExcelUtils.getCellData(1, 38);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message2);
	}
    }

    public static void MandatoryValidation4(WebDriver driver) throws Exception {

	String message1 = P017_Reports_Page.AAPT_RptVal_Date(driver).getText();
	String Validation1 = ExcelUtils.getCellData(1, 39);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message1);
	}
    }

    public static void MandatoryValidation5(WebDriver driver) throws Exception {

	String message1 = P017_Reports_Page.SIQ_RptVal_Client(driver).getText();
	String message2 = P017_Reports_Page.SIQ_RptVal_Startdate(driver)
		.getText();
	String message3 = P017_Reports_Page.SIQ_RptVal_EndDate(driver)
		.getText();
	String Validation1 = ExcelUtils.getCellData(1, 41);
	String Validation2 = ExcelUtils.getCellData(1, 42);
	String Validation3 = ExcelUtils.getCellData(1, 43);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log(
		    "TC017_Reports_Page : "
			    + "Label Message - Label Message - Mandatory Verification - PASSED",
		    true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC017_Reports_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message3);
	}

    }
}
