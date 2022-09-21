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

public class ViolationRule extends Commonclass {
  @Test
  public void violationr() throws InterruptedException {
	  
	  
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
	  		if(hrlist.get(i).getText().contains("Violations Rule Engine")) 
	  		{
	  			hrlist.get(i).click();
	  			break;
	  		}
	  	}
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//input[@placeholder='ID']")).sendKeys("1");
	  	WebElement vehicletype = driver.findElement(By.xpath("//select[@name='vehicleType']"));
	  	Select veht= new Select(vehicletype);
	  	veht.selectByIndex(0);
	  	WebElement severity = driver.findElement(By.xpath("//select[@name='severity']"));
	  	Select sev= new Select(severity);
	  	sev.selectByVisibleText("High");
	  	driver.findElement(By.xpath("//input[@placeholder='0']")).sendKeys("60");
	  	driver.findElement(By.xpath("//input[@name='over_limit']")).sendKeys("61");
	  	WebElement act= driver.findElement(By.xpath("//select[@name='subViolationType']"));
	  	Select violationact = new Select(act);
	  	violationact.selectByVisibleText("Violate");
	  	driver.findElement(By.xpath("//input[@name='cost']")).sendKeys("250");
	  	WebElement reponsiblity = driver.findElement(By.xpath("//select[@name='responsibility']"));
	  	Select resp= new Select(reponsiblity);
	  	resp.selectByVisibleText("Driver");
	  	driver.findElement(By.xpath("//input[@name='repeated']")).sendKeys("1");
	  	driver.findElement(By.xpath("//input[@name='period']")).sendKeys("1");
	  	driver.findElement(By.xpath("//input[@name='notification_frequency']")).sendKeys("1");
	  	WebElement violaction= driver.findElement(By.xpath("//select[@name='action']"));
	  	Select violact = new Select(violaction);
	  	violact.selectByVisibleText("None");
	  	driver.findElement(By.xpath("//textarea[@name='Description']")).sendKeys("Maximum Speed Rule");
	  	driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  	
	  	
	  	// Edit Violation rule 
	  	
	  	WebDriverWait violationmainpage = new WebDriverWait(driver, Duration.ofSeconds(10));
	  	violationmainpage.until(ExpectedConditions.urlContains("https://saas-dev.wiot360.com/tpc-portal/violation-rule-engine"));
	  	List<WebElement> violationrulelist = driver.findElements(By.xpath("//tbody/tr"));
	  	violationrulelist.size();
	  	for(int i=0; i< violationrulelist.size();)
	  	{
	  		violationrulelist.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[10]/div[1]")).click();
	  		break;
	  	}
	  	List<WebElement> violateaction = driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  	violateaction.size();
	  	for(int i=0;i< violateaction.size();)
	  	{
	  		if(violateaction.get(i).getText().contains("Edit"))
	  		{
	  			violateaction.get(i).click();
	  			break;
	  		}
	  	}
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//input[@placeholder='0']")).sendKeys("40");
	  	driver.findElement(By.xpath("//textarea[@name='Description']")).sendKeys("Automated Violation Rule Updated");
	  	driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	  	
	  	// View Details Page
	  	
	  	WebDriverWait violationmainpage1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	  	violationmainpage1.until(ExpectedConditions.urlContains("https://saas-dev.wiot360.com/tpc-portal/violation-rule-engine"));
	  	List<WebElement> violationrulelist1 = driver.findElements(By.xpath("//tbody/tr"));
	  	violationrulelist1.size();
	  	for(int i=0; i< violationrulelist1.size();)
	  	{
	  		violationrulelist1.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[10]/div[1]")).click();
	  		break;
	  	}
	  	List<WebElement> violateaction1 = driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  	violateaction1.size();
	  	for(int i=0;i< violateaction1.size();)
	  	{
	  		if(violateaction1.get(i).getText().contains("View Details"))
	  		{
	  			violateaction1.get(i).click();
	  			break;
	  		}
	  	}
	  	
	  	System.out.println("Violation Testing Completed");
	  	
	  	
	  	
	  	
  }
}
