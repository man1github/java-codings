package org.testleaf.Test;


import org.testleaf.home.Dashboard;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC001HomePage extends CommonActions{
	
  @Test
  public void dashboardMethod() throws InterruptedException {
	  
	  Dashboard.clickHomeButton(driver).click();
	  Dashboard.clickDashboard(driver).click();
	  driver.navigate().back();

  }
}
