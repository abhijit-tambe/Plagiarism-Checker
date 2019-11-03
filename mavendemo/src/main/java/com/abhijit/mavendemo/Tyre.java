package com.abhijit.mavendemo;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

	public String getBrand() {
		return brand;
	}

//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "its working";
//		return brand;
//				[brand=" + brand + "]";
	}
	
	

}
