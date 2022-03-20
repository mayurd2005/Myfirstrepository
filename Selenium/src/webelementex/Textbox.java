package webelementex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/text-box");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			
		WebElement Fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        Fullname.sendKeys("mayur");
        Fullname.clear();
        Fullname.sendKeys("mayur dongare");
        
        
		WebElement Email=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		Email.sendKeys("mayurd2094@gmail.com");
		Email.clear();
		Email.sendKeys("mayurd704@gmail.com");
		
		WebElement CurrentAddress=driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
		CurrentAddress.sendKeys("arjun  nagar,amt");
		
		WebElement PermanentAddress=driver.findElement(By.id("permanentAddress"));
		PermanentAddress.sendKeys("trezury colony,arjun nagar,amt");
		
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		
	}

}
