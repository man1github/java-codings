package testngclass.mavenproject2;

import org.testng.annotations.Test;


public class PriorityKeywordAndSkipTestCase {
	
	@Test(priority=0)
	public void lapopen() {
		System.out.println("aaa");

	}
	@Test(priority=-1)
	public void lapon() {
		System.out.println("bbbb");

	}
	@Test(priority=-2)
	public void refresh() {
		System.out.println("ccc");
	}
	@Test(priority=1)
	public void workStart() {
		System.out.println("ddd");
	}
	@Test(priority=2,enabled = false)
	public void workInbetweenBreak() {
		System.out.println("ggg");
	}
	@Test(enabled = false)
	public void workFinish() {
		System.out.println("eee");
	}
	@Test
	public void lapoff() {
		System.out.println("fff");
	}
}


