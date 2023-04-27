package seleniumm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.mycontactform.com/");
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
	 //launch the app
	  driver.get("https://www.mycontactform.com/");
	  
	  driver.findElement(By.linkText("Sample Forms")).click();
	 
	  //1st method
	  
	  driver.findElement(By.xpath("//input[@value='Fourth Option']")).click();
	  
	  Thread.sleep(3000);
	  //2nd method===creating list
	 List<WebElement> ref=driver.findElements(By.xpath("//input[@id='q4']"));
	 
	 ref.get(3).click();
	 
	 //size of elements
	 System.out.println(ref.size());
      
      //ISSELECTED,DISPLAYED,ENABLED Methods
      System.out.println(ref.get(0).isDisplayed());
      
      System.out.println(ref.get(1).isEnabled());
      
      System.out.println(ref.get(2).isSelected());
		
 //we handle the radio buttons by using click(); 
 //only one radio button can select at a time     
	
	
	
	
	
	}

}
