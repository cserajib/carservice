package com.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.bamossza.project.entities.Car;

public class RestClientnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final String uri = "http://localhost:2222/api/cars";
		
		 
	    Car newCar = new Car("Nissa", "Micra", "77", "Nissa");
	 
	    RestTemplate restTemplate = new RestTemplate();
	    Car result = restTemplate.postForObject( uri, newCar, Car.class);
	 
	    System.out.println(result);
	    //updateCar();
	}
	
	
	private static void getCars()
	{
		 final String uri = "http://localhost:2222/api/cars";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
	
	private static void updateCar()
	{
	    final String uri = "http://localhost:2222/api/cars/{id}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("id", "1");
	     
	    Car updateCar = new Car("Nissan", "Micra", "79", "Nissan");
	     
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.put ( uri, updateCar, params);
	}

}
