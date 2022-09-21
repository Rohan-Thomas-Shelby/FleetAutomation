package TPC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageDriver extends Commonclass{
	
	@Test
  public void AddDriver() throws InterruptedException {
	  
	  
	  // Main Page 
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("3X2HG");
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("Rahim");
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("rahimkhan@yopmail.com");
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("Off Duty");
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("187742569");
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("545314079");
	  driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
	  List<WebElement> cal= driver.findElements(By.xpath("//div[@class='role-filter-main p-3 d-flex justify-content-between']//li"));
	  cal.size();
	  for(int c=0; c<cal.size();c++)
	  {
		  if(cal.get(c).getText().contains("Last 7 days"))
		  {
			  cal.get(c).click();
		  }
	  }
	  
	  
	  // Adding new Driver
	  
	  driver.findElement(By.xpath("//i[@class='innov-icon icon-nav-taxi-driver ']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@name='dob']")).click();
	  driver.findElement(By.xpath("//span[normalize-space()='Aug 2006']")).click();
	  WebElement prevyear= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div/form/div/div[4]/div/div/div[3]/header/span[1]"));
	  for(int p=0; p< 7; p++)
	  {
		  prevyear.click();
	  }
	  driver.findElement(By.xpath("//div[@class='col-xl-12 col-sm-12 text-left responsive-main-space']//span[@class='cell month'][normalize-space()='January']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='col-xl-12 col-sm-12 text-left responsive-main-space']//div[@class='vdp-datepicker custom-input']//div[@class='vdp-datepicker__calendar']//div//span[@class='cell day'][normalize-space()='12']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("Ahmed");
	  driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("Imran");
	  
	  //  Selecting Employee Type
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]")).click();
	  List<WebElement> employeelist = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[3]/ul[1]/li"));
	  int listsize= employeelist.size();
	  for(int i=0; i< listsize; i++)
	  {
		  if(employeelist.get(i).getText().contains("Full Time"))
		  {
			  Thread.sleep(3000);
			  employeelist.get(i).click();
			  break;
		  }
	  }
	  
	  // Selecting Employment Type
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]")).click();
	  List<WebElement> employlist1 = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[3]/ul[1]/li"));
	  int empsize= employlist1.size();
	  for(int i=0; i< empsize; i++)
	  {
		  if(employlist1.get(i).getText().contains("Drivers"))
		  {
			  Thread.sleep(3000);
			  employlist1.get(i).click();
			  break;
		  }
	  }
	  
	  driver.findElement(By.xpath("//input[@name='driverDoj']")).click();
	  driver.findElement(By.xpath("//div[@class='col-xl-4 col-sm-4 text-left responsive-main-space']//div[@class='vdp-datepicker custom-input']//div[@class='vdp-datepicker__calendar']//div//span[@class='cell day'][normalize-space()='1']")).click();
	  Thread.sleep(2000);
	  WebElement countrydrop = driver.findElement(By.xpath("//select[@name='Country']"));
	  Select country= new Select(countrydrop);
	  country.selectByVisibleText(" United Arab Emirates");
	  
	  // Add Driver Address
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='flex-column mr-2']//div[@class='multiselect drop-multiselect-auth-img']")).click();
	  driver.findElement(By.xpath("//div[@class='flex-column mr-2']//div[@class='multiselect drop-multiselect-auth-img multiselect--active']")).sendKeys("Liwa Tower");
	  WebDriverWait addrdrop= new WebDriverWait(driver, Duration.ofSeconds(5));
	  addrdrop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-xl-6 col-sm-6 text-left mt-3']//li")));
	  List<WebElement> address= driver.findElements(By.xpath("//div[@class='col-xl-6 col-sm-6 text-left mt-3']//li"));
	  address.size();
	  for(int a=0; a<address.size(); a++)
	  {
		  if(address.get(a).getText().contains("Liwa Tower - Abu Dhabi - United Arab Emirates"))
		  {
			  address.get(a).click();
		  }
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("ahmed.imran1@yopmail.com");
	  driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314079");
	  driver.findElement(By.xpath("//input[@name='work_phone0']")).sendKeys("024472059");
	  Thread.sleep(2000);
	  
	  // Adding Document Details
	  // Doc 1
	  driver.findElement(By.xpath("//div[@class='col-xl-3 col-sm-3 text-left']//div[@class='multiselect__tags']")).click();
	  List<WebElement> doclist= driver.findElements(By.xpath("//div[@class='fill-info profile-fill-info pl-0 pr-0']//li"));
	  doclist.size();
	  for(int d=0; d<doclist.size();d++)
	  {
		  if(doclist.get(d).getText().contains("Driving License"))
		  {
			  doclist.get(d).click();
			  break;
		  }
		  
	  }
	  driver.findElement(By.xpath("//input[@name='licenseNumber0']")).sendKeys("18974152");
	  driver.findElement(By.xpath("//input[@name='licenseExpiryDate0']")).click();
	  driver.findElement(By.xpath("//div[@class='col-xl-3 col-sm-3 text-left']//div[@class='d-flex flex-column mr-2']//div[@class='custom-input d-flex align-items-center date-picker-fleet-custom']//div[@class='vdp-datepicker custom-input']//div[@class='vdp-datepicker__calendar']//div//span[@class='cell day'][normalize-space()='30']")).click();
	  Thread.sleep(2000);

	  
	  // Nationality
	  Thread.sleep(2000);
	  WebElement countrydrop1 = driver.findElement(By.xpath("//select[@name='nationality']"));
	  countrydrop1.click();
	  Select country1= new Select(countrydrop1);
	  country1.selectByVisibleText(" United Arab Emirates");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
	  
	  
	  // Edit Driver 
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]")).click();
	  List<WebElement> actionlist= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist.size();
	  for(int i=0; i<actionlist.size();i++)
	  {
		  if(actionlist.get(i).getText().contains("Edit"))
		  {
			  actionlist.get(i).click();
		  }
	  }
	 driver.findElement(By.xpath("//input[@placeholder='Enter Unit No.']")).sendKeys("404");
	 driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314078");
	 driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
	 
	 // Profile
	
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]")).click();
	  List<WebElement> actionlist1= driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist1.size();
	  for(int i=0; i<actionlist1.size();i++)
	  {
		  if(actionlist1.get(i).getText().contains("View Details"))
		  {
			  actionlist1.get(i).click();
		  }
	  }
	  // Assign vehicle and assistant to driver
	  // Vehicle
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='mt-3']//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@id='__BVID__1253___BV_modal_outer_']//li[1]")).click();
	  driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	  
	  // Assistants
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//body/div[@class='w-100 overflow-main']/div[@class='container-fluid defualt-bg']/div[@class='row dark-theme']/div[@class='main-content-container complete-outer-section edit-outer-sections col-sm-11']/div[@class='row']/div[@class='inner-container']/div[@class='dark-theme w-100']/div[@class='admin-account-list w-100']/div[@class='form-container profile-new-role mt-3']/div[@class='row']/div[@class='col-sm-12 col-md-3 profile-info']/div[@class='action-card custom-action-card left-side-action-card']/div[@class='action-card-content']/div[@class='fill-info manage-site-primary']/form/div[@class='col-12']/div[@class='page-actions row justify-content-end']/div[@class='add-btn mb-2 float-right']/span[1]")).click();
	  driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//li[@class='multiselect__element']")).click();
	  driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	  

	  // Adding document from Document tab
	  driver.findElement(By.xpath("//span[normalize-space()='Documents']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='d-flex justify-content-end mb-1 pl-4 pr-4']//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Emirates ID");
	  Thread.sleep(2000);
	  WebElement expirydrop= driver.findElement(By.xpath("//select[@id='isExpiry']"));
	  Select exdrop= new Select(expirydrop);
	  exdrop.selectByVisibleText("Yes");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='vdp-datepicker custom-input']")).click();
	  WebElement nextbtn= driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/header[1]/span[3]"));
	  for(int e=0; e<2;e++)
	  {
		  nextbtn.click();
	  }
	  driver.findElement(By.xpath("//span[normalize-space()='30']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  
	  
	  
	  System.out.println("Manage Driver Automation Testing Completed");
	  
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
  }
}
