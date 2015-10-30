package executionEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ExcelUtils;
import utility.Log;
import Config_App.ActionKeywords;
import Config_App.Constants;
import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

/**
 * @author SaivaduraiJ
 * 
 */
public class Appium_DriverScript {

    private WebDriver driver;

    public static Properties OR;
    public static ActionKeywords actionKeywords;
    public static String sActionKeyword;
    public static String sTestDesc;
    public static String sPageObject;
    public static Method method[];

    public static int iTestStep;
    public static int iTestLastStep;
    public static String sTestCaseID;
    public static String sRunMode;
    public static String sReportRunMode;
    public static String sData;
    public static String TestStepResult;
    public static String TC1 = "LogIn_01";
    public static boolean bResult;

    @Test
    public void Appium_AppManager() {
	try {
	    ExcelUtils.setExcelFile(Constants.Path_TestData);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	DOMConfigurator.configure("log4j.xml");
	String Path_OR = Constants.Path_OR;
	FileInputStream fs = null;
	try {
	    fs = new FileInputStream(Path_OR);
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	OR = new Properties(System.getProperties());
	try {
	    OR.load(fs);
	} catch (IOException e) {
	    e.printStackTrace();
	}

	Appium_DriverScript startEngine = null;
	try {
	    startEngine = new Appium_DriverScript();
	} catch (NoSuchMethodException e1) {
	    e1.printStackTrace();
	} catch (SecurityException e1) {
	    e1.printStackTrace();
	}
	try {
	    startEngine.execute_Appium_AppManager();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    @Test
    public Appium_DriverScript() throws NoSuchMethodException,
	    SecurityException {
	actionKeywords = new ActionKeywords();
	method = actionKeywords.getClass().getMethods();
    }

    private void execute_Appium_AppManager() throws Exception {

	int iTotalTestCases = ExcelUtils.getRowCount(Constants.Sheet_TestCases);
	for (int iTestcase = 1; iTestcase < iTotalTestCases; iTestcase++) {
	    bResult = true;
	    sTestCaseID = ExcelUtils.getCellData(iTestcase,
		    Constants.Col_TestCaseID, Constants.Sheet_TestCases);

	    sRunMode = ExcelUtils.getCellData(iTestcase, Constants.Col_RunMode,
		    Constants.Sheet_TestCases);

	    if (sRunMode.equals("Yes") && TC1.equals(sTestCaseID)) {
		iTestStep = ExcelUtils.getRowContains(sTestCaseID,
			Constants.Col_TestCaseID, Constants.Sheet_TestSteps);
		iTestLastStep = ExcelUtils.getTestStepsCount(
			Constants.Sheet_TestSteps, sTestCaseID, iTestStep);
	    }
	    bResult = true;
	    for (; iTestStep < iTestLastStep; iTestStep++) {

		sActionKeyword = ExcelUtils.getCellData(iTestStep,
			Constants.Col_ActionKeyword, Constants.Sheet_TestSteps);

		sTestDesc = ExcelUtils.getCellData(iTestStep,
			Constants.Col_TestDescription,
			Constants.Sheet_TestSteps);

		sPageObject = ExcelUtils.getCellData(iTestStep,
			Constants.Col_PageObject, Constants.Sheet_TestSteps);

		sData = ExcelUtils.getCellData(iTestStep,

		Constants.Col_DataSet, Constants.Sheet_TestSteps);

		execute_AppiumActions_AppManager();

		ATUReports.add(sTestDesc, sPageObject, sData, sData,
			LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));

		ATUReports.setAuthorInfo("SaivaduraiJ", Utils.getCurrentTime(),
			"1.0");

		if (bResult == false) {
		    ExcelUtils.setCellData(Constants.KEYWORD_FAIL, iTestcase,
			    Constants.Col_Result, Constants.Sheet_TestCases);
		    Log.endTestCase(sTestCaseID);
		    break;
		}
	    }
	    if (bResult == true) {
		ExcelUtils.setCellData(Constants.KEYWORD_PASS, iTestcase,
			Constants.Col_Result, Constants.Sheet_TestCases);
		Log.endTestCase(sTestCaseID);

	    }

	}
    }

    private static void execute_AppiumActions_AppManager() throws Exception,
	    IllegalAccessException, IllegalArgumentException,
	    InvocationTargetException {

	for (int i = 0; i < method.length && TC1.equals(sTestCaseID); i++) {
	    if (method[i].getName().equals(sActionKeyword)
		    && TC1.equals(sTestCaseID)) {
		method[i].invoke(actionKeywords, sPageObject, sData);
		if (bResult == true) {
		    ExcelUtils.setCellData(Constants.KEYWORD_PASS, iTestStep,
			    Constants.Col_TestStepResult,
			    Constants.Sheet_TestSteps);
		} else {

		    ExcelUtils.setCellData(Constants.KEYWORD_FAIL, iTestStep,
			    Constants.Col_TestStepResult,
			    Constants.Sheet_TestSteps);
		    try {
			method[i].invoke(actionKeywords, sPageObject, sData);
			TestStepResult = ExcelUtils.getCellData(iTestStep,
				Constants.Col_TestStepResult,
				Constants.Sheet_TestSteps);

			if (TestStepResult.equals("FAIL")) {
			    ATUReports.add(sTestDesc, TestStepResult, "",
				    LogAs.FAILED, new CaptureScreen(
					    ScreenshotOf.DESKTOP));
			    Assert.fail("I have thrown Exception for Fail - Not able to\t"
				    + sTestDesc);
			    break;
			}
		    } catch (Exception e1) {
			e1.getStackTrace();
		    }
		}

	    }
	}
    }

    @BeforeMethod
    public void beforemethod() {

	ATUReports.setWebDriver(driver);
	ATUReports.indexPageDescription = "Appium Mobile Automation Testing";

    }

    @AfterMethod
    public void AfterMethod1() throws IllegalAccessException,
	    IllegalArgumentException, InvocationTargetException {

	System.out.println("Test Cases Execution successfully completed");
	ActionKeywords.QuitApp("", "");
    }
}