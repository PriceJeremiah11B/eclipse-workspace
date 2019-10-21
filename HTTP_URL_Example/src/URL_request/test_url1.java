package URL_request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class test_url1 {
	
	private static HttpURLConnection connection;
	public static void main(String[] args) {
		
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		
		
		
		//grabs the information from the address (connection)
		try {
			
			//create a variable that is the connection
			URL url = new URL("https://jsonplaceholder.typicode.com/users");
				connection = (HttpURLConnection) url.openConnection();
				
				//setting up the connection
				connection.setRequestMethod("GET");
				
				//setting up the timeout, for connecting
				connection.setConnectTimeout(5000); //milliseconds
				connection.setReadTimeout(5000); //= 5 seconds
				
				int status = connection.getResponseCode();
				System.out.println(status);
		
		
		if (status > 299) {
			reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
		}
		
		while ((line = reader.readLine()) != null) {
			
			responseContent.append(line);
		}
		
		reader.close();
		
		}
		
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
		
		
	}
	
}
