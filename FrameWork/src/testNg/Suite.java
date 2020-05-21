package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite {
	@BeforeSuite
	public void g()
	{
		System.out.println("Testng");
	}
	
	@BeforeMethod
	public void pqr()
	{
		System.out.println("Testng");
	}
	@Test
	public void abc1()
	{
		System.out.println("Testng");
	}
	@AfterMethod
	public void pqr2()
	{
		System.out.println("Testng");
	}
	
	@AfterSuite
	public void abc()
	{
		System.out.println("Testng");
	}

}
