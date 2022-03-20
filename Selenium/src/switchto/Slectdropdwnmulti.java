package switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Slectdropdwnmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			/*Select obj=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		     obj.selectByIndex(0);
		     obj.selectByIndex(1);
             System.out.println(obj.isMultiple());
		obj.getAllSelectedOptions();*/
		
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'-indicatorContainer')]")).click();
		
		driver.findElement(By.id("react-select-2-option-0-0")).click();
		
	}

}
