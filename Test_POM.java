package spartan_january;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_POM {
ChromeDriver driver;

@BeforeTest
public void prerequisite()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\matashree.m\\Desktop\\rest\\selenium jars\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://online.actitime.com/infosys4/login.do");
//driver.manage().timeouts().implicitlyWait(20)
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("s.17gunjal@gmail.com");
driver.findElement(By.name("pwd")).sendKeys("Shital17");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
String title = driver.getTitle();
System.out.println(title);
Assert.assertEquals(title, "actiTIME - Login");
}

@Test(priority=-1)
public void display()
{

System.out.println("enter meetings");
driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("meetings");

}
@Test(priority=0)
public void print() throws InterruptedException
{
Thread.sleep(4000);
System.out.println("click on meetings");
driver.findElement(By.xpath("//span[text()='Meetings']")).click();
}

@AfterTest
public void logout() throws InterruptedException
{
Thread.sleep(4000);
driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
@AfterClass
public void close_browser()
{
driver.close();
}
}