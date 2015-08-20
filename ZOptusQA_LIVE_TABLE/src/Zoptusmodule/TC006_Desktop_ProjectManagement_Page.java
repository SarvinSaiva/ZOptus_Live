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
import appmodule.Desktop_ProjectManagement_Action;
import appmodule.Desktop_SignIn_Action;

public class TC006_Desktop_ProjectManagement_Page {

    WebDriver driver;
    public Exception Desktop_ProjectManagement_Page_Excp;

    @Test(priority = 1)
    public void ProjectMangement_SignIN() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData, "Sheet1");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(Constant.URL);

	Desktop_SignIn_Action.Execute(driver);

    }

    @Test(priority = 2)
    public void ProjectManagement_Tabs_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_Tabs(driver);
    }

    @Test(priority = 3)
    public void ProjectManagement_Prgm_Details_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_ProgramWorks_Details(driver);
    }

    @Test(priority = 4)
    public void ProjectManagement_Prgm_Documents_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_ProgramWorks_Documents(driver);
    }

    @Test(priority = 5)
    public void ProjectManagement_Prgm_IssueRegister_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_ProgramWorks_IssueRegister(driver);
    }

    @Test(priority = 6)
    public void ProjectManagement_Documents_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_Documents(driver);
    }

    @Test(priority = 7)
    public void ProjectManagement_IssueRegister_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_IssueRegister(driver);
    }

    @Test(priority = 8)
    public void ProjectManagement_Tags_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_Tags(driver);
    }

    @Test(priority = 9)
    public void ProjectManagement_YearlyPrgmSummary_Page() throws Exception {
	Desktop_ProjectManagement_Action PM = new Desktop_ProjectManagement_Action();
	PM.ProjectMgnt_YearlyPrgm(driver);
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
	 * "D:\\ChromeDriver\\chromedriver.exe");
	 */driver = new ChromeDriver(options);

	// driver = new ChromeDriver();
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
	    jm.TC006_Desktop_ProjectManagement_Page_Exception(e);

	}
	return null;

    }

}
