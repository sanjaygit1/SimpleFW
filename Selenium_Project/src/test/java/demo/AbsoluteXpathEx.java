package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoluteXpathEx {

	@Test(groups = "smokeTest")
	public void AbsoluteXpathEx() {
	

		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div/form/input[1]")).sendKeys("standard_user");

	}

}
