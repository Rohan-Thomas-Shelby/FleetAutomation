package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SavedPlaces extends Commonclass{
  @Test
  public void savedplace() throws InterruptedException {
	  
	  
	  
	  WebElement spaddbtn = driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/zzcjjxew.json']"));
	  if(spaddbtn.isDisplayed())
	  {
		  spaddbtn.click();
	  }
	  else {
		  System.out.println("Saved Page is shown blank");
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter Name Here']")).sendKeys("International Tower");
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).sendKeys("International Tower, Abu Dhabi");
	  List<WebElement> sploc = driver.findElements(By.xpath("//div[@class='main-content-container complete-outer-section edit-outer-sections col-sm-11']//li"));
	  sploc.size();
	  for(int i=0; i< sploc.size();i++)
	  {
		  if(sploc.get(i).getText().contains("International Tower - Al Karamah Street - Abu Dhabi - United Arab Emirates"))
		  {
			  sploc.get(i).click();
			  break;
		  }
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  
	  
	  // Edit
	  
	  Thread.sleep(2000);
	  List<WebElement> splist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	  splist.size();
	  for(int j=0; j< splist.size();j++)
	  {
		  splist.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[6]/div[1]")).click();
		  break;
	  }
	  List<WebElement> actionlist =  driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist.size();
	  for(int l=0; l< actionlist.size();l++)
	  {
		  if(actionlist.get(l).getText().contains("Edit"))
		  {
			  actionlist.get(l).click();
			  break;
		  }
	  }
	  driver.findElement(By.xpath("//input[@placeholder='Enter Name Here']")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter Name Here']")).sendKeys("Carreffour, Airport Road, Abu Dhabi");
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).sendKeys("Carreffour, Airport Road, Abu Dhabi");
	  List<WebElement> editaddr =  driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li"));
	  editaddr.size();
	  for(int j=0; j< editaddr.size();j++)
	  {
		  if(editaddr.get(j).getText().contains("Carrefour - Airport Road - Abu Dhabi - United Arab Emirates"))
		  {
			  editaddr.get(j).click();
			  break;
		  }
	  }
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	  
	  // Deactivate or Activate
	  
	  Thread.sleep(2000);
	  List<WebElement> splist1 = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	  splist1.size();
	  for(int j=0; j< splist1.size();j++)
	  {
		  splist1.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[6]/div[1]")).click();
		  break;
	  }
	  List<WebElement> actionlist1 =  driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist1.size();
	  for(int l=0; l< actionlist1.size();l++)
	  {
		  if(actionlist1.get(l).getText().contains("Activate"))
		  {
			  actionlist1.get(l).click();
			  break;
		  }
		  else if(actionlist1.get(l).getText().contains("Deactivate"))
		  {
			  actionlist1.get(l).click();
			  break;
		  }
	  }
	  
	  // View Details
	  
	  Thread.sleep(2000);
	  List<WebElement> splist2 = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	  splist2.size();
	  for(int j=0; j< splist2.size();j++)
	  {
		  splist2.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[6]/div[1]")).click();
		  break;
	  }
	  List<WebElement> actionlist2 =  driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist2.size();
	  for(int l=0; l< actionlist2.size();l++)
	  {
		  if(actionlist2.get(l).getText().contains("View Details"))
		  {
			  actionlist2.get(l).click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
 	  
	  
  }
}
