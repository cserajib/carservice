package com.doj.web;

import java.io.Serializable;

public class Car implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Integer carId;   	
	private String carBrand;	
    private String carModel;	
	
    private String horsepower;		
    private String carEngine;
    
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	public String getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carBrand=" + carBrand + ", carModel=" + carModel + ", horsepower="
				+ horsepower + ", carEngine=" + carEngine + "]";
	}
    
    

}
