package greencoffeemaker.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyResource {

	private Properties properties = new Properties();


	public MyResource() {

		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(getResourcePath()));
			properties.load(inputStream);
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	public String getProperty(String name){
		return properties.getProperty(name);
	}

	protected String getResourcePath(){
		return "src/main/resources/myresource.properties";
	}

}
