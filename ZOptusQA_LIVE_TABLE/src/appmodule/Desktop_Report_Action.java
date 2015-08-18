package appmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_Reports_Page;

public class Desktop_Report_Action {

    @Test
    public void PMO_reports(WebDriver driver) throws Exception {

	Desktop_Reports_Page.tab_Reports(driver).click();
	Desktop_Reports_Page.waitForLoad(driver);
	Desktop_Reports_Page.tab_PMO(driver).click();
	Desktop_Reports_Page.waitForLoad(driver);
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	Reporter.log("Click on Reports - PMO Menu");
	Desktop_Reports_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Finance_reports(WebDriver driver) throws Exception {

	Desktop_Reports_Page.tab_Reports(driver).click();
	Desktop_Reports_Page.waitForLoad(driver);
	Desktop_Reports_Page.tab_Finance(driver).click();
	Reporter.log("Click on Reports - Finance Menu");
	Desktop_Reports_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Logistics_reports(WebDriver driver) throws Exception {

	Desktop_Reports_Page.tab_Reports(driver).click();
	Desktop_Reports_Page.waitForLoad(driver);
	Desktop_Reports_Page.tab_Logistics(driver).click();
	Reporter.log("Click on Reports - Logistics Menu");
	Desktop_Reports_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Delivery_reports(WebDriver driver) throws Exception {
	Desktop_Reports_Page.tab_Reports(driver).click();
	Desktop_Reports_Page.waitForLoad(driver);
	Desktop_Reports_Page.tab_Delivery(driver).click();
	Reporter.log("Click on Reports - Delivery Menu");
	Desktop_Reports_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void View_Map(WebDriver driver) throws Exception {

	Desktop_Reports_Page.tab_Reports(driver).click();
	Desktop_Reports_Page.waitForLoad(driver);
	Desktop_Reports_Page.tab_Map(driver).click();
	Reporter.log("Click on Reports - ViewMap Menu");
	Desktop_Reports_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

}
