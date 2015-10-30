package AppModule;

import org.openqa.selenium.WebDriver;

import PageObject.P012_Tow_Delete_Page;

public class A012_Tow_Delete_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P012_Tow_Delete_Page.BTN_D_DeleteJob(driver).click();
	P012_Tow_Delete_Page.waitFor();
	P012_Tow_Delete_Page.BTN_D_YesDelete(driver).click();
	P012_Tow_Delete_Page.waitFor();
    }
}
