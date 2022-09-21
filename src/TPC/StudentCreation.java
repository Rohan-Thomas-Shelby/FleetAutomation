package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StudentCreation extends Commonclass {
  @Test
  public void student() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/tngkjthx.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]")).click();
	  driver.findElement(By.xpath("//div[@class='custom-wrapper-show show']//li[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//i[@class='innov-icon icon-nav-student ']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@name='dob']")).click();
	  driver.findElement(By.xpath("//span[@class='day__month_btn up']")).click();
	  for(int i=0;i<7;i++)
	  {
		  driver.findElement(By.xpath("//div[@class='row mt-3']//div[3]//header[1]//span[1]")).click();
	  }
	  driver.findElement(By.xpath("//span[normalize-space()='January']")).click();
	  driver.findElement(By.xpath("//span[normalize-space()='9']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mohammad");
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khan");
	  WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
	  Select count = new Select(country);
	  count.selectByVisibleText("United Arab Emiartes");
	  driver.findElement(By.xpath("//div[@class='flex-column mr-2']//div//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@class='flex-column mr-2']//div//div[@class='multiselect__tags']")).sendKeys("Liwa Tower");
	  List<WebElement> addr= driver.findElements(By.xpath("//div[@class='row custom-gutter']//li"));
	  addr.size();
	  for(int a=0;a<addr.size();a++)
	  {
		  if(addr.get(a).getText().contains("Liwa Tower - Abu Dhabi - United Arab Emirates"))
		  {
			  addr.get(a).click();
			  break;
		  }
	  }
	  
	  
  }
}
