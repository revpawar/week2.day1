 package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args)
	
	{
		//to download webdriver automatically
	WebDriverManager.chromedriver().setup();
	
	//launch browser
	ChromeDriver   driver=new ChromeDriver();
	
	//open the url
	  driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximize window
	  driver.manage().window().maximize();
	
	  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	  driver.findElement(By.className("decorativeSubmit")).click();
	
	  driver.findElement(By.linkText("CRM/SFA")).click();
	
	  driver.findElement(By.linkText("Leads")).click();
	
	  driver.findElement(By.linkText("Create Lead")).click();

	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Technologies");
	
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ABCDEF");
	
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GHIJKLM");
	  

	  WebElement dropDown=driver.findElement(By.id("createLeadForm_dataSourceId"));
	  
	  Select dd=new Select(dropDown);
	  
	  dd.selectByIndex(2);
//	  
	 WebElement dropDown1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	  
	  Select dd1=new Select(dropDown1);
	  
	  dd1.selectByIndex(2);
	  
	WebElement dropDown2=driver.findElement(By.id("createLeadForm_industryEnumId"));
	  
	  Select dd2=new Select(dropDown2);
	  
//	  dd1.selectByValue("IND_AEROSPACE");  not working 
	  
	   dd2.selectByIndex(2);
	  
	  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	  
	  driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Class");
	  
	  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revpawa@gmail.com");
	  
	  WebElement state = driver.findElement((By.id("createLeadForm_generalStateProvinceGeoId")));
	  
	  Select dd3= new Select(state);
	  dd3.selectByVisibleText("New York");
	  
	 String title = driver.getTitle();
	 System.out.println(title);
	  
	 driver.findElement(By.className("smallSubmit")).click();

  

  
  
  
  
  
  


	
	
	
	
	
	
	}
	
}
