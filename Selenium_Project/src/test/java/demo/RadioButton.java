package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {

	@Test
	public void RadioButton() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
	
	
	}

}
