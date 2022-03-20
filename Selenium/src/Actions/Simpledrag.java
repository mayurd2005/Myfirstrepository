
package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Simpledrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		
		Actions act=new Actions(driver);
		WebElement axix=driver.findElement(By.id("draggableExample-tab-axisRestriction"));
		axix.click();
		
		WebElement sourcex=driver.findElement(By.id("restrictedX"));
		WebElement sourcey=driver.findElement(By.id("restrictedY"));
        int x=sourcex.getLocation().getX();
        int y=sourcey.getLocation().getY();
        act.dragAndDropBy(sourcex, 150, 0).perform();
        act.dragAndDropBy(sourcey, 0, 100).perform();
        
        act.moveToElement(sourcex).dragAndDropBy(sourcex, 50, 0).build().perform();
        
        
	}

}
