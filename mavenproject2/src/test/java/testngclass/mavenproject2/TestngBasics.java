package testngclass.mavenproject2;

import org.testng.annotations.Test;

public class TestngBasics {
	
  @Test(threadPoolSize = 3, invocationCount = 4)
  public void f() throws InterruptedException {
	  System.out.println("uuuuuuuu");
	  Thread.sleep(5000);
  }
}
