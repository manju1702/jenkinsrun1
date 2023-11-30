package pack2;

import org.testng.annotations.Test;

public class Demo1 
{
	@Test(groups = "smoke")
	public void m1()
	{
		System.out.println(" m1 method execute");
	}
	@Test(groups="regression")
	public void m2()
	{
		System.out.println("m2 method execute");
	}

}
