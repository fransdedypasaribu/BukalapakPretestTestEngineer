package jsonproject;

import static org.testng.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PostDataJson {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\data1.json");
		FileReader reader2 = new FileReader(".\\jsonfiles\\data2.json");
		
		Object obj = jsonParser.parse(reader);
		Object obj2 = jsonParser.parse(reader2);
		
		JSONObject dataJsonobj = (JSONObject) obj;
		JSONArray dataArray = (JSONArray) dataJsonobj.get("data1");
		
		JSONObject dataJsonobj2 = (JSONObject) obj;
		JSONArray dataArray2 = (JSONArray) dataJsonobj2.get("data2");
			
		assertEquals((dataJsonobj.get("userId")).getClass().getName(),(dataJsonobj2.get("userId")).getClass().getName());
		assertEquals((dataJsonobj.get("id")).getClass().getName(),(dataJsonobj2.get("id")).getClass().getName());
		assertEquals((dataJsonobj.get("title")).getClass().getName(),(dataJsonobj2.get("title")).getClass().getName());
		assertEquals((dataJsonobj.get("body")).getClass().getName(),(dataJsonobj.get("body")).getClass().getName());

		JSONObject[] mergedObject = {dataJsonobj,dataJsonobj2};
		
	}
	
}
