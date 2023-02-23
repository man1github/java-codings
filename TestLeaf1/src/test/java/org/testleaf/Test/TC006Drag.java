package org.testleaf.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testleaf.browser.DragPage;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC006Drag extends CommonActions{
	
 
  public void dragelement() {
	  DragPage.clickBrowserElement(driver).click();
	  DragPage.clickDragElement(driver).click();
	    
  }
  @Test
  public void dragtype1() { // doubt in draggble row, line 33
	  dragelement();
	  WebElement drag = DragPage.clickDraggable(driver);
	  Actions action = new Actions(driver);
	  action.dragAndDropBy(drag, 200, 0).build().perform();
	  
	  WebElement dragElementInDroppable = DragPage.clickDragElementInDroppable(driver);
	  WebElement dropElementInDroppable = DragPage.clickDropElementInDroppable(driver);
	  action.dragAndDrop(dragElementInDroppable, dropElementInDroppable).build().perform();
	  
	  WebElement dragColumnsName = DragPage.clickDraggableColumnsName(driver);
	  WebElement dropColumnsCategory = DragPage.clickDraggableColumnsCategory(driver);
      action.dragAndDrop(dragColumnsName, dropColumnsCategory).build().perform();
      
	  action.dragAndDrop(DragPage.clickDraggableRowsBambooWatch(driver), DragPage.clickDraggableRowsBlackWatch(driver)).build().perform();

  }
}
