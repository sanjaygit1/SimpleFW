package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarEx2 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	       driver.manage().window().maximize();
	       
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	
	for (int i = 0; i < 3; i++) 
	{
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
	}
	
	for (int i = 0; i < 3; i++) 
	{
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(1000);
	}
	}

}
