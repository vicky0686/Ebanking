package com.ebanking.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHm {
	@FindBy(name="txtuId")
	WebElement uname;
	
	@FindBy(name="txtPword")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement log;
	
	
	//Elemnt methods
	public void AdminLogin()
	{
		uname.sendKeys("Admin");
		pwd.sendKeys("M1ndq");
		log.click();
	}

}
