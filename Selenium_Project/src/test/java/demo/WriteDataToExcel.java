package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws Throwable {
		
		//step1:- setting Excel file path
		FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\ExcelData1.xlsx");
			
		         //step2:- Keep excel file in Read mode
		Workbook book = WorkbookFactory.create(fis);
			
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.createRow(5);

		Cell cel = row.createCell(5);
		
		cel.setCellValue("Bluetooth");
		
		//write data
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shobha\\Downloads\\ExcelData1.xlsx");
		book.write(fos);
		book.close();
	}

}
