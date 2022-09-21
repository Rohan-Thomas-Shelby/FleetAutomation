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

public class DVIR extends Commonclass {
  @Test
  public void dvir() throws InterruptedException {
	  
	  	WebDriverWait rrwait= new WebDriverWait(driver, Duration.ofSeconds(5));
	  	rrwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/syzdvjlt.json']")));
	  	WebElement menuOption = driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/syzdvjlt.json']"));
	  	Actions actions = new Actions(driver);
	  	actions.moveToElement(menuOption).perform();
	  	List<WebElement> rrlist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[12]/span[1]/ul[1]/li"));
	  	rrlist.size();
	  	System.out.println("List Count="+ rrlist.size());
	  	
	  	for(int i=0; i<rrlist.size();i++)
	  	{
	  		if(rrlist.get(i).getText().contains("DVIR Rule")) 
	  		{
	  			rrlist.get(i).click();
	  			break;
	  		}
	  	}
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  	driver.findElement(By.xpath("//input[@placeholder='Enter name here']")).sendKeys("Driver Vehicle Inpsection");
	  	WebElement dvirdrop = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/form/div[2]/div[1]/div/div/select"));
	  	Select dvircatdrop = new Select(dvirdrop);
	  	dvircatdrop.selectByIndex(0);
	  	driver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys("Radiator");
	  	WebElement itemcrit = driver.findElement(By.xpath("//select[@name='critical_leval0']"));
	  	Select itempri= new Select(itemcrit);
	  	itempri.selectByVisibleText("High");
	  	
	  		
	  
	  
  }
}
