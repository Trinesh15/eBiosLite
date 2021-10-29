package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BasePage;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.StatementofAccountPage;

public class ClickCreditNotePrint extends  BaseTest{
	
	@Test
	public void ClickCreditNotePrint() {
		
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA",16, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling();  // click on billing module
		logIn.clickLogin();   // click on login button 
		
		
		StatementofAccountPage SOA = new StatementofAccountPage(driver);
		NavigateToPages  navigate = new NavigateToPages(driver);
		navigate.NaviagetToStatementofAccount();
		SOA.setUHID(UHID);
		//SOA.PrintCreditNoteSlip();
//		SOA.PrintInvoiceSummary();
//		SOA.clickYes();
		
		
		
		
	}

}
