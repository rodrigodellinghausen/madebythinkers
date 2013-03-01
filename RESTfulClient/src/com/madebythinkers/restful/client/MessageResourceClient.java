package com.madebythinkers.restful.client;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MessageResourceClient {
	
	private final static String[] accepts = {"text/plain", "text/xml", "application/json"};

	public static void main(String[] args) throws Exception {
		
		final String url = "http://localhost:8080/ExampleRESTful/resources/message/75";
		
		for (String accept : accepts) {
	
			HttpURLConnection connection = 
					(HttpURLConnection) new URL(url).openConnection();
			
			connection.setRequestMethod("GET");
			
			connection.setRequestProperty("Accept", accept);
			
			System.out.println("--------------------------------");
			System.out.println("Content-Type: "+ accept);
			
			InputStream input = connection.getInputStream();
			Scanner scanner = new Scanner(input);
			
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
			
			if(connection != null) {
				connection.disconnect(); 
			}
		}
	}
}
