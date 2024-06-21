package Package_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc1 extends BaseTest {
	
	@Test
	public void test()
	{
		System.out.println("Hii");
		
		Assert.fail();
	}
	

}
