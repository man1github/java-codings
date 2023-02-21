package org.testleaf.Test;

import org.openqa.selenium.support.PageFactory;
import org.testleaf.home.AuthPage;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC002Auth extends CommonActions{
	
  @Test
  public void authPageMethod() {
	  
	  PageFactory.initElements(driver, AuthPage.class);
	  AuthPage.clickHomeButton.click();
	  AuthPage.clickAuth.click();
	  AuthPage.clickBasicAuth.click();   // doubt
	  
  }
}
