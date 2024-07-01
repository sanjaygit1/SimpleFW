package testNG;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority = 1)
	public void createContact()
	{
		System.out.println("contact created");
	}
	
	@Test(invocationCount = 3)
	public void modifyContact()
	{
		System.out.println("contact modifed");
	}
	
	@Test(priority = 0)
	public void deleteContact()
	{
		System.out.println("contact deleted");
	}
}
