package TPC;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TripandDispatch extends Commonclass {
	@Test
	public void trips() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/gghbrdfg.json']")).click();
		Thread.sleep(2000);
		WebElement addbutton= driver.findElement(By.xpath("//span[@class='add-btn-css']"));
		WebDriverWait creation = new WebDriverWait(driver, Duration.ofSeconds(10));
		creation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='add-btn-css']")));
		if(addbutton.isDisplayed())
		{
			addbutton.click();
		}
		else 
		{
			System.out.println("Error in loading Trip and Dispatch main page");
		}
		WebDriverWait createpage = new WebDriverWait(driver, Duration.ofSeconds(10));
		createpage.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='label-on-border-box']//div[@class='options-list-icon']//div[3]//span[1]")));
		
		// Selecting Passengers
		WebElement passbutt = driver.findElement(By.xpath("//span[normalize-space()='Add Passenger']"));
		for(int i=0;i<4;i++) 
		{
			passbutt.click();
			driver.findElement(By.xpath("//input[@placeholder='Enter passenger name']")).click();
			List<WebElement> passlist= driver.findElements(By.xpath("//div[@id='showCustomer']//li"));
			System.out.println(passlist.size());
			for(int j=0; j<passlist.size();j++)
			{
				passlist.get(j).click();
				driver.findElement(By.xpath("//div[@id='showCustomer']//button[@type='submit'][normalize-space()='Save']")).click();
				break;
			}
			continue;
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='add-name text-right mb-1']//span[@class='icon-svg']")).click();
		driver.findElement(By.xpath("//div[@id='AddTripName']//input[@placeholder='Trip Name']")).click();
		driver.findElement(By.xpath("//div[@id='AddTripName']//input[@placeholder='Trip Name']")).sendKeys("Automated Trip");
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-dialog-scrollable|modal-dialog-centered modal-md']//div[@class='site-primary-btn']//button[@type='submit'][normalize-space()='Save']")).click();
		
		//Selecting Service Type
		Thread.sleep(3000);
		WebElement servicedrop = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		servicedrop.click();
		Thread.sleep(3000);
		Select servicetype= new Select(servicedrop);
		servicetype.selectByIndex(0);
		
		//Selecting Trip type
		
		Thread.sleep(2000);
		WebElement tripdrop= driver.findElement(By.xpath("//select[@placeholder='Select']"));
		tripdrop.click();
		Thread.sleep(3000);
		Select triptype= new Select(tripdrop);
		triptype.selectByIndex(0);
		
		// Selecting Vehicle Type
		
		Thread.sleep(2000);
		WebElement vehicledrop = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/div[1]/select[1]"));
		vehicledrop.click();
		Thread.sleep(3000);
		Select vehicletype= new Select(vehicledrop);
		vehicletype.selectByIndex(0);
		
		
		// Selecting Driver
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Add Driver']")).click();
		List<WebElement> driverlist= driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		System.out.println("Total Driver Count=" + driverlist.size());
		for(int dl=0; dl<driverlist.size();dl++)
		{
			String status = driverlist.get(dl).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr/td[8]")).getText();
			if(status.equalsIgnoreCase("Not Available"))
			{
				System.out.println("No Drivers Available");
			}
			else if(status.equalsIgnoreCase("Available"))
			{
				
				driverlist.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]")).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal fade show']//button[@aria-label='Close'][normalize-space()='Save']")).click();
		
		// Select Vehicle
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Add Vehicle']")).click();
		List<WebElement> vehiclelist= driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		for(int i=0;i<vehiclelist.size();i++)
		{
			String vehstat = vehiclelist.get(i).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr/td[8]")).getText();
			if(vehstat.equalsIgnoreCase("Assigned Trip"))
			{
				System.out.println("No vehicles are available");
			}
			else if(vehstat.equalsIgnoreCase("Available"))
			{
				vehiclelist.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]")).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='AddVehicleModal']//button[@aria-label='Close'][normalize-space()='Save']")).click(); 
		
		// Setting Trip Time
		
		WebElement timevalidation = driver.findElement(By.xpath("//*[@id=\"Add Place\"]/div/div[1]/div/div[2]/div[2]/div/p"));
		if(timevalidation.isDisplayed())
		{
			driver.findElement(By.xpath("//body//div//div[@role='tabpanel']//div//div//div//div//div//div[3]//div[1]//div[1]//div[1]//div[1]//button[2]")).click();
			
		}
		WebElement default_starthr= driver.findElement(By.xpath("//div[@class='col-5 pr-0 pl-mo']//output[@aria-label='Hours']"));
		String  strthr =  default_starthr.getAttribute("aria-valuetext");
		System.out.println(strthr);
		int sthr =  Integer.parseInt(strthr);
		WebElement default_endhr = driver.findElement(By.xpath("//div[@class='col-5 pr-0']//output[@aria-label='Hours']"));
		String endhr = default_endhr.getAttribute("aria-valuetext");
		int e_hr = Integer.parseInt(endhr);
		
		// Time period 
		
		WebElement start_tp= driver.findElement(By.xpath("//body//div[@class='w-100 overflow-main']//div[@class='col-5 pr-0 pl-mo']//div[@role='group']//div[@role='group']//div[1]"));
		String stp = start_tp.getText();
		
		if(sthr<=e_hr)
		{
			int hr_diff= Integer.valueOf(e_hr)- Integer.valueOf(sthr);
			System.out.println(hr_diff);
			for(int i=0; i<hr_diff-1;i++)
			{
				driver.findElement(By.xpath("//div[@class='col-5 pr-0']//div[@title='Hours']//button[@aria-label='Decrement']")).click();
			}
		}
		else if (sthr<=e_hr && stp.equalsIgnoreCase("AM"))
		{
			int hr_diff= Integer.valueOf(e_hr)- Integer.valueOf(sthr);
			for(int i=0; i<hr_diff-1;i++)
			{
				driver.findElement(By.xpath("//div[@class='col-5 pr-0']//div[@title='Hours']//button[@aria-label='Decrement']")).click();
			}
			driver.findElement(By.xpath("//body//div[@class='w-100 overflow-main']//div[@class='col-5 pr-0']//div[@role='group']//div[@role='group']//div[1]")).click();
		}
		
		
		// Adding Pickup
		
		driver.findElement(By.xpath("//span[normalize-space()='Add Pickup']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Passenger...']")).click();
		List<WebElement> paxlist= driver.findElements(By.xpath("//*[@id=\"addStopModal\"]/div/div/div[2]/div[2]/form/div/div[2]/div[1]/div[2]/div/ul/li"));
		paxlist.size();
		for(int j=0;j<5;j++)
		{
			paxlist.get(j).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Number']")).sendKeys("971545314079");
		driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).click();
		driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).sendKeys("Liwa Tower");
		List<WebElement> addr1 = driver.findElements(By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-12']//li"));
		addr1.size();
		for(int i=0; i<addr1.size();i++)
		{
			if(addr1.get(i).getText().contains("Liwa Tower - Abu Dhabi - United Arab Emirates"))
			{
				addr1.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		// Add Dropoff
		
		driver.findElement(By.xpath("//input[@id='stopGroupPassengers']")).click();
		List<WebElement> droppax= driver.findElements(By.xpath("//*[@id=\"addStopModal\"]/div/div/div[2]/div[2]/form/div/div[2]/div[1]/div[2]/div/ul/li"));
		droppax.size();
		for(int j=0;j<droppax.size();j++)
		{
			droppax.get(j).click();
		}
		driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).click();
		driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']//div[@class='multiselect__tags']")).sendKeys("Ibn Battuta");
		List<WebElement> dropaddr = driver.findElements(By.xpath("//*[@id=\"addStopModal\"]/div/div/div[2]/div[2]/form/div/div[4]/div/div/div[3]/ul/li"));
		dropaddr.size();
		for(int k=0; k<dropaddr.size();k++)
		{
			if(dropaddr.get(k).getText().contains("IBN Battuta Bus Station jebel ali - Dubai - United Arab Emirates"))
			{
				dropaddr.get(k).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-12 text-right site-primary-btn mt-3']//input[@value='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn btn-primary']")).click();
		
	// Edit trip 
		
		List<WebElement> triplist= driver.findElements(By.xpath("//tbody/tr"));
		triplist.size();
		for(int tl=0; tl<=triplist.size();tl++)
		{
			String tripstat = triplist.get(tl).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr/td[8]/div[1]")).getText();
			if(tripstat.equalsIgnoreCase("Upcoming"))
			{
				triplist.get(tl).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr/td[9]/div[1]/i[1]")).click();
				List<WebElement> actlist= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//div"));
				actlist.size();
				for(int al=0; al<actlist.size();al++)
				{
					if(actlist.get(al).getText().contains("Edit"))
					{
						actlist.get(al).click();
						break;
					}
					
				}
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='form-group']//input[@placeholder='0']")).sendKeys("7");
		driver.findElement(By.xpath("//button[@class='btn btn btn-primary']")).click();
		
		// Trip Profile
		
		List<WebElement> actlist= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//div"));
		actlist.size();
		for(int al=0; al<actlist.size();al++)
		{
			if(actlist.get(al).getText().contains("View Detail"))
			{
				actlist.get(al).click();
				break;
			}
			
		} 
	
		
	}

}
