package chrome;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
	//	FirefoxDriver gk=new FirefoxDriver();
	//	gk.get("https://www.myntra.com/");
		
		
	/*System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
	InternetExplorerDriver md=new InternetExplorerDriver();
		md.get("https://www.myntra.com/");
		md.manage().window().maximize();
		
		/*WebElement FullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		   //To enter the value in element we use sendkeys method from webelement interface
		   FullName.sendKeys("Testing");
		    //To enter the value in email
		   //Find the element --FindElement
		   WebElement Email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		   Email.sendKeys("test@test.com");*/
		
	}

}
