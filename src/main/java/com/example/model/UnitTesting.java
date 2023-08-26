package com.example.model;

public class UnitTesting {

	
	public int checkIntType(int a) {
		
		if(a%2==0) {
			System.out.print("int value is even");
		}
		else if(a%3==0) {
			System.out.print("int value is multiple of 3");
		}
		else if(a%10==0){
			System.out.print("int value is multiple of 10");
		}
		else
			return a;
		
		return 1;
		
	}
}
