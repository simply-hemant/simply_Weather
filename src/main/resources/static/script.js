async function getWeather() {
  const cityName = document.getElementById('cityInput').value;
  const resultDiv = document.getElementById('result');

  try {
    const response = await fetch(`http://localhost:8080/api/city?city=${cityName}`);
    if (!response.ok) throw new Error("Network response was not ok");

    const text = await response.text();
    resultDiv.innerText = text;
  } catch (error) {
    resultDiv.innerText = "Failed to fetch weather data";
    console.error(error);
  }
}
