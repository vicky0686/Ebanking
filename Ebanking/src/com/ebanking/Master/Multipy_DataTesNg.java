package com.ebanking.Master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Multipy_DataTesNg {
	Libary_with_element le=new Libary_with_element();
	@BeforeSuite
	public void url() throws IOException
	{
		le.Lanuch("http://183.82.100.55/ranford2/home.aspx");
	}
	@BeforeTest
	public void admin() {
		le.Admin("Admin","M1ndq");
	}
	@AfterTest
	public void adminlogout() {
		le.Admin_Logout();
	}
	@AfterSuite
	public void close() {
		le.close();
	}

}
