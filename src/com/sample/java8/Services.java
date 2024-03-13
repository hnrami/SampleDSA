package com.sample.java8;

import java.util.ArrayList;
import java.util.List;

public class Services {
	
	public NewService newService;
	

	public NewService getNewService() {
		return newService;
	}

	public void setNewService(NewService newService) {
		this.newService = newService;
	}
	
	
	Boolean empty;

	public boolean isEmpty() {
		return false;
	}
	
	public static void main(String a[]) {
		
		List<String>  input= new ArrayList<>();

		
		input.add("hemang");
		input.add("rami");
		
		input.stream().forEach(System.out::print);
		
	}


	
	
	

}
