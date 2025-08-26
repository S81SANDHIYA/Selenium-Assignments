package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
						
    ChromeDriver driver = new ChromeDriver(options);
    // loading URL
    driver.get("http://leaftaps.com/opentaps/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    driver.findElement(By.xpath("//div[@id='label']/a")).click();
    driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[4]")).click();
    driver.findElement(By.xpath("//a[text()='Create Account']")).click();
    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sandhiya");
    driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
    driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("20");
    driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    String str = driver.getTitle();
    System.out.println(str);
    driver.close();
	}

}
