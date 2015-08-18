package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Mobility_IssueRegister_Page;

public class Mobility_IssueRegister_Action {

    @Test
    public void IssueRegister_Menu(WebDriver driver) throws Exception {
	Mobility_IssueRegister_Page.waitForLoad(driver);
	Mobility_IssueRegister_Page.btn_IssueRegister(driver).click();
	Reporter.log("Click on IssueRegister Menu");
	Mobility_IssueRegister_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }
}
