package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

   @Mock
   private Temperatures temperaturesMock;


   @Test
   void testCalculateForecastWithMock() {
      //Given
      Map<String, Double> temperaturesMap = new HashMap<>();
      temperaturesMap.put("Rzeszow", 25.5);
      temperaturesMap.put("Krakow", 26.2);
      temperaturesMap.put("Wroclaw", 24.8);
      temperaturesMap.put("Warszawa", 25.2);
      temperaturesMap.put("Gdansk", 26.1);
      when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
      WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

      //When
      int quantityOfSensors = weatherForecast.calculateForecast().size();

      //Then
      Assertions.assertEquals(5, quantityOfSensors);
   }


   @Test
   void testGetAverageWithMock() {
      // 30 + 20 +25 + 25 + 30 = 130 / 5 = 26
      //Given
      Map<String, Double> temperaturesMap = new HashMap<>();
      temperaturesMap.put("Rzeszow", 30.0);
      temperaturesMap.put("Krakow", 20.0);
      temperaturesMap.put("Wroclaw", 25.0);
      temperaturesMap.put("Warszawa", 25.0);
      temperaturesMap.put("Gdansk", 30.0);
      when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
      WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

      //When
      double result = weatherForecast.getAverageTemperature();

      //Then
      Assertions.assertEquals(26, result);
   }

   // parzyste
   @Test
   void testGetMedianEvenWithMock() {
      // 30 + 20 + 25 + 30 = 105
      // 30 30 25 20 // 55 / 2 = 27,5
      //Given
      Map<String, Double> temperaturesMap = new HashMap<>();
      temperaturesMap.put("Rzeszów", 30.0);
      temperaturesMap.put("Krakow", 20.0);
      temperaturesMap.put("Warszawa", 25.0);
      temperaturesMap.put("Gdansk", 30.0);
      when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
      WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

      //When
      double result = weatherForecast.getMedianTemperature();

      //Then
      Assertions.assertEquals(27.5, result);
   }

   // nie parzyste
   @Test
   void testGetMedianOddWithMock() {
      // 30 + 20 + 25 + 25 + 30 = 130 / 5 = 25
      //Given
      Map<String, Double> temperaturesMap = new HashMap<>();
      temperaturesMap.put("Rzeszów", 30.0);
      temperaturesMap.put("Krakow", 20.0);
      temperaturesMap.put("Wroclaw", 25.0);
      temperaturesMap.put("Warszawa", 25.0);
      temperaturesMap.put("Gdansk", 30.0);
      when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
      WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

      //When
      double result = weatherForecast.getMedianTemperature();

      //Then
      Assertions.assertEquals(25, result);

   }










}
