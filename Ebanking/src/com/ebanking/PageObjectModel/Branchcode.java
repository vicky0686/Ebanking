package com.ebanking.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Branchcode {
	@FindBy (name="BtnNewBR")
	 WebElement newbranch;
	
	@FindBy (name="txtbName")
	WebElement BranchName;
	
	@FindBy (name="txtAdd1")
	WebElement Adress1;
	
	@FindBy (name="txtZip")
	WebElement zip;
	
	@FindBy (name="lst_counrtyU")
	WebElement Country;
	
	@FindBy (name="lst_stateI")
	WebElement State;
	
	@FindBy (name="lst_cityI")
	WebElement city;
	
	
	@FindBy (name="btn_insert")
	WebElement submit;
	
	@FindBy (xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	public void selectNbranch()
	{
		newbranch.click();
	}
	
	public void branchfieldDetails()
	{
		
		BranchName.sendKeys("chaitu789456123");
		Adress1.sendKeys("Mumbai");
		zip.sendKeys("10000");
		Select a=new Select(Country);
		a.selectByVisibleText("INDIA");
		
		Select b=new Select(State);
		b.selectByVisibleText("GOA");
		
		Select c=new Select(city);
		c.selectByVisibleText("GOA");
		
		submit.click();
		
		
	}
	public void home() {
		Home.click();
	}
}
