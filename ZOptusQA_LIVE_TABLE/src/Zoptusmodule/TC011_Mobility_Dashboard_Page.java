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

import MailUtility.JavaMail;
import Utility.Constant;
import Utility.ExcelUtils;
import appmodule.Mobility_Dashboard_Action;
import appmodule.Mobility_SignIn_Action;

public class TC011_Mobility_Dashboard_Page {

    WebDriver driver;
    public Exception Mobility_Dashboard_Page_Excp;

    @Test(priority = 1)
    public void Dashboard_SignIn() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData, "sheet1");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(Constant.MURL);
	Mobility_SignIn_Action.Execute(driver);
    }

    @Test(priority = 2)
    public void Dashboard_SiteDetail_Search() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_Search(driver);
    }

    @Test(priority = 3)
    public void Dashboard_SiteDoc_Today() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteDoc_Today(driver);
    }

    @Test(priority = 4)
    public void Dashboard_SiteDoc_Yesterday() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteDoc_Yesterday(driver);
    }

    @Test(priority = 5)
    public void Dashboard_SiteDoc_Lastweek() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteDoc_Lastweek(driver);
    }

    @Test(priority = 6)
    public void Dashboard_SiteDoc_InProgress() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteDoc_InProgress(driver);
    }

    @Test(priority = 7)
    public void Dashboard_SiteDoc_Complete() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteDoc_Complete(driver);
    }

    @Test(priority = 8)
    public void Dashboard_SiteIssue_Today() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_Today(driver);
    }

    @Test(priority = 9)
    public void Dashboard_SiteIssue_Yesterday() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_Yesterday(driver);
    }

    @Test(priority = 10)
    public void Dashboard_SiteIssue_Lastweek() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_Lastweek(driver);
    }

    @Test(priority = 11)
    public void Dashboard_SiteIssue_OpenHigh() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_High(driver);
    }

    @Test(priority = 12)
    public void Dashboard_SiteIssue_OpenMed() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_Medium(driver);
    }

    @Test(priority = 13)
    public void Dashboard_SiteIssue_OpenLow() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_Low(driver);
    }

    @Test(priority = 14)
    public void Dashboard_SiteIssue_Complete() throws Exception {
	Mobility_Dashboard_Action MDB = new Mobility_Dashboard_Action();
	MDB.Dashboard_SiteIssue_Complete(driver);
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
	    JavaMail JM = new JavaMail();
	    JM.TC011_Mobility_Dashboard_Page_Exception(e);

	}
	return null;

    }

}
