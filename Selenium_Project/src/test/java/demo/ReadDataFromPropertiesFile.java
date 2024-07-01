package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
 FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Documents\\PropertiesData.properties");

 Properties pro = new Properties();
 pro.load(fis);
 String URL = pro.getProperty("url");
	
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	}

}
