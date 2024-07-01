package Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	
		@Parameters("BROWSER")
		
		public void bc(String BROWSER) throws Throwable
		{
		
			 if(BROWSER.equalsIgnoreCase("chrome"))
			 {
				
				  driver=new ChromeDriver();
			 }
			 else if(BROWSER.equalsIgnoreCase("edge"))
			 {
				
				 driver=new EdgeDriver();
			 }
			 else if(BROWSER.equalsIgnoreCase("firefox"))
			 {
				
				 driver=new FirefoxDriver();
			}
			 else
			 {
				 driver=new ChromeDriver();
			 }
			System.out.println("Browser launched");
	}
}
