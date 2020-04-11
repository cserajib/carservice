package com.doj.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinesh.Rajput
 *
 */
public class RemoteAccountRepository implements AccountRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	/*@Override
	public List<Account> getAllAccounts() {
		Account[] accounts = restTemplate.getForObject(serviceUrl+"/accounts", Account[].class);
		return Arrays.asList(accounts);
	}*/
	
	@Override
	public List<Car> getAllAccounts() {
		
		System.out.println("cars here....."+serviceUrl);
		Car[] cars = restTemplate.getForObject(serviceUrl+"/api/cars", Car[].class);
		System.out.println("cars here....."+cars);
		
		for(Car val:cars) {
			System.out.println("vals here--->"+val.getCarBrand()+"---"+val.getCarId());
		}
		return Arrays.asList(cars);
	}

	/*@Override
	public Account getAccount(String number) {
		return restTemplate.getForObject(serviceUrl + "/accounts/{id}",
				Account.class, number);
	}
	*/
	
	@Override
	public Car getAccount(int number) {
		Car car=  restTemplate.getForObject(serviceUrl + "/api/cars/{id}",
				Car.class, number);
		System.out.println("hare car values---->"+car.getCarBrand()+"---"+car.getCarId());
		return car;
	}

}
