package appmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Mobility_WorkMaterials_Page;

public class Mobility_WorkMaterials_Action {

    @Test
    public void WorkMaterials_Search(WebDriver driver) throws Exception {
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Mobility_WorkMaterials_Page.txtbx_Search_Site(driver).sendKeys("M1234");
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Mobility_WorkMaterials_Page.drop_Search_Site(driver).click();
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Reporter.log("Search site in Dashboard Search");
	Verification_Action.Execute(driver);
    }

    @Test
    public void WorkMaterials_Menu(WebDriver driver) throws Exception {

	Actions act = new Actions(driver);
	act.moveToElement(Mobility_WorkMaterials_Page.btn_WorkMaterials(driver))
		.doubleClick().build().perform();

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Reporter.log("Click on Work Materials Menu");
	Verification_Action.Execute(driver);
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Mobility_WorkMaterials_Page.tab_VPLIssue(driver).click();
	Reporter.log("Click on VPL Issue Tab");
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Mobility_WorkMaterials_Page.tab_ExTraywork(driver).click();
	Mobility_WorkMaterials_Page.waitForLoad(driver);
	Reporter.log("Click on External Traywork Tab");
	Verification_Action.Execute(driver);
	Mobility_WorkMaterials_Page.waitForLoad(driver);
    }
}
