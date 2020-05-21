package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryNg {
WebDriver driver;
	

	
	@Test
	  public void login() 
	  {
	 
	 
		 driver.findElement(By.name("userName")).sendKeys("levantekuser1");
	 	 
	 	         driver.findElement(By.name("password")).sendKeys("levantekpw1");
	 	
	 	         driver.findElement(By.name("login")).click();
	 		  
	  }
	 

	 
	  @BeforeTest
	  public void launching() throws InterruptedException 
	  
	  {
	  
		
	   
	       driver = new FirefoxDriver();
	      
	 
	       driver.get("http://www.newtours.demoaut.com/");
	  
	       Thread.sleep(2000);
	  	  
	  	
	       driver.manage().window().maximize();
				  
	     }

	  

	@AfterTest
	  public void closing() throws InterruptedException 
	  {
	 
		        driver.findElement(By.linkText("Home")).click();
		
	      Thread.sleep(2000);
	      driver.close();
		  
		  
	  }



}
