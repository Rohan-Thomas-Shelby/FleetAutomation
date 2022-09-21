package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageAssistants extends Commonclass {
	@Test
	public void assistant() throws InterruptedException {
		
		driver.findElement(By.xpath("//i[@class='innov-icon icon-nav-icon-manage-assistants ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
		driver.findElement(By.xpath("//div[@autocomplete='on']//div//input[@type='text']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Aug 2006']")).click();
		for(int i=0; i< 7;i++)
		{
			driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[3]/header[1]/span[1]")).click();
		}
		driver.findElement(By.xpath("//div[@autocomplete='on']//span[@class='cell month'][normalize-space()='January']")).click();
		driver.findElement(By.xpath("//span[@class='cell day weekend sun'][normalize-space()='10']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("Salim");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("Ahmed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]")).click();
		List<WebElement> empassist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[3]/ul[1]/li"));
		empassist.size();
		for(int j=0;j<empassist.size();j++)
		{
			if(empassist.get(j).getText().contains("Full Time"))
			{
				empassist.get(j).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]")).click();
		List<WebElement> emplassist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[3]/ul[1]/li"));
		emplassist.size();
		for(int k=0;k<emplassist.size();k++)
		{
			if(emplassist.get(k).getText().contains("Assistants"))
			{
				emplassist.get(k).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@autocomplete='off']//div[@class='vdp-datepicker__calendar']//div//span[@class='cell day'][normalize-space()='1']")).click();
		WebElement countrydrop = driver.findElement(By.xpath("//select[@name='Country']"));
		Select country= new Select(countrydrop);
		country.selectByVisibleText(" United Arab Emirates");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex-column mr-2']//div[@class='multiselect drop-multiselect-auth-img']")).click();
		driver.findElement(By.xpath("//div[@class='flex-column mr-2']//div[@class='multiselect drop-multiselect-auth-img multiselect--active']")).sendKeys("Liwa Tower");
		List<WebElement> addrlist= driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/ul[1]/li"));
		addrlist.size();
		for(int a=0; a< addrlist.size();a++)
		{
			if(addrlist.get(a).getText().contains("Liwa Tower - Abu Dhabi - United Arab Emirates"))
			{
				addrlist.get(a).click();
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("ahmed.imran1@yopmail.com");
		driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314079");
		driver.findElement(By.xpath("//input[@name='work_phone0']")).sendKeys("024472059");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='col-xl-3 col-sm-3 text-left']//div[@class='multiselect__tags']")).click();
		List<WebElement> doc1= driver.findElements(By.xpath("//div[@class='mt-4']//li[2]"));
		doc1.size();
		for(int k=0;k<doc1.size();k++)
		{
			if(doc1.get(k).getText().contains("Passport"))
			{
				doc1.get(k).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter License No.']")).sendKeys("65465132");
		driver.findElement(By.xpath("//div[@class='custom-input d-flex align-items-center date-picker-fleet-custom']//div[@class='vdp-datepicker custom-input']//div[@class='vdp-datepicker__calendar']//div//span[@class='cell day'][normalize-space()='30']")).click();
		WebElement nation= driver.findElement(By.xpath("//select[@name='nationality']"));
		Select nationdrop= new Select(nation);
		nationdrop.selectByVisibleText("United Arab Emirates");
		driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
		
		// Edit
		
		List<WebElement> assistlist= driver.findElements(By.xpath("//tr[@class='row-odd']"));
		assistlist.size();
		for(int a=0; a<assistlist.size();a++)
		{
			assistlist.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		}
		List<WebElement> assistact= driver.findElements(By.xpath("//tbody//li"));
		assistact.size();
		for(int b=0; b< assistact.size();b++)
		{
			if(assistact.get(b).getText().contains("Edit"))
			{
				assistact.get(b).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("55446699");
		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		Thread.sleep(2000);
		
		// Activate Deactivate
		
		List<WebElement> assistlist1= driver.findElements(By.xpath("//tr[@class='row-odd']"));
		assistlist1.size();
		for(int a=0; a<assistlist1.size();a++)
		{
			assistlist1.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		}
		List<WebElement> assistact1= driver.findElements(By.xpath("//tbody//li"));
		assistact1.size();
		for(int b=0; b< assistact1.size();b++)
		{
			if(assistact1.get(b).getText().contains("Deactivate"))
			{
				assistact1.get(b).click();
				break;
			}
			else if(assistact1.get(b).getText().contains("Activate"))
			{
				assistact1.get(b).click();
				break;
			}
			
		}
		
		// Profile
		
		List<WebElement> assistlist2= driver.findElements(By.xpath("//tr[@class='row-odd']"));
		assistlist2.size();
		for(int a=0; a<assistlist2.size();a++)
		{
			assistlist2.get(0).findElement(By.xpath("//div[@class='action-btn']")).click();
		}
		List<WebElement> assistact2= driver.findElements(By.xpath("//tbody//li"));
		assistact2.size();
		for(int b=0; b< assistact2.size();b++)
		{
			if(assistact2.get(b).getText().contains("View Details"))
			{
				assistact2.get(b).click();
				break;
			}
			
		}
		
		
		
	}

}
