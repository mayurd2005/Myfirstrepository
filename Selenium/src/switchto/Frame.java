package switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");
			
			driver.switchTo().frame("content");//to get in whole frame
			
		   WebElement header=driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		
		//switch to no-frame name
		driver.switchTo().defaultContent(); //get outof frame
		   WebElement frame=driver.findElement(By.xpath("//frame[@name='navbar']"));
		   driver.switchTo().frame(frame);

		   WebElement noframe=driver.findElement(By.xpath("//a[text()='No frames']"));
		
		System.out.println(noframe.getText());

		
		
	}

}
