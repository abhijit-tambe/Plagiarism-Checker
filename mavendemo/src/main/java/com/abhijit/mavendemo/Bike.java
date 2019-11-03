package com.abhijit.mavendemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("bhag rahi hai");
	}
}
