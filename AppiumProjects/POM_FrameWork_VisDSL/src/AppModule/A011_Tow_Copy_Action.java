package AppModule;

import org.openqa.selenium.WebDriver;

import PageObject.P011_Tow_Copy_Page;

public class A011_Tow_Copy_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P011_Tow_Copy_Page.BTN_C_CopyJob(driver).click();
	P011_Tow_Copy_Page.waitFor();
	// driver.switchTo().frame("IframeCopy");
	// Tow_Copy_Page.waitFor();
	P011_Tow_Copy_Page.BTN_ALERT_YesCopy(driver).click();
	P011_Tow_Copy_Page.waitFor();
    }

}
