package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample2
{
	public WebDriver driver;
	@Test
	public void m1()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			
			driver = new ChromeDriver();

			driver.get(URL);
			System.out.println("hii sarfraz");
			System.out.println("hii gunjan");
			System.out.println("hii arpan");
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			
			driver = new FirefoxDriver();
			
		}
		
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			
			driver = new FirefoxDriver();
			


	}

	}

}
