package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTABLE1 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
				
	 //static table
	driver.get("https://letcode.in/table/");
	
	WebElement k=driver.findElement(By.id("simpletable"));
	
	//total size of head==th
      List<WebElement> tab  =k.findElements(By.tagName("th"));	
      System.out.println(tab.size());
       
    //print all head
      for(WebElement b:tab) {
    	  String m=b.getText();
    	  System.out.println(m);
      }
      
      //print TR[1] TD[1]
      
      WebElement j=driver.findElement(By.xpath("//*[@id=\"simpletable\"]/tbody/tr[1]/td[1]"));
      
          System.out.println(j.getText());
          
       //print tr[2] td[3]   
          WebElement h=driver.findElement(By.xpath("//*[@id=\"simpletable\"]/tbody/tr[2]/td[3]"));   
          System.out.println(h.getText());	

          //total rows
         List <WebElement> o=driver.findElements(By.xpath("//*[@id=\"simpletable\"]/tbody/tr"));
	     System.out.println(o.size());
	}

}
