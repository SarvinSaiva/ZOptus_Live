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
import AppModule.A020_Maintenance_Action;
import Utility.Constant;
import Utility.ExcelUtils;

public class TC020_Maintenance_Page {

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
    public void JobType_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Job Type_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.JobType_Maint(driver);

    }

    @Test(priority = 2)
    public void Status_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Status_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Status_Maint(driver);

    }

    @Test(priority = 3)
    public void InstallType_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_InstallType_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.InstallType_Maint(driver);

    }

    @Test(priority = 4)
    public void Priority_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Priority_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Priority_Maint(driver);

    }

    @Test(priority = 5)
    public void State_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_State_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.State_Maint(driver);

    }

    @Test(priority = 6)
    public void Exchange_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Exch_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Exch_Maint(driver);

    }

    @Test(priority = 7)
    public void LineType_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_LineType_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.LineType_Maint(driver);
    }

    @Test(priority = 8)
    public void ClearoffCodes_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_ClearoffCodes_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.ClearOffCodes_Maint(driver);

    }

    @Test(priority = 9)
    public void Zone_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Zone_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Zone_Maint(driver);

    }

    @Test(priority = 10)
    public void CPEType_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_CPEType_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.CPEType_Maint(driver);

    }

    @Test(priority = 11)
    public void Task_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Task_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Task_Maint(driver);

    }

    @Test(priority = 12)
    public void NTUType_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_NTUType_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.NTUTypes_Maint(driver);

    }

    @Test(priority = 13)
    public void DTOWCategory_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_DTOWCategory_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.DTOWCategory_Maint(driver);

    }

    @Test(priority = 14)
    public void DTOWReason_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_DTOWReason_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.DTOWReason_Maint(driver);

    }

    @Test(priority = 15)
    public void Client_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Client_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Client_Maint(driver);

    }

    @Test(priority = 16)
    public void APIBooking_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_APIBooking_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.APIBooking_Maint(driver);

    }

    @Test(priority = 17)
    public void Contractors_Maint_PAGE() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"Maint_Contractors_TestData");
	A020_Maintenance_Action MT = new A020_Maintenance_Action();
	MT.Contractors_Maint(driver);

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
