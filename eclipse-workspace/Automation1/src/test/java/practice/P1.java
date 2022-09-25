package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.get("https://www.easemytrip.com/");
	        
	        driver.findElement(By.id("FromSector_show")).sendKeys("Delhi", Keys.ENTER);
	        driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai", Keys.ENTER);
	        driver.findElement(By.id("ddate")).click();
	        driver.findElement(By.id("trd_4_19/05/2022")).click();
	        driver.findElement(By.className("src_btn")).click();
	       
	        driver.findElement(By.xpath("//button[text()='Book Now']")).click();

}
}
