package com.miage.cara.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace = "http://sample.org/helloWorld", name = "HelloWorld")
public class HelloWorld {

	@WebMethod (action = "urn:sayHello" ,operationName = "sayHello")
	public String sayHello(@WebParam (partName = "name") String name) {
		return "Hello " + name;
	}

}
