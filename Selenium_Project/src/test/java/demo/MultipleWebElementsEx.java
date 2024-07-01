package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementsEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	       driver.manage().window().maximize();
	       
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	for (WebElement link : allLinks) 
	{
	System.out.println(link.getAttribute("href"));
	}
	}

}
