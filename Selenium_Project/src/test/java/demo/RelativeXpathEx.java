package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx {

	public static void main(String[] args) {
		
		//synatx1:- //htmltag[@AttributeName='AttributeValue']
//   //---->parent traversing to any child
//   /---->parent traversing immd child
//   @--->AttributeValue
		
//synatx1:- //htmltag[@AttributeName='AttributeValue']
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.amazon.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
	
	//	driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("Nike");
	
//syntax2:-	//htmltag[text()='AttributeValue']
	//   driver.findElement(By.xpath("//a[text()='Fashion']")).click();
	
	   //syntax3:- //htmltag[contains(@AttributeName,'AttributeValue')]
	   
	//  driver.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("BlueTooth"); 
	  
		//syntax4:- //htmltag[contains(text(),'AttributeValue')]
	//   driver.findElement(By.xpath("//a[contains(text(),\"Tod\")]")).click();
	
	
//	driver.findElement(By.xpath("//a[@class='n' or @data-csa-c-content-id='nav_cs_mobiles']")).click();
	
	driver.findElement(By.xpath("//a[text()='Fashion' and @tabindex='0']")).click();
	
	
	
	
	}

}
