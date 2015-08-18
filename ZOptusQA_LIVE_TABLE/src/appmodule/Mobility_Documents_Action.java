package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Mobility_Documents_Page;

public class Mobility_Documents_Action {

    @Test
    public void Documents_Menu(WebDriver driver) throws Exception {
	Mobility_Documents_Page.waitForLoad(driver);
	Mobility_Documents_Page.btn_Documents(driver).click();
	Reporter.log("Click on Documents Menu");
	Mobility_Documents_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }
}
