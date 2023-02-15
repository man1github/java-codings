package testngclass.mavenproject2;

import org.testng.annotations.Test;

public class Depends {
	
  @Test(enabled = true)
  public void foodbooking() {
	  System.out.println("booking food");
  }
  @Test(dependsOnMethods = "foodbooking")
  public void hotelConfirm() {
	  System.out.println("hotel approval");
  }
  @Test(dependsOnMethods = "hotelConfirm")
  public void deliverPartnerPickingOrder() {
	  System.out.println("pick order from hotel by partner");
  }
  @Test(dependsOnMethods = "deliverPartnerPickingOrder")
  public void collectingFood() {
	  System.out.println("collecting Food from hotel");
  }
  @Test(dependsOnMethods = "collectingFood")
  public void deliver() {
	  System.out.println("food delivered");
  }
}
