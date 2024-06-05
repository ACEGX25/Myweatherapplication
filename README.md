# Personal Weather Application

## Overview
Welcome to my Personal Weather Application! This Java web application provides real-time weather updates by integrating various technologies such as JSP, Servlets, the OpenWeather API, Apache Tomcat server, Java I/O, Jakarta EE, JSON, and Gson. Additionally, it features a user-friendly interface designed with HTML and CSS.

## Features
- **Real-time Weather Data:** Fetches current weather information from the OpenWeather API.
- **User Interface:** Interactive and responsive UI created with HTML and CSS.
- **Dynamic Content:** Utilizes JSP for generating dynamic web content.
- **Servlets:** Manages server-side processing and communication between the client and the server.
- **JSON Parsing:** Uses Gson for parsing JSON data from the OpenWeather API.
- **Java I/O:** Handles input and output operations.
- **Deployment:** Runs on an Apache Tomcat server.

## Technologies Used
- **Java:** Core programming language.
- **JSP (JavaServer Pages):** For generating dynamic web pages.
- **Servlets:** For handling HTTP requests and responses.
- **OpenWeather API:** For fetching weather data.
- **Apache Tomcat:** Server for deploying the web application.
- **Java I/O:** For input and output operations.
- **Jakarta EE:** Framework for building enterprise-level applications.
- **JSON & Gson:** For handling JSON data.
- **HTML & CSS:** For front-end design and styling.

## Setup Instructions
### Prerequisites
- Java Development Kit (JDK)
- Apache Tomcat server
- IDE (such as IntelliJ IDEA or Eclipse)
- Internet connection for accessing the OpenWeather API

### Steps
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/ACEGX25/Myweatherapplication.git
   cd Myweatherapplication
   ```

2. **Configure the OpenWeather API:**
   - Sign up at [OpenWeather](https://openweathermap.org/) to get your API key.
   - Open the `MyServlet.java` file.
   - Replace `YOUR_API_KEY` with your actual OpenWeather API key.

3. **Deploy to Apache Tomcat:**
   - Ensure Apache Tomcat is installed and running.
   - Copy the project folder to the Tomcat `webapps` directory.
   - Start the Tomcat server and navigate to `http://localhost:8080/WeatherApp` in your web browser.

## Project Structure
```
WeatherApp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── myPackage/
│   │   │           ├── MyServlet.java
│   │   ├── webapp/
│   │   │   ├── images/
│   │   │   │   └── weather-logo.png
│   │   │   ├── WEB-INF/
│   │   │   │   └── web.xml
│   │   │   ├── index.jsp
│   │   │   └── css/
│   │   │       └── style.css
├── README.md
└── ...

```

## Usage
1. Open your web browser and navigate to `http://localhost:8080/WeatherApp/`.
2. Enter the city name to get the current weather information.
3. View the weather details displayed dynamically on the webpage.

## Screenshots
Here are some screenshots of the application in action:

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
![Screenshot 2024-06-05 084450](https://github.com/ACEGX25/Myweatherapplication/assets/143728245/37ccfef8-95bb-4c2e-83f2-e5179743b7e2)

## Contributing
Contributions are welcome! If you have any ideas or improvements, feel free to submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact
For any inquiries or feedback, please reach out to me.

---

Thank you for checking out my Weather Application! Feel free to explore the code, provide feedback, and contribute to the project. Happy coding!


