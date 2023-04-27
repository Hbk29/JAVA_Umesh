package seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {
	//we need configure data, Test data, Locators data multiple times in through out the script,
	//so, we need to edit, replace, write that no. of times.
	//To simplyfy this we stored these data in file which have .properties extension
	//we use these data whenever we need which reduces our efforts through out the script
	//we store the data in key and value format.

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 //setting for using properties file
		 
		 //create File class object and pass the location of properrties file
		 
		 File src= new File("C:\\Users\\Umesh Patil\\git\\selenium\\IsoftSeleium2\\src\\main\\java\\seleniumm\\repostiory\\Object_repo.properties");
		 
		 //create FileInputStram class object and pass ref. of File class===load the file
		 FileInputStream fis=new FileInputStream (src);
		 
		 //create Properties class object
		 Properties pro= new Properties();
		 
		 pro.load(fis);
		 
		 //TIPS= USE PRO.GETPROPERTY(KEY/value)
		 //we put only key and value which stored in properties file in key=value format
		
		 driver.get(pro.getProperty("url"));
		 //driver.get("http:www.facebook.com/");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.id(pro.getProperty("email"))).sendKeys(pro.getProperty("Testdata1"));
		 //driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.id("pass")).sendKeys(pro.getProperty("Testdata2"));
		 
		 Thread.sleep(3000);
		 driver.findElement(By.name(pro.getProperty("loginbutton"))).click();

	}

}
