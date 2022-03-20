package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu#");
		
		Actions obj=new Actions(driver);
		obj.clickAndHold(driver.findElement(By.xpath(	"//a[text()='Main Item 2']"))).perform();
		obj.clickAndHold(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).perform();

        obj.clickAndHold(driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"))).perform();;
		
		
		
		
		
		
	}

}
