package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample2 {
	@BeforeClass
	public void f()
	{
		System.out.println("Testng");
	}
	@Test
	public void g()
	{
		System.out.println("Testng");
	}
	
	@Test
	public void k()
	{
		System.out.println("Testng");
	}
	@AfterClass
	public void l()
	{
		System.out.println("Testng");
	}
	


}
