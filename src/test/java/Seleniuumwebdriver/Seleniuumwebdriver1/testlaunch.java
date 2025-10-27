package Seleniuumwebdriver.Seleniuumwebdriver1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.graph.Network;
public class testlaunch {
	@Test
	public void  verifyLaunch() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	    driver.get("https://www.amazon.com");
	    driver.findElement(By.xpath("//span[@class = 'a-button-inner']")).click();
	    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class = 'a-button-inner']")));
 
	
	
	
   /* DevTools devTools = ((HasDevTools) driver).getDevTools();
    devTools.createSession();
    devTools.send(Network.clearBrowserCache()); // Clear cache
    devTools.send(Network.clearBrowserCookies()); // Clear cookies*/
	

	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("LG WASHING MACHINE 9KG");
//river.wait(4000);
	WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
	click.click();
	
	
	}
	
	
}
 