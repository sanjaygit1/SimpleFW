package testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CookiesTestEx {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		Set<Cookie> coookies = driver.manage().getCookies();
		for (Cookie cookie : coookies) 
		{
			System.out.println("cookie name= "+cookie.getName()+"\t"+"value= "+cookie.getValue());
		}
     driver.manage().deleteAllCookies();
     //verification
		if(driver.manage().getCookies().isEmpty())
		{
			System.out.println("cookies cleared");
		}else {
			System.out.println("cookies not cleared");
		}

	}

}
