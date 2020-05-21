package com.ebanking.Master;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Libary_TestNg {
public static WebDriver driver;
	public static String exval,Actul;
	Libary_with_element le=new Libary_with_element();
	@BeforeSuite
	public void Lanuch() throws IOException
	{
		
		
		driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2/Home.aspx");
		
		driver.manage().window().maximize();
		
		exval="Ranford Bank";
		Actul=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(exval.equalsIgnoreCase(Actul))
		{
			System.out.println("Ranford Home Page is Verify");
		}
		else
		{
			System.out.println("Ranford home is not verified");
			
		}
			
		}
		
	
	@Test
	public void print()
	{
		System.out.println("Pass");
	}
		
		@BeforeTest
		public void Admin()
		{
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.name("txtuId")).sendKeys("Admin");
			driver.findElement(By.name("txtPword")).sendKeys("M1ndq");
			driver.findElement(By.name("login")).click();
			
			
			
			//Verify The Admin Home PAge
			
			exval ="Welcome to Admin";
			Actul=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
			if(exval.equalsIgnoreCase(Actul))
			{
				System.out.println("Welecome Admin Home Page is Verify");
			}
			else
			{
				System.out.println("Welecome Admin Home is not verified");
			}
			
		
		}


		
		@AfterTest
		public void Admin_Logout()
        {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();

		
	}
		
	
	@AfterSuite
	public void close()
	{
		driver.close();

	}
	

}
