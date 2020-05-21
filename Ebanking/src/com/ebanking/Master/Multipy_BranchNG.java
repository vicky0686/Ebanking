package com.ebanking.Master;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Multipy_BranchNG extends Multipy_DataTesNg
		{
@Test(dataProvider = "rcall")
public void branch(String Tn,String Tad1,String Tad2, String Tad3,String Areadata,String zipdata,String cntydata,String stdata,String cty) {
	
	le.Branch(Tn, Tad1, Tad2, Tad3, Areadata, zipdata, cntydata, stdata, cty);
}
@DataProvider
public Object [][] rcall(){
	
	Object[][] obj=new Object[3][9];
	obj[0][0]="Vickypatro1564";
	obj[0][1]="mumbai";
	obj[0][2]="mumbai";
	obj[0][3]="mumbai";
	obj[0][4]="mumbai";
	obj[0][5]="50000";
	obj[0][6]="INDIA";
	obj[0][7]="GOA";
	obj[0][8]="GOA";
	
	
	obj[1][0]="Vicky1Srinivaspatro";
	obj[1][1]="mumbai";
	obj[1][2]="mumbai";
	obj[1][3]="mumbai";
	obj[1][4]="mumbai";
	obj[1][5]="50000";
	obj[1][6]="INDIA";
	obj[1][7]="GOA";
	obj[1][8]="GOA";
	
	obj[2][0]="VickySrinivaspatro";
	obj[2][1]="mumbai";
	obj[2][2]="mumbai";
	obj[2][3]="mumbai";
	obj[2][4]="mumbai";
	obj[2][5]="50000";
	obj[2][6]="INDIA";
	obj[2][7]="GOA";
	obj[2][8]="GOA";
	return obj;
	
	
}





}


