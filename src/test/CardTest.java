package test;

import org.testng.annotations.Test;

@Test(groups= {"sanity"}, enabled = true, description = "This test will be validate CC functionality")
public class CardTest extends BaseClass {
	
	
	public void CCTest()   {
	
       System.out.println("Inside CC Test");
}
}