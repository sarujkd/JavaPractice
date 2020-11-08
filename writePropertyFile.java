import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class writePropertyFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties(); 
		prop.setProperty("url","http://google.com/");
		prop.setProperty("browser1","Chrome");
		prop.setProperty("browser2","FireFox");
		prop.setProperty("username","sarutanush@gmail.com");
		prop.setProperty("password","cats1223a");
		
		prop.store((new FileWriter("util.properties")), "TestData");
	}

}
