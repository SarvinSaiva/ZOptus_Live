package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_Commercial_Page;

public class Desktop_Commercial_Action {

    @Test
    public void Commercial_PurchaseOrder(WebDriver driver) throws Exception {

	Desktop_Commercial_Page.tab_Commercial(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Desktop_Commercial_Page.tab_purchaseorder(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Purchase Order Menu");
    }

    @Test
    public void Commercial_Claims(WebDriver driver) throws Exception {
	Desktop_Commercial_Page.tab_Commercial(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Desktop_Commercial_Page.tab_claims(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Claims Menu");
    }

    @Test
    public void Commercial_RequestToClient(WebDriver driver) throws Exception {
	Desktop_Commercial_Page.tab_Commercial(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Desktop_Commercial_Page.tab_requesttoclient(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Request To Client Menu");
    }

    @Test
    public void Commercial_RentalAgrmt(WebDriver driver) throws Exception {
	Desktop_Commercial_Page.waitForLoad(driver);
	Desktop_Commercial_Page.tab_Commercial(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Desktop_Commercial_Page.tab_rentalagreements(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Rental Agreement Menu");
    }

}
