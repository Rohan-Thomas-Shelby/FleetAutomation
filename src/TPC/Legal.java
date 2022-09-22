package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Legal extends Commonclass {
  @Test
  public void legal() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/fqutmqom.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter Name Here']")).sendKeys("Driver Contract");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='contractFrom']")).click();
	  driver.findElement(By.xpath("//span[normalize-space()='1']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img multiselect--above']//div[@class='multiselect__tags']")).click();
	  List<WebElement> langlist = driver.findElements(By.xpath("//div[@class='action-card custom-action-card left-side-action-card']//li"));
	  langlist.size();
	  for(int i=0;i<langlist.size();i++)
	  {
		  if(langlist.get(i).getText().contains("English"))
		  {
			  langlist.get(i).click();
			  break;
		  }
	  }
	  List<WebElement> checkbox= driver.findElements(By.xpath("//div[@class='option-list-item col-md-6 col-sm-12']/div/input"));
	  checkbox.size();
	  for(int j=0;j<checkbox.size()-1;j++)
	  {
		  checkbox.get(j).click();
	  }
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='custom-input']//div[@class='multiselect__tags']")).click();
	  List<WebElement> auth1= driver.findElements(By.xpath("//div[@class='col-md-12 col-sm-12']//li"));
	  auth1.size();
	  for(int h=0;h<auth1.size();h++)
	  {
		  if(auth1.get(h).getText().contains("Yes"))
		  {
			  auth1.get(h).click();
			  break;
		  }
	  }
	  WebElement legalframe =  driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, editor1']"));
	  driver.switchTo().frame(legalframe);
	  driver.findElement(By.xpath("//body")).click();
	  driver.findElement(By.xpath("//body")).sendKeys("Driver Contract");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  
  }
}
