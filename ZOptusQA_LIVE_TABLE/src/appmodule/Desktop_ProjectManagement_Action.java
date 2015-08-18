package appmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_ProjectManagement_Page;

public class Desktop_ProjectManagement_Action {

    @Test
    public void ProjectMgnt_Tabs(WebDriver driver) throws Exception {

	Desktop_ProjectManagement_Page.tab_projectmanagement(driver).click();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Reporter.log("Click on ProjectManagement - ProjectMgnt Menu");
	Verification_Action.Execute(driver);
	Desktop_ProjectManagement_Page.tab_projectmanagementNSW(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on ProjectManagement - NSW Tab");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_projectmanagementQLD(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on ProjectManagement - QLD Tab");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_projectmanagementSA(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on ProjectManagement - SA Tab");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_projectmanagementVIC(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on ProjectManagement - VIC Tab");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_projectmanagementWA(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on ProjectManagement - WA Tab");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
    }

    @Test
    public void ProjectMgnt_Tags(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_Tags(driver).click();
	Verification_Action.Execute(driver);
	Reporter.log("Click on ProjectManagement - Tags Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void ProjectMgnt_ProgramWorks_Details(WebDriver driver)
	    throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);

	Actions action1 = new Actions(driver);
	action1.moveToElement(
		Desktop_ProjectManagement_Page.tab_PM_Program_Works(driver)).build()
		.perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_Program_Details(driver).click();
	Reporter.log("Click on Program of Works - Details Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.txtbx_Change_Work(driver).sendKeys("ejv");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.DwnKey_Change_Work(driver);
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.EnterKey_Change_Work(driver);
	Desktop_ProjectManagement_Page.waitForLoad(driver);
    }

    @Test
    public void ProjectMgnt_ProgramWorks_Documents(WebDriver driver)
	    throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);

	Actions action1 = new Actions(driver);
	action1.moveToElement(
		Desktop_ProjectManagement_Page.tab_PM_Program_Works(driver)).build()
		.perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_Program_Documents(driver).click();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Reporter.log("Click on Program of Works - Documents Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_ProjectManagement_Page.waitForLoad(driver);
    }

    @Test
    public void ProjectMgnt_ProgramWorks_IssueRegister(WebDriver driver)
	    throws Exception {
	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);

	Actions action1 = new Actions(driver);
	action1.moveToElement(
		Desktop_ProjectManagement_Page.tab_PM_Program_Works(driver)).build()
		.perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_Program_IssueRegister(driver).click();
	Reporter.log("Click on Program of Works - IssueRegister Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void ProjectMgnt_Documents(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_PM_Documents(driver).click();
	Reporter.log("Click on ProjectManagement - Documents Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);

    }

    @Test
    public void ProjectMgnt_IssueRegister(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_PM_IssueRegister(driver).click();
	Reporter.log("Click on ProjectManagement - IssueRegister Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void ProjectMgnt_YearlyPrgm(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Desktop_ProjectManagement_Page.tab_PM_YearlyPrgm(driver).click();
	Reporter.log("Click on ProjectManagement - YearlyProgram Menu");
	Desktop_ProjectManagement_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

}
