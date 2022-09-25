package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P2 {
	
	
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rentomojo.com/");
		driver.findElement(By.xpath("//span[@class='icon icon-dims icon-delhi']")).click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button"))));
		driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button")).click();
		
	}

}
