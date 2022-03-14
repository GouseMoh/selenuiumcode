package day29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelheet {

	public static void main(String[] args) throws IOException {
		//E:\sselenium
		FileInputStream File=new FileInputStream("//E:\\sselenium\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet Sheet= workbook.getSheet("Sheet3");
	 int TotalnumRows=Sheet.getLastRowNum();
	 int Totalcells=Sheet.getRow(1).getLastCellNum();
	 System.out.println("ROWS:"+TotalnumRows);
	 System.out.println("CELL"+Totalcells);
	 for(int r=0;r<=TotalnumRows;r++)
	 {
		 XSSFRow Row = Sheet.getRow(r);
	     for(int c=0;c<Totalcells;c++)
	{
	    	 XSSFCell cell = Row.getCell(c);
	    	 System.out.println(cell.toString());
	}
		
	}
		
				
	}

}
