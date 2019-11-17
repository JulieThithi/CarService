package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() {
		cars.add(new Car("11AA22", 5, 1000));
		cars.add(new Car("33BB44", 2, 2222));
		
		//Dates dates= new Dates("11/11/2017","1/1/2018");
	}
	
	@RequestMapping(value="/cars", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public List<Car> getListOfCars(){
		return cars;
	}
	
	//Car car = new Car("11AA22", 5, 1000,"11/11/2017","1/1/2018");
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addCar(@RequestBody Car car) throws Exception{
		System.out.println(car);
		cars.add(car);
	}
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getPlateNumber().equals(plateNumber)) {
				return cars.get(i);
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
	public void rentAndGetBack(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",
	required = true)boolean rent, @RequestBody (required = false) Dates dates){
		
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getPlateNumber().equals(plateNumber)) {
				if (rent == true) {
						//System.out.println("..");
						cars.get(i).setRent(true);
						cars.get(i).setDateDebut(dates.getBegin());
						cars.get(i).setDateFin(dates.getEnd());
					}
				else if (rent == false){
					cars.get(i).setRent(false);
					cars.get(i).setDateDebut(null);
					cars.get(i).setDateFin(null);
				}
			}
		}
	}

}