package com.ebanking.Master;

import java.io.IOException;

public class Execute_Libarily {

	public static void main(String[] args) throws IOException {
		Libarily lb=new Libarily();
		lb.Lanuch("http://183.82.100.55/ranford2/Home.aspx");
		lb.Admin_Login("Admin", "M1ndq");
		String a=lb.Branch("TestingData1234", "Gachibowil","Adress2","Adress3","Kondapur", "50012", "INDIA", "GOA", "GOA");
		System.out.println(a);
		String b=lb.Role("TestQ", "RoleDe","E");
		System.out.println(b);
		String c=lb.Empoylee("TesterQA1", "vicky", "TestQ", "TestingData1234");
		System.out.println(c);
		lb.Admin_Logout();
		lb.Banker_Login("TestingData1234","TesterQA1","vicky");
		lb.Banker_Logout();
		System.out.println("  ");
		System.out.println("Application perform Succesful As Your Requiremnt Its sure to Depolyment");

	}

}
