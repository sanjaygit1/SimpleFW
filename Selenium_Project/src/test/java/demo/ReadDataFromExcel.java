package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import Generic.WebDriverUtility;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
//Apache Poi Helps to read and write data From Excel Sheet
	
	WebDriverUtility wlib = new WebDriverUtility();
	

	wlib.readDataFromExcel("Sheet1", 2, 2);
	}

}
