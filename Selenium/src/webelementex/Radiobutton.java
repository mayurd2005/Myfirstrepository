package webelementex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/radio-button");
		
        WebElement YesRadioButton=driver.findElement(By.xpath("//label[@for='yesRadio']"));
        YesRadioButton.click();		
		
      //  WebElement Impressiveradiobutton=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
      //  Impressiveradiobutton.click();
		
		
	}

}
