package jsonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser = new JSONParser(); //create object for json parser
		
		FileReader fileReader = new FileReader("sheikJson.json"); //read the file
		
		Object parsedObject = jsonParser.parse(fileReader); //parse the read file using parse() and store it in object
		
		//to get the values from the parsed object use get(). 
		//but to do that we have to convert the object to json object
		JSONObject jsonObject = (JSONObject) parsedObject;  // we castedbecause object is bigger data type than json object because we cannot store json object on object;
		
		String name = (String) jsonObject.get("Name");
		
		String age = (String) jsonObject.get("Age");
		
		JSONArray array = (JSONArray) jsonObject.get("Special qualities");
		
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		Iterator iterator = array.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Special qualities "+iterator.next());
		}
		
		
	}

}
