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
import org.openqa.selenium.WebElement;
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
import appmodule.Desktop_Report_Action;
import appmodule.Desktop_SignIn_Action;

public class TC008_Desktop_Reports_Page {

    @SuppressWarnings("unused")
    private static WebElement element = null;

    WebDriver driver;
    public Exception Desktop_Reports_Page_Excp;

    @Test(priority = 1)
    public void Reports_SignIn() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData, "Sheet1");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Constant.URL);
	Desktop_SignIn_Action.Execute(driver);
    }

    @Test(priority = 2)
    public void Reports_PMO_Page() throws Exception {
	Desktop_Report_Action RPA = new Desktop_Report_Action();
	RPA.PMO_reports(driver);

    }

    @Test(priority = 3)
    public void Reports_Finance_Page() throws Exception {
	Desktop_Report_Action RPA = new Desktop_Report_Action();
	RPA.Finance_reports(driver);
    }

    @Test(priority = 4)
    public void Reports_Logistics_Page() throws Exception {
	Desktop_Report_Action RPA = new Desktop_Report_Action();
	RPA.Logistics_reports(driver);
    }

    @Test(priority = 5)
    public void Reports_Delivery_Page() throws Exception {
	Desktop_Report_Action RPA = new Desktop_Report_Action();
	RPA.Delivery_reports(driver);
    }

    @Test(priority = 6)
    public void Reports_ViewMap_Page() throws Exception {
	Desktop_Report_Action RPA = new Desktop_Report_Action();
	RPA.View_Map(driver);
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
	    JM.TC008_Desktop_Reports_Page_Exception(e);

	}
	return null;

    }

}
