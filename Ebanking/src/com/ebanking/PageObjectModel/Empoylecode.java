package com.ebanking.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Empoylecode {
	
	@FindBy (name="BtnNew")
	WebElement Nbutton;
	
	@FindBy (name="txtUname")
	WebElement Emp;
	
	@FindBy (name="txtLpwd")
	WebElement pwd;
	
	@FindBy (name="lst_Roles")
	WebElement Role;
	
	@FindBy (name="lst_Branch")
	WebElement branch;
	
	@FindBy (xpath="//*[@id=\"BtnSubmit\"]")
	WebElement Submit;
	
	@FindBy (xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement home;
	
	public void Empoyle_Creation() {
		Nbutton.click();
		Emp.sendKeys("Cahtiuakhil4789");
		pwd.sendKeys("vicky");
		Select a=new Select(Role);
		a.selectByIndex(5);
		Select b=new Select(branch);
		b.selectByIndex(12);
		Submit.click();
	}
	
	public void Home()
	{
		home.click();
	}
	
	

}
