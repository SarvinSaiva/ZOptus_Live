package Zoptusmodule;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MailUtility.JavaMail_Old;
import Utility.Constant;
import Utility.ExcelUtils;
import appmodule.Mobility_Dashboard_Action;
import appmodule.Mobility_SignIn_Action;
import appmodule.Mobility_WorkDetails_Action;

public class TC012_Mobility_WorkDetails_Page {

    WebDriver driver;
    public Exception Mobility_WorkDetails_Page_Excp;

    @Test(priority = 1)
    public void WorkDetails_SignIn() throws Exception {
	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData, "sheet1");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(Constant.MURL);
	Mobility_SignIn_Action.Execute(driver);
    }

    @Test(priority = 2)
    public void Dashboard_WorkDetails_Search() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_Search(driver);
    }

    @Test(priority = 3)
    public void WorkDetails_Menu() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_Menu(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_WorkDetailsTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_WorkDetailsTable(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_SiteDetailsTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_SiteDetailsTable(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_SAEDTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_SAEDTable(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_BuildTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_BuildTable(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_FinanceTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_FinanceTable(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_PTWsTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_PTWsTable(driver);
    }

    @Test(enabled = false)
    public void WorkDetails_OutagesTable() throws Exception {
	Mobility_WorkDetails_Action MWA = new Mobility_WorkDetails_Action();
	MWA.WorkDetails_OutagesTable(driver);
    }

    @BeforeTest
    public void bft() {

	// ChromeOptions options = new ChromeOptions();
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
	/*
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:/ChromeDriver/chromedriver.exe");
	 */
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
    }

    @AfterTest
    public void Aft() {
	driver.quit();
    }

    @AfterMethod
    public Exception OnFailure(ITestResult testResult) throws IOException {
	try {
	    Calendar cal = Calendar.getInstance();
	    Date time = cal.getTime();
	    String timestamp = time.toString();
	    System.out.println(timestamp);
	    String systime = timestamp.replace(":", "-");
	    System.out.println(systime);
	    Reporter.log(systime);

	    if (testResult.getStatus() == ITestResult.FAILURE) {

		File file = new File("");
		File scrFile = ((TakesScreenshot) driver)
			.getScreenshotAs(OutputType.FILE);
		file.getAbsolutePath();

		FileUtils.copyFile(scrFile,
			new File("\\\\CIS20\\XSLT_Reports\\Error_Screenshots",
				file.getAbsolutePath() + testResult.getName()
					+ "\\Error_" + systime + ".jpg"));
	    }
	} catch (Exception e) {
	    e.getMessage();
	    JavaMail_Old jm = new JavaMail_Old();
	    jm.TC012_Mobility_WorkDetails_Page_Exception(e);

	}
	return null;

    }

}
