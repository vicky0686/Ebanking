package com.ebanking.Master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Libarily {
	
	WebDriver driver;
	FileInputStream fi;
	Properties pr;
	String exval,Actul;
	
	
	public void Lanuch(String url) throws IOException
	{
		fi=new FileInputStream("D:\\BankingAutomationProject\\Ebanking\\src\\com\\ebanking\\Property\\Res.properties");
		pr=new Properties();
		pr.load(fi);
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
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
		
		
	}
	
	public void Admin_Login(String ul,String pw)
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name(pr.getProperty("uname"))).sendKeys(ul);
		driver.findElement(By.name(pr.getProperty("pswd"))).sendKeys(pw);
		driver.findElement(By.name(pr.getProperty("log"))).click();
		
		
		
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
		
	
	}

	
	
	public void Admin_Logout()
          {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(pr.getProperty("logout"))).click();

		
	}


	public String Branch(String Tn,String Tad1,String Tad2,String Tad3,String Areadata,String zipdata,String cntydata,String stdata,String cty)
       {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(pr.getProperty("Bbutton"))).click();
		driver.findElement(By.name(pr.getProperty("NBbutton"))).click();
		//Filling the Text Field With Valid Data
		driver.findElement(By.name(pr.getProperty("Branch"))).sendKeys(Tn);
		
		driver.findElement(By.name(pr.getProperty("ad1"))).sendKeys(Tad1);
		driver.findElement(By.name(pr.getProperty("ad2"))).sendKeys(Tad2);
		driver.findElement(By.name(pr.getProperty("ad3"))).sendKeys(Tad3);
		
		driver.findElement(By.name(pr.getProperty("Area"))).sendKeys(Areadata);
		
		driver.findElement(By.xpath(pr.getProperty("Zip"))).sendKeys(zipdata);
		
		Select Country=new Select(driver.findElement(By.id(pr.getProperty("ctry"))));
		Country.selectByVisibleText(cntydata);
		
		Select State=new Select(driver.findElement(By.id(pr.getProperty("st"))));
		State.selectByVisibleText(stdata);
		
		Select City=new Select(driver.findElement(By.id(pr.getProperty("city"))));
		City.selectByVisibleText(cty);
		
		
		driver.findElement(By.id(pr.getProperty("Bsubmit"))).click();
		
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
		
		driver.findElement(By.xpath(pr.getProperty("BHome"))).click();
		return Actul;
	
		
		
	}

	public String Role(String Role,String RoleDec,String Type)
		{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(pr.getProperty("RButton"))).click();
		driver.findElement(By.name(pr.getProperty("NRButton"))).click();
		
		//Filled The Role Field
		driver.findElement(By.name(pr.getProperty("Rname"))).sendKeys(Role);
		driver.findElement(By.name(pr.getProperty("Rdesc"))).sendKeys(RoleDec);
		
		Select RoleType=new Select(driver.findElement(By.name(pr.getProperty("type"))));
		RoleType.selectByVisibleText(Type);
	
		
		driver.findElement(By.name(pr.getProperty("Rsubmit"))).click();

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
				
		driver.findElement(By.xpath(pr.getProperty("RHome"))).click();
		return Actul;
		
	}


	public String Empoylee(String emp,String pw, String role,String branch )
		{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(pr.getProperty("EButton"))).click();
		driver.findElement(By.name(pr.getProperty("NEButton"))).click();
		
		//Filled The data in the EmpoyleeField
		
		driver.findElement(By.name(pr.getProperty("Ename"))).sendKeys(emp);
		driver.findElement(By.name(pr.getProperty("Epswd"))).sendKeys(pw);
		
		Select Role=new Select(driver.findElement(By.id(pr.getProperty("Role"))));
		Role.selectByVisibleText(role);
		
		Select Branch=new Select(driver.findElement(By.id(pr.getProperty("Branchname"))));
		Branch.selectByVisibleText(branch);
		
		driver.findElement(By.name(pr.getProperty("Esubmit"))).click();
		Actul =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		exval="Employer Already Existed...Try again";
		if(Actul.contains(exval))
		{
			System.out.println("Alredy Empoyle Page Is Exited");
		}
		else
		{
			{
				System.out.println("Already Empoylee is Not Existed");
			}
		}
		
			
		driver.findElement(By.xpath(pr.getProperty("EHome"))).click();
		return Actul;
	
		
	}



public void Banker_Login(String branch,String user,String pw)
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Select BranchBanker=new Select(driver.findElement(By.name(pr.getProperty("Bselect"))));
	BranchBanker.selectByVisibleText(branch);

	driver.findElement(By.name(pr.getProperty("Buser"))).sendKeys(user);
	driver.findElement(By.name(pr.getProperty("Bpswd"))).sendKeys(pw);
	driver.findElement(By.name(pr.getProperty("bsubmit"))).click();

	
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

	public void Banker_Logout()
		{
		
		driver.findElement(By.xpath(pr.getProperty("Blog"))).click();
	}
	public void close()
	{
		driver.close();

	}
}
