# Weather Forecast App

## Overview

The **Weather Forecast App** is a web-based application designed to provide real-time weather updates. Developed using **Spring Boot** for the backend and **REST APIs** for fetching weather data, it allows users to get the current weather conditions for any city. The app features a responsive and user-friendly frontend, ensuring a seamless experience across devices.

---

## Features

- **Weather Search**: Users can search for weather information by entering the name of a city.
- **Current Weather**: Displays the current weather conditions, including temperature, humidity, wind speed, and overall weather description.
- **Weather Forecast**: Displays a weather forecast for the upcoming days (if applicable).
- **Responsive Design**: The app is fully responsive, designed to work seamlessly on both desktop and mobile devices.
- **External API Integration**: The application fetches real-time weather data from external services like OpenWeatherMap or WeatherStack.

---

## Tech Stack

### Backend
- **Spring Boot**: A Java framework for building backend services.
- **REST APIs**: Used to create a communication interface between the frontend and the backend.
- **MySQL** (Optional): For storing user search history or any data that needs persistence.

### Frontend
- **HTML**: Structure of the web pages.
- **CSS**: Styling the web pages and ensuring responsive design.
- **JavaScript**: Handling dynamic updates to the UI, like showing weather data.

### External APIs
- **OpenWeatherMap API** or **WeatherStack API**: Provides real-time weather data for cities worldwide.

---

## Setup

### Prerequisites

- **Java 11+**
- **Spring Boot 2.x**
- **Maven** (for project management and building)
- **MySQL** (optional, if you want to persist data)

### Backend Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/weather-forecast-app.git
    cd weather-forecast-app
    ```

2. Configure the application by setting up the `application.properties` file in `src/main/resources`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/weather_db
    spring.datasource.username=root
    spring.datasource.password=your_password
    ```

3. Set the Weather API key in the `application.properties` file:
    ```properties
    weather.api.key=your_weather_api_key
    ```

4. Build and run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup

1. Open the `index.html` file located in the `src/main/resources/static` directory.

2. Customize the frontend to display weather data (temperature, humidity, etc.) using HTML, CSS, and JavaScript.

---

## How It Works

1. **User Input**: The user enters a city name in the search box.
2. **Backend Request**: The backend sends an HTTP request to an external weather API (e.g., OpenWeatherMap or WeatherStack) with the city name.
3. **API Response**: The API returns weather data (in JSON format).
4. **Data Processing**: The backend processes the data and sends it to the frontend.
5. **Display Data**: The frontend displays the processed data in a user-friendly format.

---

## Screenshots

**![Image](https://github.com/user-attachments/assets/5f32b1e4-b724-437d-a86c-d529abc7af88)**
**![Image](https://github.com/user-attachments/assets/753d3eaf-0382-47bc-922f-e252953074d8)**

---

## Contributing

Contributions are always welcome! Here's how you can contribute to this project:

1. Fork the repository.
2. Create a new branch:  
    ```bash
    git checkout -b new-feature
    ```
3. Commit your changes:
    ```bash
    git commit -m 'Add new feature'
    ```
4. Push to your branch:
    ```bash
    git push origin new-feature
    ```
5. Open a pull request from your branch to the `main` branch.

---

## License

This project is licensed under the MIT License.

---

## Acknowledgements

- **OpenWeatherMap API** or **WeatherStack API** for providing real-time weather data.
- **Spring Boot** for enabling rapid development of backend services.
- **HTML, CSS, and JavaScript** for creating a responsive frontend interface.
