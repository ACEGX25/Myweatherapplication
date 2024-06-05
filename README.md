# Personal Weather App

This project implements a personal weather application built with Java web technologies. It retrieves weather data for a user-specified location using the Open Weather Map API and displays it in a user-friendly interface.

## Technologies Used

### Backend
- Java (Java 11+)
- Java Servlets
- JavaServer Pages (JSP)
- Jakarta EE (javax.servlet package)
- Java I/O (for handling HTTP communication)
- GSON library (for parsing JSON data)

### Frontend
- HTML
- CSS

### Deployment
- Apache Tomcat Server

## Project Structure
weather-app/
├── src/main/java/
│ ├── com/example/weather/
│ │ ├── WeatherServlet.java
│ │ └── WeatherData.java
├── src/main/webapp/
│ ├── index.jsp
│ ├── index.html
│ └── css/
│ └── style.css
├── pom.xml
└── WEB-INF/
└── web.xml

## Features

- User enters a location name (city or zip code) in the web interface.
- `WeatherServlet` handles the user request, retrieves weather data from the Open Weather Map API using the user-provided location.
- GSON library parses the received JSON data into a Java object (`WeatherData`).
- Application logic in the servlet processes the weather data and prepares it for display.
- Weather information (temperature, humidity, description, etc.) is displayed on the `index.jsp` page using JSP expressions and tags.
- HTML and CSS provide a user-friendly interface for displaying the weather data.

## Getting Started

### Prerequisites

- Java Development Kit (JDK 11+)
- Apache Tomcat Server
- [Open Weather Map API Key](https://openweathermap.org/api)

### Configuration

1. Update the Open Weather Map API key in the `WeatherServlet.java` file.
2. Configure your preferred IDE (e.g., Eclipse, IntelliJ IDEA) to recognize the project structure.

### Deployment

1. Deploy the application to your local Tomcat server.
2. Start the Tomcat server.

### Access the Application

Open a web browser and navigate to `http://localhost:<port>/index.jsp` (replace `<port>` with your Tomcat server port).

## Further Enhancements

- Implement a search bar for location input.
- Display additional weather information (wind speed, pressure, sunrise/sunset).
- Integrate weather icons based on weather conditions.
- Implement multi-day weather forecast.

### SCREENSHOTS



![Screenshot 2024-06-05 084318](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/ccfd239f-eaeb-457e-a8ce-af60d9be0d08)
![Screenshot 2024-06-05 084338](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/6102ef80-d6d1-45be-a833-12dcc9a9c37a)
![Screenshot 2024-06-05 084349](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/d1de2b9f-7f23-4b6a-9383-4f8fa41bbac3)
![Screenshot 2024-06-05 084400](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/ff9e6dd8-a546-4a09-9498-c3bf41045cc7)
![Screenshot 2024-06-05 084418](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/7cf95d82-806b-4a56-a264-e0bf8f8c3d9a)
![Screenshot 2024-06-05 084432](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/28735c78-c5d9-46a5-b77a-e0d6dcfafdf5)
![Screenshot 2024-06-05 084450](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/37ccfef8-95bb-4c2e-83f2-e5179743b7e2)

