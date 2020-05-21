package com.ebanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Empoyle_Multiple_data {

	public static void main(String[] args) throws IOException {
		Libarily lb=new Libarily();
		lb.Lanuch("http://183.82.100.55/ranford2/Home.aspx");
		lb.Admin_Login("Admin","M1ndq");
		
		FileInputStream fis=new FileInputStream("D:\\BankingAutomationProject\\Ebanking\\src\\com\\ebanking\\Testdata\\Empoylee.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int a=ws.getLastRowNum();
		System.out.println(a);
		
		for (int i = 1; i <=a; i++) {
			XSSFRow sr=ws.getRow(i);
			
			XSSFCell sc=sr.getCell(0);
			XSSFCell sc1=sr.getCell(1);
			XSSFCell sc2=sr.getCell(2);
			XSSFCell sc3=sr.getCell(3);
			
			XSSFCell sc4=sr.createCell(4);
			
			String EmpN=sc.getStringCellValue();
			String pw=sc1.getStringCellValue();
			String role=sc2.getStringCellValue();
			String branch=sc3.getStringCellValue();
			
			String res=lb.Empoylee(EmpN, pw, role, branch);
			System.out.println(res);
			sc4.setCellValue(res);
			
		}
		FileOutputStream fos=new FileOutputStream("D:\\\\BankingAutomationProject\\\\Ebanking\\\\src\\\\com\\\\ebanking\\\\Result\\\\Result_Empoyle.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}

}
