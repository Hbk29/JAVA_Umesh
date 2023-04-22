package seleniumm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mycontactform.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
    driver.findElement(By.linkText("Sample Forms")).click();
    
    driver.findElement(By.id("q7")).click();
    
    driver.findElement(By.linkText("29")).click();
    
    WebElement g=driver.findElement(By.id("q7"));
    
    List<WebElement> k=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']/option"));
      
          k.get(10).click();
          
          WebElement a=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));      
          
          Select ss=new Select(a);
          
          ss.selectByValue("2005");
          
    
    
	}

}
