package com.ebanking.Master;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Multipy_RoleNg extends Multipy_DataTesNg {
	
	@Test(dataProvider = "data")
	public void role(String Role,String RoleDec,String Type) {
		le.Role(Role, RoleDec, Type);
		
	}
	
	@DataProvider
	public Object data() {
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="Charcterabc";
		obj[0][1]="RoleResponsible";
		obj[0][2]="E";
		
		
		obj[1][0]="Charcterabcd";
		obj[1][1]="RoleResponsible";
		obj[1][2]="E";
		
		obj[2][0]="Charcterabcde";
		obj[2][1]="RoleResponsible";
		obj[2][2]="C";
		
		
		return obj;
		
	}

}
