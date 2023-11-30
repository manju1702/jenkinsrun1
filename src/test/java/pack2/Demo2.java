package pack2;

import org.testng.annotations.Test;

public class Demo2 
{
	@Test(groups="regression")
	public void d1()
	{
		System.out.println("d1 method execute");
	}
	@Test(groups = "smoke")
	public void d2()
	{
		System.out.println("d2 method execute");
	}

}
