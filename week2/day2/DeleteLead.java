package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		WebElement web = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String str = web.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(str);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//div[contains(text(), 'No records to display')]"));
		String s = text.getText();
		Thread.sleep(1000);
		
		if(s.equals("No records to display"))
		{
			System.out.println("Deletion Successful");
		}
		else
		{
			System.out.println("Entry still exists");
		}
		driver.close();
	
	

	}
}
