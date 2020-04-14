package spartan_january;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class make_my_trip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class=lbl_input latoBold appendBottom10")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}