package org.testleaf.Test;

import org.openqa.selenium.support.PageFactory;
import org.testleaf.browser.AlertPage;
import org.testng.annotations.Test;
import com.testleaf.commonActions.CommonActions;

public class TC003Alert extends CommonActions{
	
	
  public void alertMethod() {	  
	  PageFactory.initElements(driver, AlertPage.class);
	  AlertPage.clickBrowserElement.click();
	  AlertPage.clickAlertElement.click();	  
  }
  
  @Test
  public void alertType() {
	  
	  alertMethod();
	  
	  PageFactory.initElements(driver, AlertPage.class);	  
	  AlertPage.clickAlertSimpleDialog.click();
	  driver.switchTo().alert().accept();
	  
	  AlertPage.clickAlertConfirmDialog.click();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  

	}
  
}
