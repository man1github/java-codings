package org.testleaf.Test;

import org.testleaf.home.AuthPage;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC002Auth extends CommonActions{
	
  @Test
  public void authPageMethod() {
	  
	  AuthPage.clickHomeButton(driver).click();
	  AuthPage.clickAuth(driver).click();
	  AuthPage.clickBasicAuth(driver).click();   // doubt
	
  }
}
