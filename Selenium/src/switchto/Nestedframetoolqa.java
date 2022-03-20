package switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframetoolqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/nestedframes");
			
			
			WebElement childframe=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
			driver.switchTo().frame(childframe);
			driver.switchTo().defaultContent();
			
			   WebElement nesframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(nesframe);//to get in whole frame
            //System.out.println(nesframe.getText());
			
			   //to get in whole frame*/

			

				System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
				ChromeDriver Driver=new ChromeDriver();
				//Driver = new ChromeDriver();
				Driver.get("https://demoqa.com/nestedframes");
				System.out.println(Driver.getTitle());
			//	Driver.manage().window().maximize();
				
				WebElement Parent= Driver.findElement(By.xpath("//iframe[@id='frame1']"));
				Driver.switchTo().frame(Parent);	
				
				WebElement Parentframe= Driver.findElement(By.xpath("//body[text()='Parent frame']"));
				System.out.println("Parentframe : "+ Parentframe.getText()+"\n");
				
				WebElement child= Driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
				Driver.switchTo().frame(child);
				
				WebElement childframe= Driver.findElement(By.xpath("//p[text()='Child Iframe']"));
				System.out.println("childframe : "+ childframe.getText()+"\n");
				
				//this use for get back access from childFrame to currant window
				Driver.switchTo().defaultContent();
				
				WebElement currandwindow= Driver.findElement(By.xpath("//div[text()='Nested Frames']"));
				System.out.println("currandwindow headline " +currandwindow.getText());
			}
			
		
		
		
	}


