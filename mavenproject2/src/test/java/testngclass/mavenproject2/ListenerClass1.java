package testngclass.mavenproject2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerClass1 {
	
	// listeners execute in suite level in xml file
	
	@Test
	public void method1() {
		System.out.println("method1");
	}

	@Test(timeOut = 1000)
	public void method2() throws Exception {
		Thread.sleep(2000);
		System.out.println("method2");
	}

	@Test
	public void method3() {
		System.out.println("method3");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "method3")
	public void method4() {
		System.out.println("method4");
	}

  
}
