package spartan_january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sabzilana {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sabzilana.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"products/nagpur-orange-boxes.html\"]")));
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"products/organic-vegetables.html\"]")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		Thread.sleep(5000);
		driver.quit();
	}
}