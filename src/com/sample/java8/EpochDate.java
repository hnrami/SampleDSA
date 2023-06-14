package com.sample.java8;

import java.time.Instant;
public class EpochDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try {
			 
		
		        long epochTime = System.currentTimeMillis() / 1000L;
		        System.out.println("UTC time in epoch format: " + epochTime);
		        
			 
			 
         } catch (Exception e) {
             e.printStackTrace();
         }
	}

}
