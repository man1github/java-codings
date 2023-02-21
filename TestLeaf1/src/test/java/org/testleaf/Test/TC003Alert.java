package org.testleaf.Test;

import org.testleaf.browser.AlertPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testleaf.commonActions.CommonActions;

public class TC003Alert extends CommonActions{
	
  public void clickAlertPage() {	 	  
	  AlertPage.clickBrowserElement(driver).click();
	  AlertPage.clickAlertElement(driver).click();	  
  }
  
  @Test
  public void alertType() {
	  
	  clickAlertPage();
	  
	  AlertPage.clickAlertSimpleDialog(driver).click();
	  driver.switchTo().alert().accept();
	  
	  AlertPage.clickAlertConfirmDialog(driver).click();
	  String actual = driver.switchTo().alert().getText();
	  Assert.assertEquals(actual, "Did you call me?");
	  driver.switchTo().alert().accept();
	 
	}
  
}
