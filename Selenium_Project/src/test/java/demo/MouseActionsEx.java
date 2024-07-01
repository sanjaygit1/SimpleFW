package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEx {

	public static void main(String[] args) {
  
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("https://www.amazon.in");
       driver.manage().window().maximize();
       
       WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	   Actions act = new Actions(driver);
      act.moveToElement(ele).perform();
      act.contextClick(ele).perform();*/
      
   /*   driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
      WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  Actions act = new Actions(driver);
	  act.dragAndDrop(drag, drop).perform();*/
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  Actions act = new Actions(driver);
	  act.doubleClick(ele).perform();
	}

}
