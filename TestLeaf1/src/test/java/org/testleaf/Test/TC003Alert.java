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
  
  
  public void alertType2() {
	  
	  clickAlertPage();
	  
	  AlertPage.clickAlertSimpleDialog(driver).click();
	  driver.switchTo().alert().accept();
	  
	  AlertPage.clickAlertConfirmDialog(driver).click();
	  String actual = driver.switchTo().alert().getText();
	  Assert.assertEquals(actual, "Did you call me?");
	  driver.switchTo().alert().accept();
	  
	  AlertPage.clickSweetAlertbutton(driver).click();
	  AlertPage.clickDismissbutton(driver).click();
	  
	  AlertPage.clickSweetModalDialog(driver).click();
	  AlertPage.closeAlertSweetModalDialog(driver).click();
	  
	  AlertPage.clickAlertPromptDialog(driver).click();
      String myName = properties.getProperty("name");  // value doesn't send to alert
	  driver.switchTo().alert().sendKeys(myName);  
	 
	}
  @Test
  public void name() {
	  clickAlertPage();
	  
	  AlertPage.clickSweetAlertConfirmation(driver).click();
	  AlertPage.clickConfirmationAlert(driver).click();
	  
	  AlertPage.clickAlertMinAndMax(driver).click();
	  AlertPage.clickAlertMax(driver).click();
	  AlertPage.clickAlertMin(driver).click();	 

	
    }
}
