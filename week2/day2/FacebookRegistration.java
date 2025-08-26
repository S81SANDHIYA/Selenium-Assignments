package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sandhiya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sandhiya");
		
		WebElement option = driver.findElement(By.xpath("(//span[@class='_5k_4']//select[1])"));
		Select op = new Select(option);
		op.selectByValue("5");
		
		WebElement option2 = driver.findElement(By.xpath("(//span[@class='_5k_4']//select[2])"));
		Select op2 = new Select(option2);
		op2.selectByValue("2");
		
		WebElement option3 = driver.findElement(By.xpath("(//span[@class='_5k_4']//select[3])"));
		Select op3 = new Select(option3);
		op3.selectByValue("2003");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
	}

}
