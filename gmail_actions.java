package spartan_january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_actions 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]")).click();
		
		driver.findElement(By.xpath("//a[@href=/account/login?ret=/")).click();
}
}
