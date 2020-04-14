package spartan_january;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.google.common.io.Files;

public class screenshot 
{
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","E:\\SELENIUM FILES\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
//	Thread.sleep(10000);
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
	EventFiringWebDriver e=new EventFiringWebDriver(driver);
	File srcfile=e.getScreenshotAs(OutputType.FILE);
	File destfile=new File("C:\\Users\\SAURABH BIDKAR\\Pictures\\CurrentScreenshot.png");
	FileHandler.copy(srcfile, destfile);
	System.out.println("Screenshot taken successfully");	
}
}