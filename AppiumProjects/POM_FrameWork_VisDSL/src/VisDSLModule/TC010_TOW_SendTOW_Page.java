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
import AppModule.A010_Tow_SendTOW_Action;
import AppModule.WO_Action;
import Utility.Constant;
import Utility.ExcelUtils;

public class TC010_TOW_SendTOW_Page {

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
    public void TOW_WorkOrder_Page() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"WorkOrder_TestData");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WO_Action.Execute(driver);
    }

    @Test(priority = 2)
    public void TOW_SendTOW_Page() throws Exception {

	ExcelUtils.setExcelFile(
		Constant.Path_TestData + Constant.File_TestData,
		"SendTOW_TestData");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	A010_Tow_SendTOW_Action.Execute(driver);
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
