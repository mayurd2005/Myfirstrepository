package switchto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			
			String newwindow=driver.getWindowHandle();  //tells about a new tab open only coz retrntype is string only one
			System.out.println("this is my frst window and id is"+newwindow);
			//Set<String>handlers=driver.getWindowHandles();
			//System.out.println(handlers.size());

			
			
			//new tab
			WebElement tabbutton=driver.findElement(By.id("tabButton"));
			tabbutton.click();
		    
			Set<String>handles=driver.getWindowHandles();  // tells about all tabs coz returntype is set
			System.out.println(handles.size());
			
		


			Iterator<String>itr=handles.iterator();
		    while(itr.hasNext()) {
		    	String str=itr.next().toString();
		    	if(str.equalsIgnoreCase(newwindow)) {
		    		System.out.println("we both represent same window");
		    	}
		    	else {
		    		System.out.println("we both represent differnt window");
		    	}
		    	//driver.switchTo().window(newwindow);
				WebElement heading=driver.findElement(By.tagName("h1"));
                 System.out.println(heading.getText());
		    	
		    	}
		    }
		
		
		
	}


