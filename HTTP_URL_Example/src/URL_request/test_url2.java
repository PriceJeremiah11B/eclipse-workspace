package URL_request;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

//manages this
public class test_url2 {

	public static void main(String[] args) {
		
		//create a client
		HttpClient client = HttpClient.newHttpClient();
		//send the request, using the client, asynchronously.
		HttpRequest req = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
		client.sendAsync(req, HttpResponse.BodyHandlers.ofString()) //tells the server to send the data in a string.
			.thenApply(HttpResponse::body)//grab the data from that body from the server
			.thenApply(test_url2::parse)//use that body to print the result
			.join();//return the result to the current state
	}
	
	public static String parse(String responseBody) {
		//create an array to grab the data from each JSON index, from the JSON file.
		JSONArray albums = new JSONArray(responseBody);
		for(int i = 0; i < albums.length(); i++) {
			JSONObject stuff1 = albums.getJSONObject(i);
			int id = stuff1.getInt("id");
			int userID = stuff1.getInt("userID");
			String title = stuff1.getString("title");
			System.out.println(id + " " + title + " " +  userID);
			
			
		}
		return null;
		
	}
}
