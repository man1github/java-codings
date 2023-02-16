package testngclass.mavenproject2;

import org.testng.annotations.Test;

import javademo.mavenproject2.Driverclass;

public class ParallelTesting extends Driverclass {
  @Test
  public void google() {
	  openDriver("https://gooogle.com/");
  }
  @Test
  public void bing() {
	  openDriver("https://www.bing.com/");
  }
  @Test
  public void facebook() {
	  openDriver("https://www.facebook.com/");
  }
  @Test
  public void demoqa() {
	  openDriver("https://demoqa.com/");
  }
  
}

