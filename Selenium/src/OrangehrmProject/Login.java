package OrangehrmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement usname=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		usname.sendKeys("mayur");
		usname.clear();
		usname.sendKeys("Admin");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        pass.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//input[@class='button']"));
        login.click();
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		WebElement myinfo=driver.findElement(By.className("current main-menu-first-level-list-item"));
		myinfo.click();
		
		WebElement edit=driver.findElement(By.id("btnSave"));
          edit.click();
		
	}

}
