package pack1;

import org.testng.annotations.Test;

public class TestScriptToTest 
{
	@Test(groups="smoke")
	public void ts1()
	{
		System.out.println("testscript1 execute");
		
	}
	@Test(groups = "regression")
	public void ts2()
	{
		System.out.println("testscript2 execute");
	}
	@Test(groups="integration")
	public void ts3()
	{
	System.out.println("testscript3 execute");	
	}
	public void ts4()
	{
		System.out.println("testscript4 execute");
	}

//	<dependency>
//	<groupId>Automation</groupId>
//	<artifactId>Automation</artifactId>
//	<version>0.0.1-SNAPSHOT</version>
//</dependency>

}
