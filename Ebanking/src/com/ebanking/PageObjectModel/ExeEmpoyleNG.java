package com.ebanking.PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExeEmpoyleNG {
	WebDriver driver;
	@Test
	public void New_Empoyle_Deatils() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/home.aspx");
	RanfordHm Admin1=	PageFactory.initElements(driver, RanfordHm.class);
	Admin1.AdminLogin();
		AdminHp Admin=PageFactory.initElements(driver, AdminHp.class);
		Admin.Emp();
		Empoylecode emp= PageFactory.initElements(driver, Empoylecode.class);
		emp.Empoyle_Creation();
		driver.switchTo().alert().accept();
		emp.Home();
		
	}

}
