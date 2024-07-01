package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethodsEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com");
	
/*		//method1:-sendKeys()
//driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("bluetooth");
	
		//method2:-submit()
WebElement searchBar = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
searchBar.sendKeys("Puma");
searchBar.submit();

       //method3:-getText()
String name = driver.findElement(By.xpath("//a[text()='Puma Smashic Sneakers For Men']")).getText();
	System.out.println(name);*/
		
		//method4:-clear()
	//WebElement searchbar = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
//	searchbar.sendKeys("Nike");
	
	Thread.sleep(2000);
	
//	searchbar.clear();
	
	//driver.close();
	//WebElement ele = driver.findElement(By.xpath("//span[text()='Mobiles']"));
//	System.out.println(ele.getTagName());
	
	WebElement searchbar = driver.findElement(By.name("q"));
//	System.out.println(searchbar.getAttribute("title"));
	
//	System.out.println(searchbar.getTagName());
	
	System.out.println(searchbar.getAriaRole());
	
	System.out.println(searchbar.getAccessibleName());
	
	}

}
