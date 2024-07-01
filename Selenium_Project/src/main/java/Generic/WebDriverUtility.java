package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverUtility {


	public void maximizingWindow(WebDriver driver) 
	{
     driver.manage().window().maximize();
	}
	
	public void readDataFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		//step1:- setting Excel file path
		FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\ExcelData1.xlsx");
			
		         //step2:- Keep excel file in Read mode
		Workbook book = WorkbookFactory.create(fis);
			
		Sheet sheet = book.getSheet(sheetName);
			
		Row row = sheet.getRow(rowNum);
			
		Cell cell = row.getCell(cellNum);
			
		String ExcelData = cell.getStringCellValue();

		System.out.println(ExcelData);
	}
}
