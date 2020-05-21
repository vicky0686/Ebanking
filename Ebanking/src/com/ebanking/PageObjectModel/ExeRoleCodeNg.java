package com.ebanking.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExeRoleCodeNg {
	WebDriver driver;
	@Test(priority = 1)
	public void NewRolecreation()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/home.aspx");
	RanfordHm Admin=	PageFactory.initElements(driver, RanfordHm.class);
	Admin.AdminLogin();
	AdminHp Button=	PageFactory.initElements(driver, AdminHp.class);
	Button.rol();
	
	RoleCode R =PageFactory.initElements(driver, RoleCode.class);
	R.NewRole();
	R.RoleCreation();
	driver.switchTo().alert().accept();
	R.home();
	
	
	}
/*	@Test(priority = 2)
	public void Newrolecreation1()
	{
		RoleCode R =PageFactory.initElements(driver, RoleCode.class);
		R.NewRole();
		R.RoleCreation();
		driver.switchTo().alert().accept();
		R.home();
	}*/

}
