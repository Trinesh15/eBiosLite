package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class AddMedandGiveDiscount extends BaseTest
{
	@Test
	public void testAddMedandGiveDiscount() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 9,5);
		String medication1 = Excel.getCellData(INPUT, "Billing", 21, 5);
		String medication2 = Excel.getCellData(INPUT, "Billing", 22, 5);
		String DrDisc1 = Excel.getCellData(INPUT, "Billing", 12, 5);
		String HospDisc1 = Excel.getCellData(INPUT, "Billing", 13, 5);
		String DrDisc2 = Excel.getCellData(INPUT, "Billing", 14, 5);
		String HospDisc2 = Excel.getCellData(INPUT, "Billing", 15, 5);
		
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		bp.clickServiceSlider();
		bp.verifySelectDept();
		bp.clickDepartmentDD();
		bp.clickHospitalmainstores();
		bp.clickOKinSelectDept();
		bp.AddMedications(medication1);
		bp.clickExpiryDateDD();
		bp.clickExpiryDate();
		bp.clickAddProducts();
		bp.AddMedications(medication2);
		bp.clickExpiryDateDD();
		bp.clickExpiryDate();
		bp.clickAddProducts();
		bp.setDrDiscinGrid1(DrDisc1);
		bp.setHospDiscinGrid1(HospDisc1);
		bp.setDrDiscinGrid2(DrDisc2);
		bp.setHospDiscinGrid2(HospDisc2);
		bp.ScrolltoPayment();
		bp.clickDiscApprovedByDD();
		bp.clickDiscApprovedbyAA();
		bp.selectBankTransfer();
		bp.clickBankDropDown();
		bp.clickAlphaBank();
		bp.clickSave();
		bp.clickDetailed();
		bp.clickA4();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeInvoicePopup();
		bp.closeReceiptPopup();
		
	}	

}
