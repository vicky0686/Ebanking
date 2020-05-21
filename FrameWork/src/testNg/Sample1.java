package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {
	@BeforeMethod
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

	@AfterMethod
	public void a()
	{
		System.out.println("Testng");
	}


}
