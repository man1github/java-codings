package testngclass.mavenproject2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass {
  
	@Test
	@Parameters("items")
  public void kitchenRoom(String name) {
		System.out.println("kitchenRoom using - " + name);
  }
	@Test
	public void bedRoom() {
			System.out.println("bed things");
	  }
	@Test
	@Parameters("Sitems")
	public void storeRoom(String name) {
			System.out.println("storeRoom - " + name);
	  }
	@Test
	public void hall() {
		System.out.println("sofa set, tv");
  }
	@Test
	public void poojaRoom() {
		System.out.println("pooja units");
  }
}
