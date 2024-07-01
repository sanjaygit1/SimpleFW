package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
	  Actions act = new Actions(driver);
      act.click(ele).perform();
      
      Set<String> allIds = driver.getWindowHandles();//1 2

      for (String id : allIds)
      {
		driver.switchTo().window(id);
		String title = driver.getTitle();
	    System.out.println(title);
	if(title.contains("Selenium"))
	{
		break;
	}
      }
  	driver.findElement(By.xpath("//a[text()=\"Watch the Videos\"]")).click();

	}

}
