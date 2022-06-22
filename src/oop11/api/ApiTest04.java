package oop11.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class ApiTest04 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream FIS = null;
		try {

			FIS = new FileInputStream("test.properties");

			prop.load(FIS);

			Iterator iter = prop.keySet().iterator();

			while (iter.hasNext()) {
				String key = (String) iter.next();
				System.out.println(key + ": " + prop.get(key));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(FIS!=null) {
				try {
					FIS.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
