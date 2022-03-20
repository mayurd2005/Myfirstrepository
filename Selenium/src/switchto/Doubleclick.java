package switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/buttons");	
		
			Actions obj=new Actions(driver);
		obj.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
		
		obj.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();

		
		
	}

}
