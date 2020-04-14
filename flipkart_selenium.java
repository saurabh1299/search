package spartan_january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");		
		
		driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[@href=/account/login?ret=/")).click();
		driver.close();
		
		driver.findElement(By.xpath("//a[text()=\"Registry\"]")).click();
		driver.close();
		}
}

