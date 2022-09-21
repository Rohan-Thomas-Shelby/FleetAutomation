package TPC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Commonclass {
	
	public static WebDriver driver;	
	@Test
	public void BrowserLaunchandLogin() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan Nair\\Desktop\\Automation Softs\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://saas-dev.wiot360.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	  
		driver.findElement(By.xpath("//input[@id='input-31']")).sendKeys("hamid.usman@yopmail.com");
		driver.findElement(By.xpath("//input[@id='input-35']")).sendKeys("Tpcrules@123");
		driver.findElement(By.xpath("//button[@class='text-capitalize v-btn v-btn--block v-btn--has-bg theme--light elevation-0 v-size--default primary']")).click();
		WebDriverWait navpan= new WebDriverWait(driver, Duration.ofMinutes(1));
		navpan.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div[3]/div[1]/div[1]/div/ul/li")));
		Actions scroll = new Actions(driver);
		scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
  }
}
