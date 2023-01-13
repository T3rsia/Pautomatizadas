package utilidades;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetUp {
	private static WebDriver driver;    
    private static ChromeOptions copciones;
    private static SetUp setup;
    
    private SetUp() {
    	copciones=new ChromeOptions();
    	try {
			driver=new RemoteWebDriver(new URL("http://localhost:4444"),copciones);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().window().maximize();
    }
     public static WebDriver getdriver() {
    	 return driver;    	 
     }
     
     public static void inicio() {
    	 setup=new SetUp();
    	 
     }
     public static void baja() {
    	 driver.close();
    	 driver.quit();
     }
}
     
