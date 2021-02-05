package jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUsingJSON {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	@Test
	void post() {
		
	}
	
	@DataProvider(name="dp")
	public String[] readJson() throws IOException, ParseException{
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\data.json");
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject dataJsonobj = (JSONObject) obj;
		JSONArray dataArray = (JSONArray) dataJsonobj.get("data");
		
		String arr[] = new String[dataArray.size()];
		
		for(int i = 0; i < dataArray.size(); i++) {
			JSONObject data = (JSONObject) dataArray.get(i);
			int userId = (Integer) data.get("userId");
			int id =(Integer) data.get("id");
			String title = (String) data.get("title");
			String body = (String) data.get("body");
			
			arr[i] = userId+","+id+","+title+","+body;
		}
		return arr;
	}
	
	
}
