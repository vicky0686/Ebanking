package com.ebanking.Master;

import java.io.IOException;

public class Exe_Libary_element {

	public static void main(String[] args) throws IOException {
	Libary_with_element le=new Libary_with_element();
	le.Lanuch("http://183.82.100.55/ranford2/home.aspx");
	le.Admin("Admin","M1ndq");
	le.Branch("Chatiu", "Dubai", "Newyork", "Redbus", "Locanto", "53001", "INDIA", "GOA", "GOA");
	le.Role("ChatiuCashier", "check account", "C");
	le.Empoylee("Chatiukampa", "chatiu123", "Test", "123456789");
	le.Admin_Logout();
	le.close();

	}

}
