package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic11 {

	public static void main(String[] args) {
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
     
     
		
	}

}
