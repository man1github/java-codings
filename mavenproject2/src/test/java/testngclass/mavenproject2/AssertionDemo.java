package testngclass.mavenproject2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
  @Test
  public void method() {
	  
	  String name = "ram";
	  boolean statement = false; 
	  
	  Assert.assertEquals(name, "ram");
	  Assert.assertNotEquals(name, "dam");
	  
//	  Assert.assertTrue(statement);
	  Assert.assertFalse(statement);
	  Assert.assertFalse(statement,"it is false");
	  
	  Assert.assertSame(name, "ram");
	  
  }
}
