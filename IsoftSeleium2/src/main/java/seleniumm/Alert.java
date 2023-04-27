package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
//alert is an interface and it has 2 methods accept() and dismiss()
	//accept()==we accepting alert by clicking ok button
	//dismiss()==we dismiss alert by clicking cancel button
	
	//we can not perform any operation untill handle alert if alert window showing in main main page
	
	//alert is seperate attachment on webpage
	//first we need to switch into alert from main page
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launching app
		driver.get("https://letcode.in/alert/");
		
		//now control in a main page
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(3000);
	    
		//switch into alert(control will go inside alert)
		driver.switchTo().alert().accept();
		System.out.println("we accept the alert by clicking ok button");  //verifying operaion
		
		driver.findElement(By.id("confirm")).click();
		//switch into alert
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("we dismiss the alert by clicking cancel method");  //verifying operaion

		driver.findElement(By.id("confirm")).click();
		//alert text verifying
		String k=driver.switchTo().alert().getText();
		System.out.println(k);
	}

}
