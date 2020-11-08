
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class readproperty{	

	      public  WebDriver driver;
	      
	   public void base() throws IOException {
	   
	   Properties prop=new Properties();
	  FileInputStream fp=new FileInputStream("selenium\\testdata.properties");
	  prop.load(fp);
	   //check for the browser
	   String browser=prop.getProperty("browser");
	   if (browser.equalsIgnoreCase("Chrome")) {
		   WebDriverManager.chromedriver().setup();
	   
		   driver=new ChromeDriver();
	   }
	   else
		   if (browser.equalsIgnoreCase("FireFox")) {
			   WebDriverManager.firefoxdriver().setup();
			   driver=new FirefoxDriver();
		   }
	   driver.get(prop.getProperty("url"));
	  // fp.close();		
	   
		}

	
}
