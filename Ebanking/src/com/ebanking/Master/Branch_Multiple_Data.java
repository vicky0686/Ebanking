package com.ebanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Branch_Multiple_Data {

	public static void main(String[] args) throws IOException {
		Libarily lb=new Libarily();
		lb.Lanuch("http://183.82.100.55/ranford2/Home.aspx");
		lb.Admin_Login("Admin", "M1ndq");
		
		FileInputStream fis=new FileInputStream("D:\\BankingAutomationProject\\Ebanking\\src\\com\\ebanking\\Testdata\\Branch.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int a=ws.getLastRowNum();
		
		for (int i = 1; i <=a; i++) {
			XSSFRow wr=ws.getRow(i);
			
			
				XSSFCell wc=wr.getCell(0);
				XSSFCell wc1=wr.getCell(1);
				XSSFCell wc2=wr.getCell(2);
				XSSFCell wc3=wr.getCell(3);
				XSSFCell wc4=wr.getCell(4);
				XSSFCell wc5=wr.getCell(5);
				XSSFCell wc6=wr.getCell(6);
				XSSFCell wc7=wr.getCell(7);
				XSSFCell wc8=wr.getCell(8);
				
				  XSSFCell wc9=wr.createCell(9);
				
			    String Bn=wc.getStringCellValue();
			    String ad1=wc1.getStringCellValue();
			    String ad2=wc2.getStringCellValue();
			    String ad3=wc3.getStringCellValue();
			    String area=wc4.getStringCellValue();
			    String zip=wc5.getStringCellValue();
			    String cntry=wc6.getStringCellValue();
			    String State=wc7.getStringCellValue();
			    String City=wc8.getStringCellValue();
			    
			   String Result=lb.Branch(Bn, ad1, ad2, ad3, area, zip, cntry, State, City);
			   
			  wc9.setCellValue(Result);
		
			
		}
		
		FileOutputStream fos=new FileOutputStream("D:\\BankingAutomationProject\\Ebanking\\src\\com\\ebanking\\Result\\REs_branch.xlsx");
		wb.write(fos);
		wb.close();
		

	}

}
