package org.testleaf.Test;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testleaf.home.Dashboard;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC001HomePage extends CommonActions{
	
  @Test
  public void dashboardMethod() {
	  
	  PageFactory.initElements(driver, Dashboard.class);
	  Dashboard.clickHomeButton.click();
	  Dashboard.clickDashboard.click();
	  
  }
}
