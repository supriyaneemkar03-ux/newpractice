package Testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utility.MyListeners.class)

public class ReportsTest {
	
	@Test
	public void d() {
		int i=10;
		int j=20;
		Assert.assertEquals(i, j);
	}
	
	@Test
	public void b() {
		int i=10;
		int j=10;
		Assert.assertEquals(i, j);
	}
	
	@Test
	public void c() {
		int i=10;
		int j=20;
		Assert.assertEquals(i, j);
	}
	
	@Test
	public void m() {
		int i=10;
		int j=10;
		
		Assert.assertEquals(i,j);
	}
	
	
}



