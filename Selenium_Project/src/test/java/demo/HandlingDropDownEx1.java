package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownEx1 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
        Thread.sleep(2000);
	//select by index , index value starts from 0
    //select by value
    //select by visibletext
   WebElement dateList = driver.findElement(By.xpath("//select[@id='day']"));
	Select select = new Select(dateList);
	//select.selectByIndex(9);
	//select.selectByValue("15");
//	select.selectByVisibleText("25");
	
	WebElement monthList = driver.findElement(By.id("month"));
	Select select1 = new Select(monthList);
	//select1.selectByIndex("5");
	//select1.selectByValue("12");
//	select1.selectByVisibleText("Oct");
	
	//--------------------------------------------------------------
//	xpath approch
	
	driver.findElement(By.xpath("//option[@value='16']")).click();
	
	driver.findElement(By.xpath("//option[text()='Nov']")).click();
	}

}
