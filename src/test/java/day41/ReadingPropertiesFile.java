package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		Properties propertiesObj=new Properties();
		
		propertiesObj.load(file);
		String url=propertiesObj.getProperty("appurl");
		String email=propertiesObj.getProperty("email");
		String pasword=propertiesObj.getProperty("password");
		String orderid=propertiesObj.getProperty("orderid");
		String custid=propertiesObj.getProperty("customerid");
		System.out.println(url+" "+email+" "+pasword+" "+orderid+" "+custid);
		
		//print all the keys 
		//approch1
		//Set<String>keys=propertiesObj.stringPropertyNames();
		//System.out.println(keys);
		
		
		//approch2
		Set<Object>keys=propertiesObj.keySet();
				System.out.println(keys);
		
		
		//println all the values
		//Collection<Object>keys=propertiesObj.values();
		//System.out.println(keys);
				
	 file.close();
	}

}
