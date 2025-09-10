package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
    driver.findElement(By.id("nav-search-submit-button")).click();
    List<WebElement> list  = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    
    List<Integer> li = new ArrayList<Integer>(); 
    
    for(WebElement web : list)
    {
    	String text = web.getText();
    	text = text.replace(",", "");
    	int num = Integer.parseInt(text);
      	li.add(num);
    }
    Collections.sort(li);
    
    System.out.println(li);
	}

}
