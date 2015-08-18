package appmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_WorkOrder_Page;

public class Desktop_Workorder_Action {

    @Test
    public void WorkOrder_Details(WebDriver driver) throws Exception {

	Desktop_WorkOrder_Page.txtbx_search(driver).sendKeys("m99");
	Desktop_WorkOrder_Page.btn_Searchworkorder(driver).click();
	WebElement element = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_details(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.txtbx_Change_Work(driver).sendKeys("M99");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.DwnKey_Change_Work(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.EnterKey_Change_Work(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Search workorder");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	// WorkOrder_Page.btn_editwrkorder(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on Edit workorder");
	Desktop_WorkOrder_Page.tab_resource(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Resource Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_saed(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - SAED Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_build(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Build Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_comments(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Comments Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_finance(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Finance Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_ptw(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - PTW Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_tags(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Tags Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_technology(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Technology Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_logs(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkOrder - Logs Tab");
	Desktop_WorkOrder_Page.waitForLoad(driver);

    }

    @Test
    public void WorkOrder_Documents(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_documents(driver).click();
	Reporter.log("Click on WorkOrder - Documents Menu");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.txtbx_Change_Work(driver).sendKeys("M99");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.DwnKey_Change_Work(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.EnterKey_Change_Work(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_work(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_arrowwork(driver).click();
	Reporter.log("Click on Work Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_sitepack(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_arrowsitepack(driver).click();
	Reporter.log("Click on SitePack Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_quality(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_arrowquality(driver).click();
	Reporter.log("Click on Quality Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_site(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_arrowsite(driver).click();
	Reporter.log("Click on Site Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_program(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_arrowprogram(driver).click();
	Reporter.log("Click on Program Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_project(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.div_arrowproject(driver).click();
	Reporter.log("Click on Project Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_siteforms(driver).click();
	Reporter.log("Click on Siteforms Table arrow");
	Desktop_WorkOrder_Page.waitForLoad(driver);
    }

    @Test
    public void WorkOrder_IssueRegister(WebDriver driver) throws Exception {
	WebElement element1 = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_IssueRegister(driver).click();
	Reporter.log("Click on WorkOrder - IssueRegister Menu");
	Thread.sleep(4000);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkOrder_Faults(WebDriver driver) throws Exception {
	WebElement element1 = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_Faults(driver).click();
	Reporter.log("Click on WorkOrder - Faults Menu");
	Thread.sleep(4000);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkOrder_Snag(WebDriver driver) throws Exception {
	WebElement element1 = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_snag(driver).click();
	Reporter.log("Click on WorkOrder - Snag Menu");
	Thread.sleep(4000);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkOrder_MaterialOrder(WebDriver driver) throws Exception {

	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	WebElement element2 = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action2 = new Actions(driver);
	action2.moveToElement(element2).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_materialordrng(driver).click();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	Reporter.log("Click on WorkOrder - Materialorder Menu");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_mtrlexternal(driver).click();
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Reporter.log("Click on Materialorder - External Tab");
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_mtrlprevious(driver).click();
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Reporter.log("Click on Materialorder - Previous Tab");
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);

    }

    @Test
    public void WorkOrder_Milestone(WebDriver driver) throws Exception {
	WebElement element3 = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action3 = new Actions(driver);
	action3.moveToElement(element3).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_milestone(driver).click();
	Reporter.log("Click on WorkOrder - Milestone Menu");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkOrder_BudgetTracker(WebDriver driver) throws Exception {
	WebElement element4 = driver.findElement(By
		.xpath("//*[@id='WorkOrder']/img"));
	Actions action4 = new Actions(driver);
	action4.moveToElement(element4).build().perform();
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.btn_budgettrcker(driver).click();
	Reporter.log("Click on WorkOrder - Budget Tracker Menu");
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_phase1(driver).click();
	Reporter.log("Click on Budget Tracker - Phase1 Tab");
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_phase2(driver).click();
	Reporter.log("Click on Budget Tracker - Phase2 Tab");
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_phase3(driver).click();
	Reporter.log("Click on Budget Tracker - Phase3 Tab");
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);
	Desktop_WorkOrder_Page.tab_phase4(driver).click();
	Reporter.log("Click on Budget Tracker - Phase4 Tab");
	Verification_Action.Execute(driver);
	Desktop_WorkOrder_Page.waitForLoad(driver);

    }

}
