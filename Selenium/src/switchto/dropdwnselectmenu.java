package switchto;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwnselectmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			
			WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
			Select obj=new Select(dropdown);

		//obj.selectByIndex(4);
		//obj.selectByValue("5");
		obj.selectByVisibleText("Purple");
		
		List<WebElement>options=obj.getOptions();
		Iterator<WebElement>test=options.iterator();
		while(test.hasNext()) {
			System.out.println(test.next().getText());
		}
		System.out.println(obj.getFirstSelectedOption().getText());
		
		//sample test case
		if(obj.getFirstSelectedOption().getText().equalsIgnoreCase("Red")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
	}

}
