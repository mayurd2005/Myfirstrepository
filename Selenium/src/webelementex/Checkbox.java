package webelementex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/checkbox");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
		
			//approach 1: chekbox not selected
		/*	WebElement HomeCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']/span"));
			HomeCheckbox.click();
			WebElement Result=driver.findElement(By.xpath("//div[@id='result']")); 
            System.out.println(Result.getText()); */
		
		    // approch 2: chkbox selected or not chk first
            
            WebElement HomeCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']"));
			if(!HomeCheckbox.isSelected()) {
				HomeCheckbox.click();
			}
			WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
			if(!Result.isDisplayed()) {
	            System.out.println(Result.getText());

			}
		

	}

}
