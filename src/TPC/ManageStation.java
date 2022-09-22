package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class ManageStation extends Commonclass {
  @Test
  public void station() throws InterruptedException {
	  
	  // Create Station
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/dflgefov.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter Station Name']")).sendKeys("Mussaffah");
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img multiselect--above']//div[@class='multiselect__tags']")).click();
	  List<WebElement> stafflist =  driver.findElements(By.xpath("//div[@class='main-content-container complete-outer-section edit-outer-sections col-sm-11']//li"));
	  stafflist.size();
	  for(int i=0;i<stafflist.size();i++)
	  {
		  stafflist.get(0).click();
		  break;
	  }
	  driver.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("station1@yopmail.com");
	  driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("971545314079");
	  driver.findElement(By.xpath("//input[@name='work_phone0']")).sendKeys("024472059");
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).sendKeys("Mussaffah");
	  List<WebElement> stationaddr =  driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li"));
	  stationaddr.size();
	  for(int j=0; j< stationaddr.size();j++)
	  {
		  if(stationaddr.get(j).getText().contains("Musaffah - Abu Dhabi - United Arab Emirates"))
		  {
			  stationaddr.get(j).click();
			  break;
		  }
	  }
	  WebElement stationstat =  driver.findElement(By.xpath("//select[@name='statusFeald']"));
	  Select status = new Select(stationstat);
	  status.selectByVisibleText("Active");
	  driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
	  
	  
	  // Edit 
	  
	  List<WebElement> stationlist = driver.findElements(By.xpath("//tr[@class='row-odd']"));
	  stationlist.size();
	  for(int k=0;k< stationlist.size();k++)
	  {
		  stationlist.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		  break;
	  }
	  Thread.sleep(1000);
	  List<WebElement> actionlist = driver.findElements(By.xpath("//tbody//li"));
	  actionlist.size();
	  for(int l=0;l<actionlist.size();l++)
	  {
		  if(actionlist.get(l).getText().contains("Edit"))
		  {
			  actionlist.get(l).click();
			  break;
		  }
	  }
	  driver.findElement(By.xpath("//input[@name='phone0']")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314078");
	  driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
	  
	  // Deactivate and Activate
	  
	  List<WebElement> stationlist1 = driver.findElements(By.xpath("//tr[@class='row-odd']"));
	  stationlist1.size();
	  for(int k=0;k< stationlist1.size();k++)
	  {
		  stationlist1.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		  break;
	  }
	  Thread.sleep(1000);
	  List<WebElement> actionlist1 = driver.findElements(By.xpath("//tbody//li"));
	  actionlist1.size();
	  for(int l=0;l<actionlist1.size();l++)
	  {
		  if(actionlist1.get(l).getText().contains("Deactivate"))
		  {
			  actionlist1.get(l).click();
			  break;
		  }
		  else if(actionlist1.get(l).getText().contains("Activate"))
		  {
			  actionlist1.get(l).click();
			  break;
		  }
	  }
	  
	  // View Details
	  
	  List<WebElement> stationlist2 = driver.findElements(By.xpath("//tr[@class='row-odd']"));
	  stationlist2.size();
	  for(int k=0;k< stationlist2.size();k++)
	  {
		  stationlist2.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		  break;
	  }
	  Thread.sleep(1000);
	  List<WebElement> actionlist2 = driver.findElements(By.xpath("//tbody//li"));
	  actionlist2.size();
	  for(int l=0;l<actionlist2.size();l++)
	  {
		  if(actionlist2.get(l).getText().contains("Deactivate"))
		  {
			  actionlist2.get(l).click();
			  break;
		  }
		  else if(actionlist2.get(l).getText().contains("Activate"))
		  {
			  actionlist2.get(l).click();
			  break;
		  }
	  }
	  
	  
	  
  }
}
