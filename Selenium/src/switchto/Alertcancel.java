package switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			WebElement clickbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
			clickbutton.click();
			
			Alert obj1=driver.switchTo().alert();
		Thread.sleep(5000);
			System.out.println(obj1.getText());
			
			obj1.dismiss();
		
		
		
	}

}
