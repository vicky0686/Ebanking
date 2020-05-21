package com.ebanking.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_SCript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		//Lanching Url of cilent page
		
		driver.get("http://183.82.100.55/ranford2/home.aspx");
		driver.manage().window().maximize();
		
		//verifying page title
		String exval="Ranford Bank";
		String Actul=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(exval.equalsIgnoreCase(Actul))
		{
			System.out.println("Ranford Home Page is Verify");
		}
		else
		{
			System.out.println("Ranford home is not verified");
		}
		//Login Detail with Login Data
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		
		//Verify The Admin Home PAge
		exval ="Welcome to Admin";
		Actul=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		if(exval.equalsIgnoreCase(Actul))
		{
			System.out.println("Welecome Admin Home Page is Verify");
		}
		else
		{
			System.out.println("Welecome Admin Home is not verified");
		}
		
		//Click on Branch And New Branch page
		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.name("BtnNewBR")).click();
		//Filling the Text Field With Valid Data
		driver.findElement(By.name("txtbName")).sendKeys("TestingData123");
		
		driver.findElement(By.name("txtAdd1")).sendKeys("Gachibowil-jkl");
		driver.findElement(By.name("Txtadd2")).sendKeys("Test1@");
		driver.findElement(By.name("txtadd3")).sendKeys("Test2#");
		
		driver.findElement(By.name("txtArea")).sendKeys("Test3");
		
		driver.findElement(By.name("txtZip")).sendKeys("50032");
		
		Select Country=new Select(driver.findElement(By.id("lst_counrtyU")));
		Country.selectByIndex(1);
		
		Select State=new Select(driver.findElement(By.id("lst_stateI")));
		State.selectByIndex(1);
		
		Select City=new Select(driver.findElement(By.id("lst_cityI")));
		City.selectByIndex(2);
		Thread.sleep(3000);
		
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
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
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(1000);
		
		//Click on Role AnD New Role Pages
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.name("btnRoles")).click();
		
		//Filled The Role Field
		driver.findElement(By.name("txtRname")).sendKeys("Test");
		driver.findElement(By.name("txtRDesc")).sendKeys("Enginner");
		
		Select RoleType=new Select(driver.findElement(By.name("lstRtypeN")));
		RoleType.selectByVisibleText("E");
		Thread.sleep(3000);
		
		driver.findElement(By.name("btninsert")).click();
		Thread.sleep(2000);
		//Alreart message should Accept
		exval="Role Already existed";
		Actul =driver.switchTo().alert().getText();
		
		if(Actul.contains(exval))
		{
			System.out.println("Aleredy Role Page Is Exited");
		}
		else
		{
			{
				System.out.println("Already Role is Not Existed");
			}
		}
		driver.switchTo().alert().accept();
				
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(1000);
		
		//Click on Empoyle and Create Empoylee page
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.name("BtnNew")).click();
		
		//Filled The data in the EmpoyleeField
		
		driver.findElement(By.name("txtUname")).sendKeys("TesterQA");
		driver.findElement(By.name("txtLpwd")).sendKeys("vicky");
		
		Select Role=new Select(driver.findElement(By.id("lst_Roles")));
		Role.selectByVisibleText("Test");
		
		Select Branch=new Select(driver.findElement(By.id("lst_Branch")));
		Branch.selectByVisibleText("TestingData123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("BtnSubmit")).click();
		Thread.sleep(2000);
		Actul =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		exval="Employer Already Existed...Try again";
		if(Actul.contains(exval))
		{
			System.out.println("Aleredy Empoyle Page Is Exited");
		}
		else
		{
			{
				System.out.println("Already Empoylee is Not Existed");
			}
		}
		
		
		
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
		
		//Banker Login
		
		Select BranchBanker=new Select(driver.findElement(By.name("drlist")));
		BranchBanker.selectByVisibleText("TestingData123");
		
		driver.findElement(By.name("txtuId")).sendKeys("TesterQA");
		driver.findElement(By.name("txtPword")).sendKeys("vicky");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	
		
		exval="Welcome to TestingData123 Branch";
		Actul=driver.findElement(By.xpath("//*[@id=\"Label1\"]")).getText();
		if(Actul.contains(exval))
		{
			System.out.println("Banker pages succesful verify");
		}
		else
		{
			{
				System.out.println("Banker pages Not succesful verify");
			}
		}
			
		
		
	}

}
