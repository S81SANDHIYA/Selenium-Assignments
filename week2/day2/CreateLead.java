package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
        ChromeDriver driver = new ChromeDriver(options); 
		
		driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	    driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandhiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		WebElement selection = driver.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement selection2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		WebElement selection3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

		
		Select options1 = new Select(selection);
	    options1.selectByIndex(4);
	    
	    Select options2 = new Select(selection2);
	    options2.selectByVisibleText("Automobile");
	    
	    Select options3 = new Select(selection3);
	    options3.selectByValue("OWN_SCORP");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    String str1 = driver.getTitle();
	    System.out.println(str1);
	    	
	}

}
