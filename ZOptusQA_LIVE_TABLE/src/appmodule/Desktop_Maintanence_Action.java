package appmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_Maintanence_Page;

public class Desktop_Maintanence_Action {

    @Test
    public void Maintanence_UserAdmin(WebDriver driver) throws Exception {
	Desktop_Maintanence_Page.waitForLoad(driver);
	WebElement element = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	// Maintanence_Page.tab_Maintenance(driver).click();
	// Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_security(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_Useradmin(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - UserAdmin Menu");
    }

    @Test
    public void Maintanence_UserEventLog(WebDriver driver) throws Exception {
	// Maintanence_Page.tab_Maintenance(driver).click();
	WebElement element1 = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_security(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_UserEventLog(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - UserEventLog Menu");
    }

    @Test
    public void Maintanence_Materials(WebDriver driver) throws Exception {
	// Maintanence_Page.tab_Maintenance(driver).click();
	WebElement element2 = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action2 = new Actions(driver);
	action2.moveToElement(element2).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_materials(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - Materials Menu");
    }

    @Test
    public void Maintanence_WorkTypeBudget(WebDriver driver) throws Exception {
	// Maintanence_Page.tab_Maintenance(driver).click();
	WebElement element3 = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action3 = new Actions(driver);
	action3.moveToElement(element3).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_wrkTypeBudget(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - WorkTypeBudget Menu");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_wrkTypeBudgetPhase1(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkTypeBudget - Phase 1 tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_wrkTypeBudgetPhase2(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkTypeBudget - Phase 2 tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_wrkTypeBudgetPhase3(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkTypeBudget - Phase 3 tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_wrkTypeBudgetPhase4(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on WorkTypeBudget - Phase 4 tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
    }

    @Test
    public void Maintanence_ForAdmin(WebDriver driver) throws Exception {
	// Maintanence_Page.tab_Maintenance(driver).click();
	WebElement element4 = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action4 = new Actions(driver);
	action4.moveToElement(element4).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_formadmin(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - FormAdmin Menu");
	Desktop_Maintanence_Page.tab_formadmin1(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - FormAdmin Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_formadminShewms(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - SHEWMS Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);

    }

    @Test
    public void Maintanence_BulkUpload(WebDriver driver) throws Exception {
	// Maintanence_Page.tab_Maintenance(driver).click();
	WebElement element5 = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action5 = new Actions(driver);
	action5.moveToElement(element5).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_bulkupload(driver).click();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - BulkUpload Menu");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_milestone(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on BulkUpload - Milestone Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_purchaseorder(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on BulkUpload - PurchaseOrder Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_poPDS(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on BulkUpload - poPDS Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_claimhistory(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on BulkUpload - ClaimHistory Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_newworks(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on BulkUpload - Networks Tab");
	Desktop_Maintanence_Page.waitForLoad(driver);
    }

    @Test
    public void Maintanence_ResourceMgnt(WebDriver driver) throws Exception {

	WebElement element6 = driver.findElement(By
		.xpath(".//*[@id='Maintenance']/img"));
	Actions action6 = new Actions(driver);
	action6.moveToElement(element6).build().perform();
	Desktop_Maintanence_Page.waitForLoad(driver);
	Desktop_Maintanence_Page.tab_resourcemanag(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on Maintenance - ResourceManagement Menu");
	Desktop_Maintanence_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

}
