package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageBranches extends Commonclass{
  @Test
  public void branches() throws InterruptedException {
	  
	  
	  // Branch Creation
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/uomeiszp.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter Branch Name']")).sendKeys("Dubai");
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img multiselect--above']//div[@class='multiselect__tags']")).click();
	  List<WebElement> branchstaff = driver.findElements(By.xpath("//div[@class='col-sm-12 col-md-3 profile-info']//li"));
	  branchstaff.size();
	  for(int i=0;i<branchstaff.size();)
	  {
		  branchstaff.get(0).click();
		  break;
	  }
	  
	  driver.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("dubaibranch123@yopmail.com");
	  driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("971545314079");
	  driver.findElement(By.xpath("//input[@name='work_phone0']")).sendKeys("024472059");
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).sendKeys("Karama, Dubai");
	  List<WebElement> branchaddr = driver.findElements(By.xpath("//div[@class='col-md-9 col-sm-12 pl-sm-0 for-responsive-left']//li"));
	  branchaddr.size();
	  for(int j=0;j<branchaddr.size();j++)
	  {
		  if(branchaddr.get(j).getText().contains("Karama - Dubai - United Arab Emirates"))
		  {
			  branchaddr.get(j).click();
			  break;
		  }
	  }
	  WebElement branchstat = driver.findElement(By.xpath("//select[@name='statusFeald']"));
	  Select bstatus= new Select(branchstat);
	  bstatus.selectByVisibleText("Active");
	  driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
	  
	  
	  // Edit
	  
	  Thread.sleep(2000);
	  List<WebElement> branchlist = driver.findElements(By.xpath("//tr[@class='row-odd']"));
	  branchlist.size();
	  for(int i=0; i< branchlist.size();)
	  {
		  branchlist.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		  break;
	  }
	  List<WebElement> actionlist = driver.findElements(By.xpath("//tbody//li"));
	  actionlist.size();
	  for(int j=0;j<actionlist.size();j++)
	  {
		  if(actionlist.get(j).getText().contains("Edit"))
		  {
			  actionlist.get(j).click();
			  break;
		  }
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
	  
	  // Activate Deactivate
	  
	  Thread.sleep(2000);
	  List<WebElement> branchlist1 = driver.findElements(By.xpath("//tr[@class='row-odd']"));
	  branchlist1.size();
	  for(int i=0; i< branchlist1.size();)
	  {
		  branchlist1.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		  break;
	  }
	  List<WebElement> actionlist1 = driver.findElements(By.xpath("//tbody//li"));
	  actionlist1.size();
	  for(int j=0;j<actionlist1.size();j++)
	  {
		  if(actionlist1.get(j).getText().contains("Deactivate"))
		  {
			  actionlist1.get(j).click();
			  break;
		  }
		  else if(actionlist1.get(j).getText().contains("Activate"))
		  {
			  actionlist1.get(j).click();
			  break;
		  }
	  }
	  
	  //View Details
	  
	  Thread.sleep(2000);
	  List<WebElement> branchlist2 = driver.findElements(By.xpath("//tr[@class='row-odd']"));
	  branchlist2.size();
	  for(int i=0; i< branchlist2.size();)
	  {
		  branchlist2.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		  break;
	  }
	  List<WebElement> actionlist2 = driver.findElements(By.xpath("//tbody//li"));
	  actionlist2.size();
	  for(int j=0;j<actionlist2.size();j++)
	  {
		  if(actionlist2.get(j).getText().contains("View Details"))
		  {
			  actionlist2.get(j).click();
			  break;
		  }
	  }
	  
	  
	  
  }
}
