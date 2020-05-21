package com.ebanking.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCode {
	
	@FindBy (name="btnRoles")
	WebElement  NRole ;
	
	@FindBy (name="txtRname")
	WebElement  RoleName ;
	
	@FindBy (name="lstRtypeN")
	WebElement Type  ;
	
	@FindBy (name="btninsert")
	WebElement  submit ;
	
	@FindBy (xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	public void NewRole()
	{
	NRole.click();	
	}
	public void RoleCreation() {
		//NRole.click();
		RoleName.sendKeys("AkhilChatiu");
		Select a=new Select(Type);
		a.selectByVisibleText("E");
		submit.click();
		
	}
	
	public void home()
	{
		Home.click();
	}
	
	

}
