package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args)
	
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  
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
		  
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		  
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
		
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revpawa@gmail.com");
		  
		  WebElement state = driver.findElement((By.id("createLeadForm_generalStateProvinceGeoId")));
		  
		  Select dd3= new Select(state);
		  dd3.selectByVisibleText("New York");
		  
		  driver.findElement(By.className("smallSubmit")).click();
		  
		  driver.findElement(By.linkText("Edit")).click();
		  
		  driver.findElement(By.id("updateLeadForm_description")).clear();
		  
		  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important");
		  
		  driver.findElement(By.xpath("//input[contains(@value,'Update')]")).click();
		  
		  String titleNew = driver.getTitle();
		  System.out.println(titleNew);
			  
	
	}

}
