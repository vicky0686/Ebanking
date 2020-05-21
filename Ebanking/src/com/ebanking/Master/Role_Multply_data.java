package com.ebanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Role_Multply_data {

	public static void main(String[] args) throws IOException {
		Libarily lb=new Libarily();
		lb.Lanuch("http://183.82.100.55/ranford2/Home.aspx");
		lb.Admin_Login("Admin","M1ndq");
		
		FileInputStream fis=new FileInputStream("D:\\BankingAutomationProject\\Ebanking\\src\\com\\ebanking\\Testdata\\Role.xlsx");

			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			XSSFSheet ws=wb.getSheet("Sheet1");
			
			int wr=ws.getLastRowNum();
			System.out.println(wr);
			
			for (int i = 1; i <= wr; i++) {
				
				XSSFRow sr=ws.getRow(i);
				
				XSSFCell sc=sr.getCell(0);
				XSSFCell sc1=sr.getCell(1);
				XSSFCell sc2=sr.getCell(2);
				
				XSSFCell sc3=sr.createCell(3);
				
				String Rname=sc.getStringCellValue();
				String Rdec=sc1.getStringCellValue();
				String type=sc2.getStringCellValue();
				
			String resultv=lb.Role(Rname, Rdec,type);
			sc3.setCellValue(resultv);
			
				
			}
			
			FileOutputStream fos=new FileOutputStream("D:\\BankingAutomationProject\\Ebanking\\src\\com\\ebanking\\Result\\Res_role.xlsx");
			wb.write(fos);
			wb.close();
	}

}
