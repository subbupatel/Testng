package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups= {"regression"})
public class LoanTest extends BaseClass {
	    
	@Test(priority=2)
		public void PersonalLoanTest() {
			
			System.out.println("Inside Personal Loan Test");
		}
		
		@Test(enabled = true, priority=0)
		public void PersonalLoanTest1() {
			
			System.out.println("Inside Personal Loan Test 1");
		}
		
		@Test(priority=1)
		public void HomeLoanTest() {
			
			System.out.println("Inside HomeLoanTest Loan Test");
		}
		
			//maven.apache.org/download.cgi

}
 