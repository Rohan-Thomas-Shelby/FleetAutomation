package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MaintenanceManagement extends Commonclass {
	
	
	String managevehicletype;
	@Test(priority=2)
  	public void maintenancemanagement() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/sbiheqdr.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']"));
	  List<WebElement> serlist = driver.findElements(By.xpath("//div[@class='col-md-12']/select/option"));
	  serlist.size();
	  for(int i=0;i< serlist.size();i++)
	  {
		  String vehicletypelist = serlist.get(i).getText();
			  if(managevehicletype.equals(vehicletypelist))
				  {
					  WebElement vehicletype = driver.findElement(By.xpath("//select[@name='v_type']"));
					  Select vtype= new Select(vehicletype);
					  vtype.selectByIndex(0);
				  }
	  }
	  WebElement vehicletype = driver.findElement(By.xpath("//select[@name='v_type']"));
	  Select vtype= new Select(vehicletype);
	  vtype.selectByIndex(0);
	  driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys("Vehicle Servicing");
	  WebElement servicestatus= driver.findElement(By.xpath("//div[@class='col-xl-12 col-sm-12 text-left responsive-main-space']//select[@placeholder='Vehicle Number']"));
	  Select services = new Select(servicestatus);
	  services.selectByIndex(0);
	  driver.findElement(By.xpath("//label[normalize-space()='Replacing']")).click();
	  driver.findElement(By.xpath("//span[normalize-space()='Mandatory']")).click();

	  
	  
	  
  }
  @Test(priority=1)
  public void managevehiclelist() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/hzwwacsy.json']")).click();
	  Thread.sleep(2000);
	  List<WebElement> vehiclelist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[2]/div[1]/div/div[2]"));
	  vehiclelist.size();
	  for(int i=0; i<vehiclelist.size();i++)
	  {
		  String managevehicletype = vehiclelist.get(i).getText();
		  System.out.println(managevehicletype);
	  }
	  
	  
  }
}
