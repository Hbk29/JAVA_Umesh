
package seleniumm;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	
	//log4j is open source tool to keep the record of excution flow
	//we stored in file which have extension .log
	//it is used for tracking excution flow of program
	//download log4j jar, create .logf file, paste predefind data in .log file
	//after program completion ===project --refresh--log file generate which having excution flow
    //in console also get the excution flow
	
	public static void main(String[] args) {
    //create logger instance and pass class name
	Logger logger=Logger.getLogger("Log4j");
	
	//configure log4j properties file===pass the path of .log file
    PropertyConfigurator.configure("C:\\Users\\Umesh Patil\\git\\selenium\\IsoftSeleium2\\src\\main\\java\\seleniumm\\logg.log");

    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	 logger.info("setting property of chrome browser and path of chrome driver");
    
    WebDriver driver=new ChromeDriver();
	 logger.info("chrome browser ibstance open");
    
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    logger.info("implicit wait set");
    
    driver.get("http://www.facebook.com");
    logger.info("application launched");
	}

}
