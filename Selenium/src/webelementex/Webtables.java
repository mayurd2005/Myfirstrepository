package webelementex;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/webtables");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
		
		List<WebElement>columnname=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
		System.out.println(columnname.size());
		Iterator<WebElement>itr=columnname.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		
		List<WebElement>rowname=driver.findElements(By.xpath("//div[@role='gridcell']"));
		
		Iterator<WebElement>itr1=rowname.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next().getText());
		}

		
		
		
		
	}

}
