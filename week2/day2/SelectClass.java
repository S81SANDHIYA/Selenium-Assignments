package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

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
	    driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[4]")).click();
	    driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("sandhiya");
	    driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
	    
	    WebElement option = driver.findElement(By.name("industryEnumId"));
	    
	    Select s1 = new Select(option);
	    s1.selectByVisibleText("Computer Software");
	    
	    WebElement option1 = driver.findElement(By.name("ownershipEnumId"));
	    
	    Select s2 = new Select(option1);
	    s2.selectByVisibleText("S-Corporation");
	    
	    WebElement option3 = driver.findElement(By.name("dataSourceId"));
	    
	    Select s3 = new Select(option3);
	    s3.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement option4 = driver.findElement(By.name("marketingCampaignId"));
	   
	    Select s4 = new Select(option4);
	    s4.selectByIndex(6);
	    
	    WebElement option5 = driver.findElement(By.name("generalStateProvinceGeoId"));
	    
	    Select s5 = new Select(option5);
	    s5.selectByValue("TX");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.findElement(By.partialLinkText("Create Account Ignoring Duplicates")).click();
	    
	    
	   	    
	    

	}

}
