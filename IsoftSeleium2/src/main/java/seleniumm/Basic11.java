package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic11 {

	public static void main(String[] args) throws Exception {
	//setting the propery of chrome browser and path of chrome driver
     System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		
     //Launching chrome browser instance
     WebDriver driver=new ChromeDriver();
     
     //Launch the app.
     driver.get("https://www.mycontactform.com/");
     
     //implicit timeout
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     
     //refresh
     driver.navigate().refresh();
     
     //maximise window
     driver.manage().window().maximize();
     
     //delete all cookies
     driver.manage().deleteAllCookies();
     
     //fetch the current url
     System.out.println(driver.getCurrentUrl());
     
     //fetch the title 
     String a=driver.getTitle();
     System.out.println(a);
     
     //fetch window ID
     String b=driver.getWindowHandle();
     System.out.println(b);
     
     System.out.println(b);//commeneted
     
     //find element and Linktext locator and click operational method
     driver.findElement(By.linkText("Features")).click();
     
     Thread.sleep(3000);
     driver.findElement(By.linkText("Sample Forms")).click();
     
     
     //find element by css selector===unique String value
     //driver.findElement(By.cssSelector("Marketing Department")).click();
     
     //find element by using Id locator and sendkeys
     driver.findElement(By.id("subject")).sendKeys("ajay");
     
     //find element by name
     driver.findElement(By.name("email")).sendKeys("abc1@gmail.com");
     
     //find element by xpath
     //driver.findElement(By.xpath("//tagname[@attr name='attr value']"));
     
     driver.close();
     
     driver.quit();
     
     
     
     
     
		
	}

}
