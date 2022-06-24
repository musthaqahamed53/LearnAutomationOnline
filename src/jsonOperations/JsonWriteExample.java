package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. create json object
		JSONObject jsonObject = new JSONObject();
		
		//2. add key value pairs using put()
		jsonObject.put("Name","Sheik");
		jsonObject.put("Age","22");
		
		//3. json array ku create object
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Magical smile");
		jsonArray.add("Magnetic eyes");
		
		//4. to add json array to json object use same put()
		jsonObject.put("Special qualities",jsonArray);
		
		//5.write this in file
		FileWriter fileWriter = new FileWriter("sheikJson.json");
		fileWriter.write(jsonObject.toJSONString()); //tojsonstring is included because file writer cant write json file using write method alone
		fileWriter.close();
		
		
		
		
		
	}

}
