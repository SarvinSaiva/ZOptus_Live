package VisDSLModule;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AppModule.A001_SignIn_Action;
import AppModule.A017_Reports_Action;
import Utility.Constant;
import Utility.ExcelUtils;

public class TC017_Reports_Page {

    WebDriver driver;

    @Test(priority = 0)
    public void TOW_SignIn_Page() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Login_TestData");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(Constant.URL);
	A001_SignIn_Action.Execute(driver);

    }

    @Test(priority = 1)
    public void Acknowledgement_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_Acknowledgement_Page(driver);

    }

    @Test(priority = 2)
    public void NoAppointment_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_NoAppointment_Page(driver);

    }

    @Test(priority = 3)
    public void Appointment_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_Appointment_Page(driver);

    }

    @Test(priority = 4)
    public void Completion_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_Completion_Page(driver);

    }

    @Test(priority = 5)
    public void OutstandingPaperwork_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_OutstandingPaperwork_Page(driver);

    }

    @Test(priority = 6)
    public void DSLMonthlyEmissions_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_DSLMonthlyEmissions_Page(driver);

    }

    @Test(priority = 7)
    public void AAPTStock_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_AAPTStock_Page(driver);

    }

    @Test(priority = 8)
    public void TOWCompleted_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_TOWCompleted_Page(driver);

    }

    @Test(priority = 9)
    public void ScheduleItem_Report_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_ScheduleItem_Page(driver);

    }

    @Test(priority = 10)
    public void P1_JobCardsReceived_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_P1JobCardsReceived_Page(driver);

    }

    @Test(priority = 11)
    public void P2_AppointmentBooked_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_P2AppointmentBooked_Page(driver);

    }

    @Test(priority = 12)
    public void P3_AppointmentsNotBooked_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_P3AppointmentsNotBooked_Page(driver);

    }

    @Test(priority = 13)
    public void P4_InstallationCompleted_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_P4InstallationCompleted_Page(driver);

    }

    @Test(priority = 14)
    public void Pxx_AppointmentBooked_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_PxxAppointmentBooked_Page(driver);

    }

    @Test(priority = 15)
    public void EndOfDayDaily_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_EndOfDayDaily_Page(driver);

    }

    @Test(priority = 16)
    public void iiNetdailyWiFiStatus_Report_PAGE() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Reports_TestData");
	A017_Reports_Action RPA = new A017_Reports_Action();
	RPA.Report_iiNetdailyWiFiStatus_Page(driver);

    }

    @BeforeTest
    public void bft() {

	System.setProperty("webdriver.chrome.logfile",
		"D:/ChromeDriver/chromedriver.log");
	System.setProperty("webdriver.chrome.driver",
		"D:/ChromeDriver/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments(Arrays.asList("--disable-application-cache",
		"--disable-password-autofill-public-suffix-domain-matching",
		"--no-sandbox", "--start-maximized",
		"allow-running-insecure-content", "ignore-certificate-errors"));

	options.addArguments("chrome.switches", "--disable-extensions");

	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
    }

    @AfterTest
    public void Aft() {
	driver.quit();
    }

}
