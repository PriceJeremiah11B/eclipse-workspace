import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSON {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//create a JSON Object
		JSONObject obj = new JSONObject();
		obj.put("name", "Saad Yousuf");
		obj.put("location", "USA");
		
		
		//create a JSON Array
		JSONArray list = new JSONArray();
		list.add("Java");
		list.add("JSP");
		list.add("Servlets");
		
		obj.put("courses", list);
		
		
		
		try(FileWriter file = new FileWriter("myJSON.json"))
		{
			file.write(obj.toString());
			//converts object to a string
			file.flush();
		} 
		
		catch (IOException e)//this exception must happen
		{
			e.printStackTrace();
		}
		
		System.out.println(obj);
	
	}
}
