package com.ebanking.Master;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RoleNg extends Libary_TestNg
{
	@Test
	public void role()
	{
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.name("btnRoles")).click();
		
		//Filled The Role Field
		driver.findElement(By.name("txtRname")).sendKeys("Testdatauser");
		driver.findElement(By.name("txtRDesc")).sendKeys("xyzadfghkjsa");
		
		Select RoleType=new Select(driver.findElement(By.name("lstRtypeN")));
		RoleType.selectByVisibleText("E");
	
		
		driver.findElement(By.name("btninsert")).click();

		//Alreart message should Accept
		exval="Role Already existed";
		Actul =driver.switchTo().alert().getText();
		
		if(Actul.contains(exval))
		{
			System.out.println("Alredy Role Page Is Exited");
		}
		else
		{
			{
				System.out.println("Already Role is Not Existed");
			}
		}
		driver.switchTo().alert().accept();
				
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();

	}
}
