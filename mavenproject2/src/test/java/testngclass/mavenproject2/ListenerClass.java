package testngclass.mavenproject2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerClass.class)
public class ListenerClass {
	
	// listeners execute in class level in testng class

	@Test(priority = 0)
	public void method1() {
		System.out.println("method1");
	}

	@Test(priority = 1, timeOut = 1000)
	public void method2() throws Exception {
		Thread.sleep(2000);
		System.out.println("method2");
	}

	@Test(priority = 2)
	public void method3() {
		System.out.println("method3");
		Assert.assertTrue(false);
	}

	@Test(priority = 3, dependsOnMethods = "method3")
	public void method4() {
		System.out.println("method4");
	}

}
