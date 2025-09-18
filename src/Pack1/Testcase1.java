package Pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 {
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("This is Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("This is Test2");
	}
}
