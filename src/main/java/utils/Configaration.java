package utils;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configaration {
	private static Configaration configaration;
	private static Properties properties;
	private static String defaultpath = "configFile/config.properties";

	public Configaration(String path) {
		if (path == null || path.length() < 11) {
			loadProperty(defaultpath);
		} else {
			loadProperty(path);
		}

	}

	private void loadProperty(String path) {
		properties = new Properties();
		try {
			InputStream iStream = new FileInputStream(path);
			properties.load(iStream);
			iStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getConfigaration(String key) {
		if (key!= null) {
			return properties.getProperty(key);
			}else {
				return null;
			}
	}
	
	public static void main(String[] args) {
		Configaration configaration = new Configaration(null);
		System.out.println(configaration.getConfigaration("url"));
		System.out.println(configaration.getConfigaration("url"));
		System.out.println(configaration.getConfigaration("-1"));
		System.out.println(configaration.getConfigaration("null"));
		
	}

}
