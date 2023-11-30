package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Test
	public void m1Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}
