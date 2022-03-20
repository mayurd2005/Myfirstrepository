package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdrwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		
		System.out.println("before click");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		
		driver.findElement(By.id("enableAfter"));
		System.out.println("after click");

		
	}

}
