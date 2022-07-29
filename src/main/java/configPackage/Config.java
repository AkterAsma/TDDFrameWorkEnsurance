package configPackage;

import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

public class Config {
private static String fileLocation = "./ConfigFile/config.properties";
private static Config config;
private static String url;
private static String pageLoadTimeOut;
private static String implicitlywait;


private Config() {
	
}
public static Config getObject() {
	if (config ==null) {
		config = new Config();	
		readProperties();
	}
	return config;	
}

private static void readProperties() {
	try {
	FileReader reader = new FileReader(fileLocation);
	Properties properties = new Properties();
	properties.load(reader);
	url = properties.getProperty("url");
	pageLoadTimeOut = properties.getProperty("pageLoadTimeOut");
	implicitlywait = properties.getProperty("implicitlywait");

	
	}catch (Exception e) {
		e.printStackTrace();
	
	}
	
}
public String getUrl() {
	return url;
}

public String getPageLoadTimeOut() {
	return pageLoadTimeOut;
}

public String getImplicitlywait() {
	return implicitlywait;
}

}