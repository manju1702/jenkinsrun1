package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest 
{
	
public WebDriver driver;
	@Test
	public void m1Test()
	{

		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			
			driver = new FirefoxDriver();
			
		}
		
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			
			driver = new FirefoxDriver();
			
		
		driver.get(URL);
		System.out.println("hii sarfraz");
		System.out.println("hii gunjan");
	}

}
}
