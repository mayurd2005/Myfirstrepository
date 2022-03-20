package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clicknhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/tool-tips");
		
			Actions ac=new Actions(driver);
		     ac.clickAndHold(driver.findElement(By.id("toolTipButton"))).perform();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("tooltip-inner")).getText());
		
		
	}

}
