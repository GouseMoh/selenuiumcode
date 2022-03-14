package day29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file =new FileOutputStream("E:\\sselenium\\writing Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
	/*	for (int r=0;r<5;r++)
		{
			XSSFRow row = sheet.createRow(r) ;
			for(int c=0;c<3;c++)
			{
				row.createCell(c).setCellValue ("Welcome");
				
			}
		}*/ 
		// To different data in excelsheet
		/*XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue(123);
		row1.createCell(1).setCellValue("smith");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue(215);
		row2.createCell(1).setCellValue("ravi");
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("245");
		row3.createCell(1).setCellValue("gowse");
		XSSFRow row4=sheet.createRow(3);
		row4.createCell(0).setCellValue(142);
		row4.createCell(1).setCellValue("mohammad");
		*/
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<3;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for (int c=0;c<2;c++)
			{
				System.out.println("Enter the VALUE:");
				row.createCell(c).setCellValue(sc.next());
			}
			}
				
		workbook.write(file);
        file.close();
		System.out.println("Done!!");
		
	}

}
