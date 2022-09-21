package TPC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RoleManagement extends Commonclass{
  @Test
  public void rolecreation() throws InterruptedException {
	  
	  	WebDriverWait hrwait= new WebDriverWait(driver, Duration.ofSeconds(5));
		hrwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/akbjoiow.json']")));
	  	WebElement menuOption = driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/akbjoiow.json']"));
	  	Actions actions = new Actions(driver);
	  	actions.moveToElement(menuOption).perform();
	  	List<WebElement> hrlist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[21]/span[1]/ul[1]/li"));
	  	hrlist.size();
	  	System.out.println("List Count"+ hrlist.size());
	  	
	  	for(int i=0; i<hrlist.size();i++)
	  	{
	  		if(hrlist.get(i).getText().contains("Role Management")) 
	  		{
	  			hrlist.get(i).click();
	  			break;
	  		}
	  	}
	  	
	  	
	  	// Main Page 
	  	
	  	
	  	
	  	List<WebElement> roleid = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	  	String id= roleid.get(0).getText();
	  	List <WebElement> rolename= driver.findElements(By.xpath("//tbody/tr/td[2]/span")); 
	    String role=rolename.get(0).getText();
	    System.out.println("ID="+id);
	    driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys(id);
	  	driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys(role);
	  	driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  	driver.findElement(By.xpath("//input[@placeholder='Enter Role Name']")).sendKeys("Manager Role");
	  	List<WebElement> rolecard= driver.findElements(By.xpath("//div[@class='card mb-2']/div/div/label"));
	  	System.out.println(rolecard.size());
	  	for(int i=0;i<=rolecard.size()-1;i++)
	  	{
	  		rolecard.get(i).click();
	  		
	  		
	  	}
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  	
	  	// Edit
	  	
	  	List<WebElement> rolemainlist = driver.findElements(By.xpath("//tbody/tr"));
	  	System.out.println("No of rows:"+ rolemainlist.size());
	  	for(int j=0; j<rolemainlist.size();j++)
	  	{
	  		rolemainlist.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[7]/div[1]")).click();
	  		break;
	  	}
	  	Thread.sleep(2000);
	  	List<WebElement> actedit= driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/ul[1]/li"));
	  	actedit.size();
	  	for(int ed=0;ed<actedit.size();ed++)
	  	{
	  		if(actedit.get(ed).getText().contains("Edit"))
	  		{
	  			actedit.get(ed).click();
	  			break;
	  		}
	  	}
	  	Thread.sleep(2000);
	  	List<WebElement> roleedit= driver.findElements(By.xpath("//div[@class='card mb-2']/div/div/label"));
	  	System.out.println(roleedit.size());
	  	for(int i=0;i<5;i++)
	  	{
	  		roleedit.get(i).click();
	  	}
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//button[@type='submit']")).click();
	  	
	  	// Deactivate
	  	Thread.sleep(2000);
		List<WebElement> rolemainlist1 = driver.findElements(By.xpath("//tbody/tr"));
	  	System.out.println("No of rows:"+ rolemainlist1.size());
	  	for(int j=0; j<rolemainlist1.size();j++)
	  	{
	  		rolemainlist1.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[7]/div[1]")).click();
	  		break;
	  	}
	  	Thread.sleep(2000);
	  	List<WebElement> actdeact= driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/ul[1]/li"));
	  	actdeact.size();
	  	for(int ed=0;ed<actdeact.size();ed++)
	  	{
	  		if(actdeact.get(ed).getText().contains("Deactivate"))
	  		{
	  			actdeact.get(ed).click();
	  			break;
	  		}
	  		else if(actdeact.get(ed).getText().contains("Active"))
	  		{
	  			actdeact.get(ed).click();
	  			break;
	  		}
	  			
	  	}
	  	
	  	// Profile
	  	
	  	Thread.sleep(2000);
	  	List<WebElement> rolemainlist2 = driver.findElements(By.xpath("//tbody/tr"));
	  	System.out.println("No of rows:"+ rolemainlist2.size());
	  	for(int j=0; j<rolemainlist2.size();j++)
	  	{
	  		rolemainlist2.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[7]/div[1]")).click();
	  		break;
	  	}
	  	Thread.sleep(2000);
	  	List<WebElement> actprofile= driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/ul[1]/li"));
	  	actdeact.size();
	  	for(int ed=0;ed<actprofile.size();ed++)
	  	{
	  		if(actprofile.get(ed).getText().contains("Deactivate"))
	  		{
	  			actprofile.get(ed).click();
	  			break;
	  		}
	  		else if(actprofile.get(ed).getText().contains("Active"))
	  		{
	  			actprofile.get(ed).click();
	  			break;
	  		}
	  			
	  	}
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//span[normalize-space()='Assigned Users']")).click();
	  	driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
	  	List<WebElement> stafflist= driver.findElements(By.xpath("//div[@class='form-container']//li"));
	  	stafflist.size();
	  	for(int h=0; h<stafflist.size();h++)
	  	{
	  		if(stafflist.get(h).getText().contains("List is empty."))
	  		{
	  			System.out.println("No staffs available");
	  			break;
	  		}
	  		else
	  		{
	  			stafflist.get(0).click();
	  			break;
	  		}
	  	
	  	}
	  	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  	
	  	
	  	
	  
  }
}
