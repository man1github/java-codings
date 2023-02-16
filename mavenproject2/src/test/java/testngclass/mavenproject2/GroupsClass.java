package testngclass.mavenproject2;

import org.testng.annotations.Test;

public class GroupsClass {
	
  @Test(groups = {"vivo"})
  public void vivo1() {
	  System.out.println("vivo smartphone");
  }
  @Test(groups = {"vivo"})
  public void vivo2() {
	  System.out.println("vivo smartphone");
  }
  @Test(groups = {"oppo"})
  public void oppo1() {
	  System.out.println("oppo smartphone");
  }
  @Test(groups = {"oppo"})
  public void oppo2() {
	  System.out.println("oppo smartphone");
  }
  @Test(groups = {"htc"})
  public void htc1() {
	  System.out.println("htc smartphone");
  }
  @Test(groups = {"htc"})
  public void htc21() {
	  System.out.println("htc smartphone");
  }
  @Test(groups = {"redmi"})
  public void redmi1() {
	  System.out.println("redmi smartphone");
  }
  @Test(groups = {"redmi"})
  public void redmi2() {
	  System.out.println("redmi smartphone");
  }
}

