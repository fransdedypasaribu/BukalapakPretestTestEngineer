package jsonproject;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetDataFromJson {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\data1.json");
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject dataJsonobj = (JSONObject) obj;
		JSONArray dataArray = (JSONArray) dataJsonobj.get("data1");
		
		String arr[] = new String[dataArray.size()];
		
		for(int i = 0; i < dataArray.size(); i++) {
			JSONObject data = (JSONObject) dataArray.get(i);
			
			assertEquals("java.lang.Integer",(data.get("userId")).getClass().getName());
			assertEquals("java.lang.Integer",(data.get("id")).getClass().getName());
			assertEquals("java.lang.String",(data.get("title")).getClass().getName());
			assertEquals("java.lang.String",(data.get("body")).getClass().getName());

			
			//arr[i] = userId+","+id+","+title+","+body;
			System.out.println("userid:"+data.get("userId"));
			System.out.println("id : "+data.get("id"));
			System.out.println("title : "+data.get("title"));
			System.out.println("body : "+data.get("body"));
			
		}

	}
	
}
	

