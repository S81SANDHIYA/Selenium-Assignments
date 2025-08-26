package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
      //Loading url
      driver.get("https://www.facebook.com/");
      //maximizing the window
      driver.manage().window().maximize();
      //Giving the username
      driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
      //Giving the password
      driver.findElement(By.name("pass")).sendKeys("Tuna@321");
      //click the button
      driver.findElement(By.name("login")).click();
      //click a link
      driver.findElement(By.linkText("Find your account and log in.")).click();
      String str = driver.getTitle();
      System.out.println(str);
	}

}
