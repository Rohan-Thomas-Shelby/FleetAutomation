package TPC;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageClient extends Commonclass{
	@Test
	public void client() throws InterruptedException {
		
		// Add Client
		
		driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/tngkjthx.json']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Emirates Transport Company");
		WebElement clienttype= driver.findElement(By.xpath("//select[@placeholder='Type']"));
		clienttype.click();
		WebDriverWait typelist= new WebDriverWait(driver, Duration.ofSeconds(5));
		typelist.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@placeholder='Type']//option")));
		Select type= new Select(clienttype);
		type.selectByVisibleText("Business Transportation");
		WebElement accounttype= driver.findElement(By.xpath("//select[@placeholder='Account Type']"));
		accounttype.click();
		Select acctype= new Select(accounttype);
		acctype.selectByVisibleText("Group");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khan");
		WebElement country=driver.findElement(By.xpath("//div[@role='tabpanel']//div//div//div//div//div//div//select[@type='text']"));
		country.click();
		Select countryname= new Select(country);
		countryname.selectByVisibleText("United Arab Emirates");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img']")).click();
		driver.findElement(By.xpath("//div[@class='multiselect drop-multiselect-auth-img multiselect--active']")).sendKeys("Liwa Tower");
		Thread.sleep(3000);
		List<WebElement> address= driver.findElements(By.xpath("//div[@class='form-container']//li"));
		address.size();
		for(int i=0; i<address.size();i++)
		{
			if(address.get(i).getText().contains("Liwa Tower - Abu Dhabi - United Arab Emirates"))
			{
				address.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("mohammad.khan@yopmail.com");
		driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314079");
		driver.findElement(By.xpath("//input[@name='work_phone0']")).sendKeys("545314079");
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		WebDriverWait clientmainpage = new WebDriverWait(driver, Duration.ofSeconds(5));
		clientmainpage.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner-container']")));
	
		
		/*// Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='action-btn']")).click();
		List<WebElement> actionbutt= driver.findElements(By.xpath("//tbody//li"));
		actionbutt.size();
		for(int i=0; i< actionbutt.size();i++)
		{
			if(actionbutt.get(i).getText().contains("Edit"))
			{
				actionbutt.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);*/
		
		// Profile
		
		driver.findElement(By.xpath("//div[@class='action-btn']")).click();
		List<WebElement> actionbutt1= driver.findElements(By.xpath("//tbody//li"));
		actionbutt1.size();
		for(int i=0; i< actionbutt1.size();i++)
		{
			if(actionbutt1.get(i).getText().contains("View Details"))
			{
				actionbutt1.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Fees & Payments']")).click();
		List<WebElement> feestab= driver.findElements(By.xpath("//div[@class='all-tabs arrow-fix-design']/div/ul/li"));
		feestab.size();
		for(int f=0; f< feestab.size();f++)
		{
			if(feestab.get(f).getText().contains("Fees Setup"))
			{
				feestab.get(f).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
		driver.findElement(By.xpath("//input[@id='main_checkbox_0']")).click();
		WebElement stdrop= driver.findElement(By.xpath("//div[@class='mb-4']//select[@class='form-control']"));
		stdrop.click();
		Select st= new Select(stdrop);
		st.selectByIndex(0);
		Thread.sleep(3000);
		WebElement ttdrops= driver.findElement(By.xpath("//select[@name='all']"));
		ttdrops.click();
		Select tt= new Select(ttdrops);
		tt.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='index_0_0']")).click();
		driver.findElement(By.xpath("//body/div/div[@role='dialog']/div/div/div/div/div/div/div/div/div[1]/div[2]/div[1]/input[1]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='d-flex']//span[@class='rounded-plus'][normalize-space()='+']")).click();
		driver.findElement(By.xpath("//input[@name='due']")).sendKeys("100");
		WebElement paytype = driver.findElement(By.xpath("//div[@class='col-md-8']//div[@class='row']//div[@class='col-md-6']//div//select[@class='form-control']"));
		paytype.click();
		Select payt= new Select(paytype);
		payt.selectByIndex(0);
		driver.findElement(By.xpath("//input[@placeholder='0 or more']")).sendKeys("1");
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		
		
		
	}

}
