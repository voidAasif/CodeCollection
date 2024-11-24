package practice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class j032_apiCall {
    public static void main(String[] args) {

        // Build the URL with the location and API key
        String apiUrl = "http://localhost:8080/api";
        
        try {
            // Create the request
            HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(apiUrl))
                .build();

            // Create the client
            HttpClient client = HttpClient.newBuilder().build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the status code and body of the response
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

            // Parse the JSON response
            // import org.json.JSONObject;
            // JSONObject jsonObj = new JSONObject(response.body());
            // JSONObject main = jsonObj.getJSONObject("main");
            // JSONObject wind = jsonObj.getJSONObject("wind");
            // String cityName = jsonObj.getString("name");
            // String weatherDescription = jsonObj.getJSONArray("weather").getJSONObject(0).getString("description");

            // // Extract specific values
            // double temperature = main.getDouble("temp");
            // double feelsLike = main.getDouble("feels_like");
            // int humidity = main.getInt("humidity");
            // double windSpeed = wind.getDouble("speed");

            // // Format and display
            // System.out.println("\nWeather Information for " + cityName + ":");
            // System.out.println("Description: " + weatherDescription);
            // System.out.println("Temperature: " + temperature + "°C");
            // System.out.println("Feels Like: " + feelsLike + "°C");
            // System.out.println("Humidity: " + humidity + "%");
            // System.out.println("Wind Speed: " + windSpeed + " m/s");