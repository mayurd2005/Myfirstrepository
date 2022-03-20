package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		
		Actions act=new Actions(driver);
		WebElement recur=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']/span"));
		act.clickAndHold(recur).moveByOffset(200, 100).release().build().perform();
		
		
		
		
		
		
	}

}
