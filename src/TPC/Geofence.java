package TPC;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Geofence extends Commonclass {
  @Test
  public void geofence() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/burmxlrn.json']")).click();
	  WebElement geoadd = driver.findElement(By.xpath("//span[@class='add-btn-css']"));
	  if(geoadd.isDisplayed())
	  {
		  geoadd.click();
	  }
	  else 
	  {
		  WebDriverWait addwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  addwait.until(ExpectedConditions.visibilityOf(geoadd));
		  System.out.println("Geo Fence Main Listing Page has not loaded");
	  }
	  driver.findElement(By.xpath("//input[@placeholder='Enter Name Here']")).sendKeys("Embassy of Jordan");
	  WebElement gtype =  driver.findElement(By.xpath("//select[@name='Type']"));
	  Select geotype = new Select(gtype);
	  geotype.selectByVisibleText("Circle");
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img multiselect--active']")).sendKeys("Embassy of Jordan, Abu Dhabi");
	  List<WebElement> geoaddr = driver.findElements(By.xpath("//div[@class='col-md-12 col-sm-12 text-left responsive-main-space']//li"));
	  geoaddr.size();
	  for(int i=0;i<geoaddr.size();i++)
	  {
		  if(geoaddr.get(i).getText().contains("Embassy of Jordan - Sheikh Rashid Bin Saeed Al Maktoum Street (Old Airport Road) - Abu Dhabi - United Arab Emirates"))
		  {
			  Thread.sleep(2000);
			  geoaddr.get(i).click();
			  break;
		  }
	  }
	  Thread.sleep(2000);
	  List<WebElement> weekdays =  driver.findElements(By.xpath("//div[@class='row mt-3']/div/div/label/span"));
	  weekdays.size();
	  for(int i=0;i<=weekdays.size()-1;i++)
	  {
		  weekdays.get(i).click();
	  }
	  
	  WebElement geocircle =  driver.findElement(By.xpath("//*[@id=\"Add GeoFence\"]/div[1]/div/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/div/div[5]"));
	  Actions georad = new Actions(driver);
	  georad.clickAndHold(geocircle).dragAndDropBy(geocircle, 7, 5).release().perform();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  
  }
}
