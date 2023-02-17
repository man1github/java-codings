package com.maven.javabasics;

import org.testng.annotations.Test;

import com.maven.javabasics.Driverclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoqaBookClass extends Driverclass {
  @Test
  public void f() {

	  WebElement bookStore = driver.findElement(By.xpath("//*[starts-with(@class,'pattern-backgound')]"));
	  boolean BookStore = bookStore.isDisplayed();
	  System.out.println("BookStore is Displayed :" + BookStore);
	  
	  WebElement login = driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]"));
	  boolean Login = login.isDisplayed();
	  System.out.println("Login is Displayed :" + Login);
	  
	  WebElement elements = driver.findElement(By.xpath("//*[text() = 'Elements']"));
	  boolean Elements = elements.isDisplayed();
	  System.out.println("Elements is Displayed :" + Elements);
	  
	  WebElement learningjava = driver.findElement(By.xpath("//*[contains(text(),'Learning Java')]"));
	  boolean learningjava1 = learningjava.isDisplayed();
	  System.out.println("learningjava1 is Displayed :" + learningjava1);
	  
	  WebElement authorname = driver.findElement(By.xpath("//*[starts-with(text(),'Glenn Block')]"));
	  boolean authorname1 = authorname.isDisplayed();
	  System.out.println("authorname1 is Displayed :" + authorname1);
	  
//	  WebElement author = driver.findElement(By.xpath("//*[@class = 'rt-td'][@role='gridcell'][@style='flex: 100 0 auto; width: 100px;'][2]"));
//	  boolean author1 = author.isDisplayed();
//	  System.out.println("author1 is Displayed :" + author1);
	    
	  WebElement searchBar = driver.findElement(By.xpath("//input[@id = 'searchBox']"));
	  searchBar.sendKeys("speaking javaScript" + Keys.ENTER);
	  boolean SearchBar = searchBar.isDisplayed();
	  System.out.println("SearchBar is Displayed :" + SearchBar);
	  
//	  WebElement link = driver.findElement(By.linkText("/books?book=9781449365035"));
//	  boolean link1 = link.isDisplayed();
//	  System.out.println("link1 is Displayed :" + link1);
	  
	
	 
  }
  @BeforeMethod
  public void beforeMethod() {
		OpenDriver("https://demoqa.com/books");
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
