package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
					
		 //dynamic table
		driver.get("https://www.moneycontrol.com/markets/global-indices/");

		WebElement a=driver.findElement(By.id("indicesTable"));
		   
		List<WebElement> b=a.findElements(By.tagName("th"));
		
		System.out.println(b.size());
		
		//print all head
		for(WebElement h:b)
		{
			System.out.println(h.getText());
		}
		
		//total rows
		List<WebElement> c=a.findElements(By.tagName("tr"));
		System.out.println(c.size());
		
		//print expexted single result
		String p="28,778.37";
		
		List<WebElement>j=driver.findElements(By.xpath("//*[@id='indicesTable']/tbody/tr/td"));
		
		for(int i=0;i<j.size();i++) {
			if(j.get(i).getText().equalsIgnoreCase(p))
			{
				System.out.println(j.get(i).getText());
			}
		}
		
		
		
		
		
		
		
		
	}

}
