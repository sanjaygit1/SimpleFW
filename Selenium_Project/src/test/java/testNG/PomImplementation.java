package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.WebDriverUtility;
import POM.LoginPage;

public class PomImplementation {

	@Test
	public void m1() {
		
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.maximizingWindow(driver);
	
		//	driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	
		//AttributeName="AttributeValue"
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//       driver.findElement(By.name("password")).sendKeys("secret_sauce");
//	    driver.findElement(By.className("btn_action")).click();
		
		LoginPage login = new LoginPage(driver);
		
		login.getUserTextField().sendKeys("standard_user");
        login.getPasswordTextField().sendKeys("secret_sauce");
        login.getLoginBtn().click();
	    
		
	}
}
