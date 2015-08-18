package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Mobility_WorkDetails_Page;

public class Mobility_WorkDetails_Action {

    @Test
    public void WorkDetails_Menu(WebDriver driver) throws Exception {

	Mobility_WorkDetails_Page.btn_WorkDetails(driver).click();
	Reporter.log("Click on WorkDetails Menu");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_WorkDetailsTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_WorkDetailsTable(driver).click();
	Reporter.log("Click on WorkDetails Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_SiteDetailsTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_SiteDetailsTable(driver).click();
	Reporter.log("Click on SiteDetails Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_SAEDTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_SAEDTable(driver).click();
	Reporter.log("Click on SAED Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_BuildTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_BuildTable(driver).click();
	Reporter.log("Click on SAED Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_FinanceTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_FinanceTable(driver).click();
	Reporter.log("Click on Finance Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_PTWsTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_PTWsTable(driver).click();
	Reporter.log("Click on PTWs Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkDetails_OutagesTable(WebDriver driver) throws Exception {
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Mobility_WorkDetails_Page.WorkDetails_OutagesTable(driver).click();
	Reporter.log("Click on Outages Table");
	Mobility_WorkDetails_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

}
