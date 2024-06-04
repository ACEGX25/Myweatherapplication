package Mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class Myservlet3
 */
public class Myservlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
        String apiKey="42dba6761f517b2ec12f00697c787708";
		
		String city = request.getParameter("city");
		
		String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+apiKey;
		
		URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

            InputStream inputStream = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
         
            
            Scanner scanner = new Scanner(reader);
            StringBuilder responseContent = new StringBuilder();

            while (scanner.hasNext()) {
                responseContent.append(scanner.nextLine());
            }
            
            System.out.println(responseContent);
            scanner.close();
            
            //type casting 
            
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(responseContent.toString(), JsonObject.class);
	          
	        
	        long dateTimestamp= jsonObject.get("dt").getAsLong()*1000;
	        String date = new Date (dateTimestamp).toString();
	        
	        double temperatureKelvin = jsonObject.getAsJsonObject("main").get("temp").getAsDouble();
	        int temperatureCelsius = (int)(temperatureKelvin - 273.15);
	        
	        int humidity = jsonObject.getAsJsonObject("main").get("humidity").getAsInt();
	        
	        double windspeed = jsonObject.getAsJsonObject("wind").get("speed").getAsDouble();
	        
	        String weatherCondition = jsonObject.getAsJsonArray("weather").get(0).getAsJsonObject().get("main").getAsString();
	        
	        request.setAttribute("date", date);
	        request.setAttribute("city",city );
	        request.setAttribute("temperature",temperatureCelsius);
	        request.setAttribute("weatherCondition",weatherCondition);
	        request.setAttribute("humidity",humidity);
	        request.setAttribute("windspeed",windspeed);
	        request.setAttribute("",responseContent.toString());
	        
	        connection.disconnect();
	        
	        request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}
	

}
  