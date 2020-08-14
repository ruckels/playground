package de.andreas_ruckelshausen.MyJersyRESTServices2020.services;

import de.andreas_ruckelshausen.MyJersyRESTServices2020.entities.HelloWorld;

public class HelloWorldService {

	public static HelloWorld getHelloWorld(){
		HelloWorld hw = new HelloWorld();   // is already initialized
		return hw;
	}
	
	
}
