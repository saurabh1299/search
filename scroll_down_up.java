package spartan_january;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_down_up {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@href=/account/login?ret=/")).click();
		
		JavascriptExecutor e=(JavascriptExecutor) driver;		
		e.executeScript("scrollTo(0,600)");	//by using scroll method
		System.out.println("scroll the screen to the middle position");
		Thread.sleep(5000);
		
		e.executeScript("scrollBy(300,800)");	//by using scroll method
		System.out.println("scroll the screen from current to given position");		
		Thread.sleep(5000);
		
		e.executeScript("scrollTo(800,0)");  
		System.out.println("scroll the screen reverse");
		 
		//driver.findElement(By.xpath("//a[text()=\"Registry\"]")).click();
		//driver.close();
		}
}