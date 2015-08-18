package appmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_Sites_Page;

public class Desktop_Sites_Action {

    @Test
    public void Sites_SiteDetails(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='MainSite']/img"));
	// element.click();

	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();

	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.btn_sitedetails(driver).click();
	Reporter.log("Click on Sites - SiteDetails Menu");
	Verification_Action.Execute(driver);
	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.txtbx_Change_Work(driver).sendKeys("m99");
	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.DwnKey_Change_Work(driver);
	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.EnterKey_Change_Work(driver);
	Desktop_Sites_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Sites_Sitedocuments(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='MainSite']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element).build().perform();
	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.btn_sitedocuments(driver).click();
	Reporter.log("Click on Sites - SiteDocuments Menu");
	Desktop_Sites_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

    @Test
    public void Sites_IssueRegister(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='MainSite']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element).build().perform();
	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.btn_IssueRegister(driver).click();
	Reporter.log("Click on Sites - IssueRegister Menu");
	Desktop_Sites_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);

    }

    @Test
    public void Sites_Faults(WebDriver driver) throws Exception {

	WebElement element = driver.findElement(By
		.xpath(".//*[@id='MainSite']/img"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element).build().perform();
	Desktop_Sites_Page.waitForLoad(driver);
	Desktop_Sites_Page.btn_Faults(driver).click();
	Reporter.log("Click on Sites - Faults Menu");
	Desktop_Sites_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }
}
