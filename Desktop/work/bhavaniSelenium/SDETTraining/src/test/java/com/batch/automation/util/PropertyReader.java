package com.batch.automation.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

private String filePath;
	
    public PropertyReader(String filePath) {
    	this.filePath = filePath;
    }
    
	public String read(String Key) throws IOException {
		FileReader reader = new FileReader(filePath);
		Properties p = new Properties();
		p.load(reader);
		return p.getProperty(Key);
	}
}

