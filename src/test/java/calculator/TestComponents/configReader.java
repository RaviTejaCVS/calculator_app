package calculator.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	static Properties prop;
	static FileInputStream fis;
	String propFilePath = "\\src\\main\\java\\bobchos\\bar\\resources\\GlobalData.properties";
	static String fullpath = System.getProperty("user.dir") + "\\src\\main\\java\\bobchos\\bar\\resources\\GlobalData.properties";
	
public static String getReportConfigPath() throws IOException {
		
		fis = new FileInputStream(fullpath);
		prop.load(fis);
		String reportConfigPath = System.getProperty("user.dir") + "//" + prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

public static void main(String a[]) throws IOException
{
	prop = new Properties();
	FileInputStream fis;
	String propFilePath = "\\src\\main\\java\\bobchos\\bar\\resources\\GlobalData.properties";
	String fullpath = System.getProperty("user.dir") + "\\src\\main\\java\\bobchos\\bar\\resources\\GlobalData.properties";
	fis = new FileInputStream(fullpath);
	prop.load(fis);
	String x=System.getProperty("user.dir") + "\\" + prop.getProperty("reportConfigPath");
	System.out.println(x);
}
}
