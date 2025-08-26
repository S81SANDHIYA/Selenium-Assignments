package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saranya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sar");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("Selenium course instructor");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarx@gmail.com");
		
		WebElement option = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
        Select dropdown = new Select(option);
        
        dropdown.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        
        String str = driver.getTitle();
        System.out.println(str);
        
        driver.close();
	}

}
