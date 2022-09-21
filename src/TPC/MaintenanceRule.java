package TPC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MaintenanceRule extends Commonclass{
  @Test
  public void maintenancerule() throws InterruptedException {
	  
	  
	  WebDriverWait hrwait= new WebDriverWait(driver, Duration.ofSeconds(5));
		hrwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/syzdvjlt.json']")));
	  	WebElement menuOption = driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/syzdvjlt.json']"));
	  	Actions actions = new Actions(driver);
	  	actions.moveToElement(menuOption).perform();
	  	List<WebElement> hrlist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[21]/span[1]/ul[1]/li"));
	  	hrlist.size();
	  	System.out.println("List Count"+ hrlist.size());
	  	
	  	for(int i=0; i<hrlist.size();i++)
	  	{
	  		if(hrlist.get(i).getText().contains("Maintenance Rule")) 
	  		{
	  			hrlist.get(i).click();
	  			break;
	  		}
	  	}
	  	
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  	WebElement vehtype=  driver.findElement(By.xpath("//select[@placeholder='Vehicle Number']"));
	  	Select vehicletype = new Select(vehtype);
	  	vehicletype.selectByIndex(1);
	  	driver.findElement(By.xpath("//input[@placeholder='Title']")).click();
	  	driver.findElement(By.xpath("//label[normalize-space()='Replacing']")).click();
	  	driver.findElement(By.xpath("//span[normalize-space()='Mandatory']")).click();
	  	driver.findElement(By.xpath("//input[@name='time']")).sendKeys("30");
	  	driver.findElement(By.xpath("//body//div[@class='w-100 overflow-main']//div[@class='card-body']//div[@class='card-body']//div[2]//div[1]//div[1]//div[1]//input[1]")).sendKeys("30");
	  	WebElement sev = driver.findElement(By.xpath("//select[@name='severity']"));
	  	Select severity = new Select(sev);
	  	severity.selectByVisibleText("High");
	  	driver.findElement(By.xpath("//input[@name='rem_time']")).sendKeys("25");
	  	driver.findElement(By.xpath("//div[@class='row custom-gutter maintenace-rule-row mt-0']//div[2]//div[1]//div[1]//div[1]//input[1]")).sendKeys("28");
	  	WebElement remsev = driver.findElement(By.xpath("//select[@name='rem_severity']"));
	  	Select sevreminder = new Select(remsev);
	  	sevreminder.selectByVisibleText("High");
	  	driver.findElement(By.xpath("//span[normalize-space()='Reminder']")).click();
	  	driver.findElement(By.xpath("//input[@name='labour_cost']")).sendKeys("120");
	  	driver.findElement(By.xpath("//input[@name='part_cost']")).sendKeys("100");
	  	driver.findElement(By.xpath("//input[@name='notification_interval']")).sendKeys("1");
	  	WebElement notdur = driver.findElement(By.xpath("//select[@class='form-control dropdown-item']"));
	  	Select duration = new Select(notdur);
	  	duration.selectByIndex(1);
	  	driver.findElement(By.xpath("//div[@class='flex-column text-left']//div[@class='options-list']//input[@value='2']")).click();
	  	driver.findElement(By.xpath("//button[@class='btn']")).click();
	  	
	  	// Edit
	  	
	  	Thread.sleep(2000);
	  	List<WebElement> maintlist= driver.findElements(By.xpath("//tbody/tr"));
	  	maintlist.size();
	  	for(int i=0; i<maintlist.size();)
	  	{
	  		maintlist.get(0).findElement(By.xpath("//tbody/tr/td[7]/div[1]")).click();
	  		break;
	  	}
	  	List<WebElement> actedit= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  	actedit.size();
	  	for(int j=0;j<actedit.size();j++)
	  	{
	  		if(actedit.get(j).getText().contains("Edit"))
	  		{
	  			actedit.get(j).click();
	  			break;
	  		}
	  	}
	  	
	  	// Activate and Deactivate 
	  	
	  	Thread.sleep(2000);
	  	List<WebElement> maintlist1= driver.findElements(By.xpath("//tbody/tr"));
	  	maintlist1.size();
	  	for(int i=0; i<maintlist1.size();)
	  	{
	  		maintlist1.get(0).findElement(By.xpath("//tbody/tr/td[7]/div[1]")).click();
	  		break;
	  	}
	  	List<WebElement> actedit1= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  	actedit1.size();
	  	for(int j=0;j<actedit1.size();j++)
	  	{
	  		if(actedit1.get(j).getText().contains("Deactivate"))
	  		{
	  			actedit1.get(j).click();
	  			break;
	  		}
	  		else if(actedit1.get(j).getText().contains("Activate"))
	  		{
	  			actedit1.get(j).click();
	  			break;
	  		}
	  	}
	  	
	  	// Profile
	  	
		Thread.sleep(2000);
	  	List<WebElement> maintlist2= driver.findElements(By.xpath("//tbody/tr"));
	  	maintlist2.size();
	  	for(int i=0; i<maintlist2.size();)
	  	{
	  		maintlist2.get(0).findElement(By.xpath("//tbody/tr/td[7]/div[1]")).click();
	  		break;
	  	}
	  	List<WebElement> actedit2= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  	actedit2.size();
	  	for(int j=0;j<actedit2.size();j++)
	  	{
	  		if(actedit2.get(j).getText().contains("Deactivate"))
	  		{
	  			actedit2.get(j).click();
	  			break;
	  		}
	  		else if(actedit2.get(j).getText().contains("Activate"))
	  		{
	  			actedit2.get(j).click();
	  			break;
	  		}
	  	}
	  	
	  	System.out.println("Maintenance Rule Test Completed");
	  	
	  
  }
}
