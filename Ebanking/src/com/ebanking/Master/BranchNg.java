package com.ebanking.Master;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


@Test
public class BranchNg extends Libary_TestNg
{
     Libary_with_element le=new Libary_with_element();
     public void branch()
     {
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img\r\n" + "")).click();
			driver.findElement(By.name("BtnNewBR")).click();
			//Filling the Text Field With Valid Data
			driver.findElement(By.name("txtbName")).sendKeys("Akhil123456789");
			
			driver.findElement(By.name("txtAdd1")).sendKeys("Akhilkl");
			driver.findElement(By.name("Txtadd2")).sendKeys("Akhilkl");
			driver.findElement(By.name("txtadd3")).sendKeys("Akhilkl");
			
			driver.findElement(By.name("txtArea")).sendKeys("Akhilkl");
			
			driver.findElement(By.xpath("//*[@id=\"txtZip\"]")).sendKeys("12345");
			
			Select Country=new Select(driver.findElement(By.id("lst_counrtyU")));
			Country.selectByVisibleText("INDIA");
			
			Select State=new Select(driver.findElement(By.id("lst_stateI")));
			State.selectByVisibleText("GOA");
			
			Select City=new Select(driver.findElement(By.id("lst_cityI")));
			City.selectByVisibleText("GOA");
			
			
			driver.findElement(By.id("btn_insert")).click();
			
			Actul=driver.switchTo().alert().getText();
			exval="already Exist";
			if(Actul.contains(exval))
			{
				System.out.println("The Banker Name is Already Exit");
			}
			else
				{
					System.out.println("The Banker Name is Already Not Exit");
				}
					
			//Alreart message should Accept
			driver.switchTo().alert().accept();
			
			driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img\r\n" + "")).click();
			
			
     }
}
