package spartan_january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\SAURABH BIDKAR\\Desktop/listbox.html");
		
		WebElement Listbox=driver.findElement(By.id("food"));
		Select sel=new Select(Listbox);
		sel.selectByVisibleText("vada");
		Thread.sleep(10000);
		
		sel.selectByIndex(2);
		Thread.sleep(10000);
		
		sel.selectByValue("a");
		Thread.sleep(10000);
		
		//sel.deselectByVisibleText();
		
	}
}
