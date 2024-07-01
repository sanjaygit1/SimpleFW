package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		
		//launching browser
	//	WebDriver driver=new EdgeDriver();
		WebDriver driver=new ChromeDriver();
		
		//get()---->Launching the Application.
		driver.get("https://www.amazon.in");
		
		//getTitle()--->fetches the title of the current webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl()-->fetches the url of the current webpage
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		//getPageSource()---->fetches the source code of the current webpage
		String source = driver.getPageSource();
	//    System.out.println(source);
	
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	 //   driver.manage().window().minimize();
	    
	    Thread.sleep(2000);
	  //  driver.manage().window().fullscreen();
	    
	    
	  //  driver.close();
	    
	    driver.quit();
}

}
