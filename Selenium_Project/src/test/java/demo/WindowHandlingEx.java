package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
     driver.manage().window().maximize();
     
     driver.findElement(By.name("q")).sendKeys("iphone");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
	
     driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (Black, 128 GB)']")).click();
	
     Set<String> allWins = driver.getWindowHandles();//win1 win2
    
     for (String id : allWins)
     {
		driver.switchTo().window(id);
		String title = driver.getTitle();
	    System.out.println(title);
	    
	    if(title.contains("Apple iPhone 15"))
	    {
	    	break;
	    }
	    
     }
String name = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
System.out.println(name);
	}

}
