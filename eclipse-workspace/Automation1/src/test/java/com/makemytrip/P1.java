package com.makemytrip;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

WebDriver driver;
String URL="https://www.makemytrip.com/";
Properties prop;
FileInputStream ip;

@BeforeTest
   public void init() throws IOException
{

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
prop=new Properties();

ip= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
  prop.load(ip);

}
@Test(priority=1)
public void launchURL() throws IOException
{


driver.manage().window().maximize();
driver.get(URL);
System.out.println("This is login");
boolean logo=driver.findElement(By.cssSelector(prop.getProperty("MakeMyTripLogo"))).isDisplayed();
Assert.assertEquals(true, logo);

System.out.println("Landed on MakeMyTrip page");
FileReader fr= new FileReader(System.getProperty("user.dir")+"/src/test/resources/config/spec.txt");
    BufferedReader br = new BufferedReader(fr);
    
    String str;
   
    while((str=br.readLine())!=null)
    {
     
   
   
    String stt=str.split(":", 3)[1];
    System.out.println(stt);
   
   
    }

    br.close();

}

/*public By getLocator(String stt)
{
switch(stt)
    {
     
case xpath:
    return By.xpath(locatorValue);
    break;
    case name:
    return By.name(locatorValue);
   
    case classname:
    return By.className(locatorValue);
    case css:
    return By.cssSelector(locatorValue);
    case linktext:
    return By.linkText(locatorValue);
    default:
    return By.id(locatorValue);
   
    }


}*/


@Test(priority=2)
public void Verify_FromCity_Airport()
{

String value=driver.findElement(By.cssSelector(prop.getProperty("Airport_FromName"))).getText();
  Assert.assertEquals(value, "DEL, Delhi Airport India");
  System.out.println("Verified From City Airport of Delhi");
}






@Test(priority=3)
public void Verify_ToCity_Airport()
{

String value=driver.findElement(By.cssSelector(prop.getProperty("Airport_ToName"))).getText();
  Assert.assertEquals(value, "BLR, Bengaluru International Airport India");
  System.out.println("Verified From City Airport of Banglore");
}

@Test(priority=4)
public void Verify_ToCity()
{

String value=driver.findElement(By.cssSelector(prop.getProperty("City_To"))).getAttribute("value");
  Assert.assertEquals(value, "Bengaluru");
  System.out.println("Verified From City is Banglore");
}

@Test(priority=5)
public void Verify_FromCity() throws InterruptedException
{

String value=driver.findElement(By.cssSelector(prop.getProperty("City_From"))).getAttribute("value");
  Assert.assertEquals(value, "Delhi");
  System.out.println("Verified From City is Delhi");
  Thread.sleep(3000);
  //driver.findElement(By.xpath("//img[@alt='Make My Trip']")).click();
  //driver.findElement(By.xpath("//div[contains(@class,'loginCardNew makeFlex')]")).click();
  //driver.findElement(By.cssSelector("#username")).sendKeys("vai10scriet@gmail.com");
  //driver.findElement(By.xpath("//button[@data-cy='continueBtn']/span")).click();
  driver.findElement(By.xpath("//li[@data-cy='account']")).click();
  WebElement resource= driver.findElement(By.cssSelector(prop.getProperty("City_From")));
  resource.click();
  //JavascriptExecutor jse=(JavascriptExecutor)driver;
  //jse.executeScript("arguments[0].click()", resource);

}

@Test(priority=6)
public void Verify_Dep_Date() throws Exception
{


String str=driver.findElement(By.xpath("//*[@data-cy=\"departureDate\"]")).getText();

String st=str.replaceAll("\\s","");


Date cal =new Date();
SimpleDateFormat sdf= new SimpleDateFormat("dMMMyy");
    Date dt1=sdf.parse(sdf.format(cal));
//System.out.println(sdf.format(cal));
Date dt=sdf.parse(st);
//System.out.println(sdf.format(dt));

if(dt.compareTo(dt1)>0)
{
System.out.println("Make trip date is greater than current date");
}

else if(dt.compareTo(dt1)<0)
{
System.out.println("Make trip date is less than current date");
}

}

@Test(priority=6)
public void Verify_FareType() throws InterruptedException

{

  String txt=driver.findElement(By.cssSelector("span[class*='selectFareText']")).getText();
  System.out.println(txt);
  //Thread.sleep(3000);
  //driver.findElement(By.xpath("//p[contains(text(),'Double Seat ')]/..")).click();

	/*
	 * //WebElement rdb = Actions builder = new Actions(driver);
	 * builder.moveToElement(rdb).build().perform();
	 * builder.moveToElement(rdb).click().perform()
	 */;
  
  
	/*
	 * WebElement td_Home =
	 * driver.findElement(By.xpath("//p[contains(text(),'Regular')]//parent::li"));
	 * String bgColor = td_Home.getCssValue("background");
	 * System.out.println(bgColor);
	 */


}

@Test
public void verify_airline()
{
	

}


@AfterClass
public void flush()
{

//driver.close();
}
}


