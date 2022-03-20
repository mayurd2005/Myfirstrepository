package switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabsletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/tabs");
			
			driver.findElement(By.id("demo-tab-origin")).click();
			System.out.println(driver.findElement(By.id("demo-tabpane-what")).getText());
			
			
			
	}

}
