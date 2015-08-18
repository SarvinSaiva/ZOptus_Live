package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Mobility_WorkMilestones_Page;

public class Mobility_WorkMilestones_Action {

    @Test
    public void WorkMilestones_Menu(WebDriver driver) throws Exception {
	Mobility_WorkMilestones_Page.waitForLoad(driver);
	Mobility_WorkMilestones_Page.btn_Milestone(driver).click();
	Mobility_WorkMilestones_Page.waitForLoad(driver);
	Reporter.log("Click on Work Milestones Menu");
	Verification_Action.Execute(driver);
    }
}
