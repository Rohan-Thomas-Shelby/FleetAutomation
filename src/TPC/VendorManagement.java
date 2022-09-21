package TPC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VendorManagement extends Commonclass {
  @Test
  public void vendor() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("//lord-icon[@src='https://cdn.lordicon.com/eexszoni.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='ID']")).sendKeys("522");
	  driver.findElement(By.xpath("//input[@name='vendorDoj']")).click();
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/span[12]")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Vendor Type']")).sendKeys("Maintenance");
	  driver.findElement(By.xpath("//input[@placeholder='Enter the First Name']")).sendKeys("Yasim");
	  driver.findElement(By.xpath("//input[@placeholder='Enter the Last Name']")).sendKeys("Khan");
	  driver.findElement(By.xpath("//input[@name='basicInfoDob']")).click();
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/span[13]")).click();
	  WebElement country= driver.findElement(By.xpath("//select[@name='country']"));
	  Select countryname= new Select(country);
	  countryname.selectByVisibleText("United Arab Emirates");
	  driver.findElement(By.xpath("//div[@class='col-lg-6 text-left mt-3 mb-3']//div[@class='multiselect__tags']")).click();
	  driver.findElement(By.xpath("//div[@class='col-lg-6 text-left mt-3 mb-3']//div[@class='multiselect__tags']")).sendKeys("Liwa Tower");
	  List<WebElement> addrlist = driver.findElements(By.xpath("//div[@class='profile-info-inner']//li"));
	  addrlist.size();
	  for(int i=0;i<addrlist.size();i++)
	  {
		if(addrlist.get(i).getText().contains("Liwa Tower - Abu Dhabi - United Arab Emirates"))
		{
			addrlist.get(i).click();
			break;
		}

	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("yasimkhan@yopmail.com");
	  driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314079");
	  driver.findElement(By.xpath("//input[@name='workphone0']")).sendKeys("02244059");
	  driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  
	 // Edit 
	  
	  Thread.sleep(2000);
	  List<WebElement> vendorlist1 = driver.findElements(By.xpath("//tbody/tr"));
	  for(int j=0; j< vendorlist1.size();j++)
	  {
		 vendorlist1.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[7]/div[1]")).click();
		 break;
	  }
	  List<WebElement> actionlist1 = driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist1.size();
	  for(int k=0;k<actionlist1.size();k++)
	  {
		  if(actionlist1.get(k).getText().contains("Edit"))
		  {
			  actionlist1.get(k).click();
			  break;
		  }
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='phone0']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='phone0']")).sendKeys("545314079");
	  driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	  
	  
	  // Profile
	  
	  Thread.sleep(2000);
	  List<WebElement> vendorlist2 = driver.findElements(By.xpath("//tbody/tr"));
	  for(int j=0; j< vendorlist2.size();j++)
	  {
		 vendorlist2.get(0).findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[7]/div[1]")).click();
		 break;
	  }
	  List<WebElement> actionlist2 = driver.findElements(By.xpath("//div[@class='custom-wrapper-show show']//li"));
	  actionlist2.size();
	  for(int k=0;k<actionlist2.size();k++)
	  {
		  if(actionlist2.get(k).getText().contains("View Details"))
		  {
			  actionlist2.get(k).click();
			  break;
		  }
	  }
	  Thread.sleep(2000);
	  List<WebElement> vendortabs = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/ul/li"));
	  vendortabs.size();
	  for(int h=0;h<vendortabs.size();h++)
	  {
		  if(vendortabs.get(h).getText().contains("Payable"))
		  {
			  vendortabs.get(h).click();
			  break;
		  }
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='add-btn-css']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='ID']")).sendKeys("010");
	  driver.findElement(By.xpath("//input[@name='invoice_number']")).sendKeys("7456");
	  driver.findElement(By.xpath("//input[@name='invoice_date']")).click();
	  driver.findElement(By.xpath("//span[@class='cell day'][normalize-space()='1']")).click();
	  driver.findElement(By.xpath("//input[@name='invoice_due_date']")).click();
	  driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/span[39]")).click();
	  driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Tyres");
	  driver.findElement(By.xpath("//input[@name='quantity0']")).sendKeys("10");
	  driver.findElement(By.xpath("//input[@name='unit_price0']")).sendKeys("845");
	  driver.findElement(By.xpath("//input[@name='tax_percentage']")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='tax_percentage']")).sendKeys("5");
	  WebElement vendorpaytype = driver.findElement(By.xpath("//select[@name='payableType']"));
	  Select vendorpay = new Select(vendorpaytype);
	  vendorpay.selectByVisibleText("Partial");
	  driver.findElement(By.xpath("//input[@name='payment_paid']")).clear();
	  driver.findElement(By.xpath("//input[@name='payment_paid']")).sendKeys("1000");
	  WebElement paymode = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[4]/div[1]/div[1]/select[1]"));
	  Select pay = new Select(paymode);
	  pay.selectByVisibleText("Cash");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	  
  }
}
