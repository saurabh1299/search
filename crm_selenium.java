package spartan_january;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crm_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bidu bhau");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		//driver.findElement(By.xpath("//a[@href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"']")).click();

		String title=driver.getTitle();
		System.out.println("title is"  +title);
		String url=driver.getCurrentUrl();
		System.out.println("current url is" +url);
		
		Thread.sleep(3000);
		driver.quit();
	
//		driver.findElement(By.id("email")).sendKeys("bidkar08@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("bhokadi baba");
//		driver.findElement(By.id("u_0_b")).click();
}
}