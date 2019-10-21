import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;



//this will be a simplified example of the first code, JSON Example
public class write_json {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject a = new JSONObject();
		
		//simple JSON object of fruit
		a.put("Fruit", "Banana");
		a.put("Color", "Yellow");
		a.put("Communistic Nature", "None");
		
		
		//writing it to a file
		PrintWriter c = new PrintWriter("json_example.json");
		c.write(a.toJSONString());
		
		c.flush();
		c.close();
	}

}
