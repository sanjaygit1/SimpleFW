package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");

	//	driver.findElement(By.linkText("Amazon miniTV")).click();
	
		driver.findElement(By.partialLinkText("Today's")).click();
	
}

}
