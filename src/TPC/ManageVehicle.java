package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageVehicle extends Commonclass {
	@Test
	public void vehiclemodule() throws InterruptedException {
		
		
		// Creation
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[1]/div/ul/li[11]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
		WebElement vehicletype= driver.findElement(By.xpath("//select[@id='vehicleType']"));
		Select vtype= new Select(vehicletype);
		vtype.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='required-dvr-toggle']")).click();
		Thread.sleep(1000);
		WebElement dvirdrop= driver.findElement(By.xpath("//select[@placeholder='Selected DVIR']"));
		Select dvir= new Select(dvirdrop);
		dvir.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='make']")).sendKeys("Nissan");
		driver.findElement(By.xpath("//input[@name='model']")).sendKeys("Sunny");
		Thread.sleep(2000);
		WebElement year= driver.findElement(By.xpath("//select[@name='year']"));
		Select makeyear= new Select(year);
		makeyear.selectByIndex(1);
		driver.findElement(By.xpath("//input[@placeholder='VIN Number']")).sendKeys("1FAFP55SXYA268661");
		driver.findElement(By.xpath("//input[@placeholder='Reading']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@placeholder='Vehicle 1']")).sendKeys("32323");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Purchased Date']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Purchased Price']")).sendKeys("60000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pasSeats']")).sendKeys("5");
		WebElement type= driver.findElement(By.xpath("//select[@name='Type']"));
		Select ltype= new Select(type);
		ltype.selectByIndex(0);
		WebElement state= driver.findElement(By.xpath("//select[@name='State']"));
		Select sstate= new Select(state);
		sstate.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='Category']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@name='Plate No']")).sendKeys("52369");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Engine']")).sendKeys("1600");
		driver.findElement(By.xpath("//input[@name='Engine Size']")).sendKeys("1.6");
		driver.findElement(By.xpath("//input[@name='Capacity']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Capacity']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@name='City Consumption']")).sendKeys("7.2");
		driver.findElement(By.xpath("//input[@name='Highway Consumption']")).sendKeys("8.2");
		driver.findElement(By.xpath("//input[@name='GVWR']")).sendKeys("1.2");
		driver.findElement(By.xpath("//input[@name='Length']")).sendKeys("3.2");
		driver.findElement(By.xpath("//input[@name='Height']")).sendKeys("1.5");
		driver.findElement(By.xpath("//input[@name='Width']")).sendKeys("1.4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		
		
		// Edit
		
		List<WebElement> vehiclelist= driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> actionbtn= driver.findElements(By.xpath("//tbody/tr/td[10]/div[1]"));
		actionbtn.size();
		vehiclelist.size();
		for(int list=0; list<vehiclelist.size();)
		{
			   	vehiclelist.get(0).findElement(By.xpath("//tbody/tr/td[10]/div[1]")).click();
			    break;
			    
		}
		List<WebElement> actionlist= driver.findElements(By.xpath("//div[@class='dropdown b-dropdown position-static show btn-group']//li"));
		actionlist.size();
		for(int i=0;i<actionlist.size();i++)
		{
			if(actionlist.get(i).getText().contains("Edit"))
			{
				actionlist.get(i).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='VIN Number']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='VIN Number']")).sendKeys("1G6DP577770146809");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Plate No']")).clear();
		driver.findElement(By.xpath("//input[@name='Plate No']")).sendKeys("52366");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		
		// Profile
		Thread.sleep(2000);
		List<WebElement> vehiclelist1= driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> actionbtn1= driver.findElements(By.xpath("//tbody/tr/td[10]/div[1]"));
		actionbtn1.size();
		vehiclelist1.size();
		for(int list=0; list<vehiclelist1.size();)
		{
			   	vehiclelist1.get(0).findElement(By.xpath("//tbody/tr/td[10]/div[1]")).click();
			    break;
			    
		}
		List<WebElement> actionlist1= driver.findElements(By.xpath("//div[@class='dropdown b-dropdown position-static show btn-group']//li"));
		actionlist1.size();
		for(int i=0;i<actionlist1.size();i++)
		{
			if(actionlist1.get(i).getText().contains("View Details"))
			{
				actionlist1.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Vehicle Cost']")).click();
		driver.findElement(By.xpath("//div[@id='Module2']//span[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("300000");
		driver.findElement(By.xpath("//div[@class='custom-input d-flex align-items-center custom-prehand']//input[@type='number']")).sendKeys("21520");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(@class,'v-icon notranslate material-icons theme--light')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Loan & Payments']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'add-btn-css')]")).click();
		for(int i=0;i<10;i++)
			{	
				WebElement loantype = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/select[1]"));
				Select loanlisttype= new Select(loantype);
				loanlisttype.selectByVisibleText(" One Time ");
				WebElement paytype= driver.findElement(By.xpath("//select[contains(@name,'payment_type')]"));
				Select ptype= new Select(paytype);
				ptype.selectByIndex(0);
				driver.findElement(By.xpath("//input[@name='payment']")).sendKeys("4000");
				driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			}
		
		
		Thread.sleep(2000);
		
		System.out.println("Manage Vehicle Testing Completed");
		
		
		
		
		
	}

}
