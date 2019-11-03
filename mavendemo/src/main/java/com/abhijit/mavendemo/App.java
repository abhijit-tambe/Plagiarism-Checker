package com.abhijit.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	// instantiate with the class and instantiate the class need 
    	//to change both if we want to use a different method or class
    	// tight coupling on both side
//    	Car c = new Car();
//    	c.drive();
    	// basic intantiate class which implements an intreface
    	// tight coupling on right side 
//    	Vehicle c = new Bike();
//    	c.drive();
    	
    	//to over come this limitation and implement loose coupling
    	// use BeanFactory for small application or
    	//ApplicationContext for enterprise level or web application
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle obj = (Vehicle)context.getBean("bike");
//    	obj.drive();
//    	
//    	Tyre t = (Tyre)context.getBean("ty");
//    	
//    	System.out.println(t);
    	Car c = (Car)context.getBean("car");
    	c.drive();
    }
}
