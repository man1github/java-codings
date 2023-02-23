package org.testleaf.Test;

import org.openqa.selenium.Keys;
import org.testleaf.element.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC007Textbox extends CommonActions{
	
  public void textBoxElement() {	  
	  TextBoxPage.clickElement(driver).click();
	  TextBoxPage.clickTextBox(driver).click();	  
  }
  
  @Test
  public void textboxType() {
	  
	  textBoxElement();	  
	  TextBoxPage.typeYourName(driver).sendKeys(properties.getProperty("name"));
	  TextBoxPage.appendCountryName(driver).sendKeys(properties.getProperty("country"));
	  TextBoxPage.verifTextBoxDisabled(driver).isEnabled();
	  TextBoxPage.clearText(driver).clear();
	  TextBoxPage.retrieveText(driver).getAttribute("value");
	  TextBoxPage.enterEmailAndTab(driver).sendKeys(properties.getProperty("email") + Keys.TAB); // how to confirm
	  
	  TextBoxPage.enterAboutYourself(driver).sendKeys(properties.getProperty("about"));
	//  TextBoxPage.clickItalicTextEditor(driver).click();//how to click bold, italics option editor
	  TextBoxPage.clickTextEditor(driver).sendKeys(properties.getProperty("name"));  
	  TextBoxPage.pressEnterConfirmError(driver).sendKeys(Keys.ENTER);
	  Assert.assertTrue(TextBoxPage.confirmError(driver).isDisplayed());
	  TextBoxPage.clickAndConfirmLabelPositionChanges(driver).click(); // label position change
	  TextBoxPage.typeNameChooseThirdOption(driver).sendKeys(properties.getProperty("name"));
	  TextBoxPage.chooseThirdOption(driver).click(); // label position change
	  TextBoxPage.typeDOBConfirmDateChoosen(driver).sendKeys(properties.getProperty("dob")); // confirm date
	  TextBoxPage.typeNumberandSpinValue(driver).sendKeys(properties.getProperty("number"));
	  TextBoxPage.spinValue(driver).click();
	  TextBoxPage.typeRandomNumber(driver).sendKeys(properties.getProperty("randomNumber"));
	  Assert.assertEquals(TextBoxPage.confirmMovesCorrectly(driver), "left: 20%;");
	  TextBoxPage.clickAndConfirmKeyboardAppears(driver).click();
	  Assert.assertTrue(TextBoxPage.closekeyboard(driver).isEnabled());
	  TextBoxPage.closekeyboard(driver).click();
	  TextBoxPage.clickBoldCustomToolBar(driver).click();
	  TextBoxPage.clickItalicCustomToolBar(driver).click();
	  TextBoxPage.clickCustomToolBar(driver).sendKeys(properties.getProperty("name"));
	 
	
}
  
  
}
