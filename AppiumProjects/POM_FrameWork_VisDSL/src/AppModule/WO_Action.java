package AppModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageObject.P002_Tow_WorkOrder_Page;
import Utility.ExcelUtils;

public class WO_Action {

    public static void Execute(WebDriver driver) throws Exception {
	// TODO Auto-generated method stub
	P002_Tow_WorkOrder_Page.waitFor();
	String jobtype = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P002_Tow_WorkOrder_Page.DDN_Jobtype(driver));
	oSelection1.selectByVisibleText(jobtype);
	P002_Tow_WorkOrder_Page.waitFor();
	String Ref = ExcelUtils.getCellData(1, 3);
	P002_Tow_WorkOrder_Page.txt_Ref(driver).sendKeys(Ref);
	String Ref2 = ExcelUtils.getCellData(1, 4);
	P002_Tow_WorkOrder_Page.txt_Ref2(driver).sendKeys(Ref2);
	String FFN = ExcelUtils.getCellData(1, 5);
	P002_Tow_WorkOrder_Page.txt_FNN(driver).sendKeys(FFN);
	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.btn_WO_Save(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();
	String Contractor = ExcelUtils.getCellData(1, 18);
	Select oSelection2 = new Select(
		P002_Tow_WorkOrder_Page.DDN_contractor(driver));
	oSelection2.selectByVisibleText(Contractor);
	P002_Tow_WorkOrder_Page.waitFor();
    }

}
