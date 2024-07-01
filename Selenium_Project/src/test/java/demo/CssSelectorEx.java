package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	
		//syntax1:- [AttributeName='AttributeValue']
driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
	
        //syntax2:- htmltag[AttributeName='AttributeValue']
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
	
//SHortCuts using cssSelector
//Supports only two Attributes --->id and class
	  
//syntax3:- Supports only id AttributeName
               // #AttributeValue

//driver.findElement(By.cssSelector("#login-button")).click();

     //syntax4:-Supports only id AttributeName
             // html#AttributeValue
//driver.findElement(By.cssSelector("input#login-button")).click();

//syntax5:- .AttributeValue
//driver.findElement(By.cssSelector(".btn_action")).click();

//syntax6:- htmltag.AttributeValue
driver.findElement(By.cssSelector("input.btn_action")).click();














	}

}
