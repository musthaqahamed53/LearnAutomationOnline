package jsonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonAdvExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("sampleJson.json");
		Object parsedObject = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parsedObject;
		//String id = (String) jsonObject.get("id");
		//String type = (String) jsonObject.get("type");
		
		//System.out.println(id);
		//System.out.println(type);
		
		JSONArray array = (JSONArray) jsonObject.get("Special qualities");
		Iterator iterator = array.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Special qualities "+iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
