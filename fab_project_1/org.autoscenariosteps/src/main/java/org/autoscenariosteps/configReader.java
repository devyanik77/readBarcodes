package org.autoscenariosteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	public static Properties prop;
	private String baseDir;
	public Properties init_prop() {
		prop = new Properties();
		try {
			//FileInputStream ip = new FileInputStream("./src/test/resources/configs/testConfig.properties");
			baseDir = System.getProperty("user.dir");
			FileInputStream ip = new FileInputStream(baseDir + "/testConfig.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}