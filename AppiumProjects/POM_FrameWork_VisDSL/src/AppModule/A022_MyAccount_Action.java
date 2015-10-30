package AppModule;

import org.openqa.selenium.WebDriver;

import PageObject.P022_MyAccount_Page;
import Utility.ExcelUtils;

public class A022_MyAccount_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P022_MyAccount_Page.waitFor();
	P022_MyAccount_Page.IMG_HDR_myaccount(driver).click();
	P022_MyAccount_Page.waitFor();
	String oldpassword = ExcelUtils.getCellData(1, 1);
	P022_MyAccount_Page.TXTBX_ACC_oldpassword(driver).sendKeys(oldpassword);
	String newpassword = ExcelUtils.getCellData(1, 2);
	P022_MyAccount_Page.TXTBX_ACC_newpassword(driver).sendKeys(newpassword);
	String confirmpasswd = ExcelUtils.getCellData(1, 2);
	P022_MyAccount_Page.TXTBX_ACC_confirmpasswd(driver).sendKeys(
		confirmpasswd);
	P022_MyAccount_Page.LNK_logout(driver).click();
	P022_MyAccount_Page.waitFor();
    }

}
