package spartan_january;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vikram_assignment
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("saurabh bidkar");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}
}