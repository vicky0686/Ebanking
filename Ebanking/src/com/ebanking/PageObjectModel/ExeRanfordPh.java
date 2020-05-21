package com.ebanking.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExeRanfordPh {
	
	@Test
	public void Admin()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/home.aspx");
		
	RanfordHm RHM	=PageFactory.initElements(driver, RanfordHm.class);
	RHM.AdminLogin();
	}

}
