package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	
		//AttributeName="AttributeValue"
		//id()
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 //   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
		//name()
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
	    //className()
	    driver.findElement(By.className("btn_action")).click();
	    
	    
	}

}
