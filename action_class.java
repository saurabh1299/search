package spartan_january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		Actions act=new Actions(driver);
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(account).perform();
		act.click(account).build().perform();
		//act.contextClick(r).build().perform();
	}
}