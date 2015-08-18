package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Mobility_Dashboard_Page;

public class Mobility_Dashboard_Action {

    @Test
    public void Dashboard_Search(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.txtbx_Search_Site(driver).sendKeys("M1234");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.DwnKey_Search_Site(driver);
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.EnterKey_Search_Site(driver);
	Reporter.log("Search site in Dashboard Search");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Mobility_Dashboard_Page.waitForLoad(driver);
    }

    @Test
    public void Dashboard_SiteDoc_Today(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteDoc_Today(driver).click();
	Reporter.log("Click on site documents Today button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteDoc_Yesterday(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteDoc_Yestrday(driver).click();
	Reporter.log("Click on site documents Yesterday button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteDoc_Lastweek(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteDoc_Lastweek(driver).click();
	Reporter.log("Click on site documents Lastweek button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteDoc_InProgress(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteDoc_Inprogress(driver).click();
	Reporter.log("Click on site documents InProgress button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteDoc_Complete(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteDoc_Complete(driver).click();
	Reporter.log("Click on site documents Complete button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteIssue_Today(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_Today(driver).click();
	Reporter.log("Click on site Issues Today button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteIssue_Yesterday(WebDriver driver)
	    throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_Yestrday(driver).click();
	Reporter.log("Click on site Issues Yesterday button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteIssue_Lastweek(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_Lastweek(driver).click();
	Reporter.log("Click on site Issues Lastweek button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Dashboard_SiteIssue_High(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_High(driver).click();
	Reporter.log("Click on site Issues Open(High) button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.btn_Dashboard(driver).click();
	Mobility_Dashboard_Page.waitForLoad(driver);
    }

    @Test
    public void Dashboard_SiteIssue_Medium(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_Medium(driver).click();
	Reporter.log("Click on site Issues Open(Medium) button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.btn_Dashboard(driver).click();
	Mobility_Dashboard_Page.waitForLoad(driver);
    }

    @Test
    public void Dashboard_SiteIssue_Low(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_Low(driver).click();
	Reporter.log("Click on site Issues Open(Low) button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.btn_Dashboard(driver).click();
	Mobility_Dashboard_Page.waitForLoad(driver);
    }

    @Test
    public void Dashboard_SiteIssue_Complete(WebDriver driver) throws Exception {
	Mobility_Dashboard_Page.btn_SiteIssue_Complete(driver).click();
	Reporter.log("Click on site Issues Complete button");
	Mobility_Dashboard_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Mobility_Dashboard_Page.waitForLoad(driver);
	Mobility_Dashboard_Page.btn_Dashboard(driver).click();
	Mobility_Dashboard_Page.waitForLoad(driver);
    }

}
