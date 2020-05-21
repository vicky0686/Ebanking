package com.ebanking.Master;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EmpoyleNg extends Libary_TestNg {
	
	@Test
	public void empoyle()
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
	driver.findElement(By.name("BtnNew")).click();
	
	//Filled The data in the EmpoyleeField
	
	driver.findElement(By.name("txtUname")).sendKeys("HiNewUser");
	driver.findElement(By.name("txtLpwd")).sendKeys("Vicky");
	
	Select Role=new Select(driver.findElement(By.id("lst_Roles")));
	Role.selectByVisibleText("Testdatauser");
	
	Select Branch=new Select(driver.findElement(By.id("lst_Branch")));
	Branch.selectByVisibleText("Akhil123456789");
	
	driver.findElement(By.name("BtnSubmit")).click();
	Actul =driver.switchTo().alert().getText();
	
	exval="Employer Already Existed...Try again";
	if(Actul.contains(exval))
	{
		System.out.println("Alredy Empoyle Page Is Exited");
	}
	else
	
		{
			System.out.println("Already Empoylee is Not Existed");
		}
	
	driver.switchTo().alert().accept();
		
	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();

}
}