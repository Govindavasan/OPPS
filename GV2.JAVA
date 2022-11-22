package com.oops.demo;

public class GV2 {

	public static void main(String[] args) {
		GV1  a1=new GV1 ("Govind","Saivi");
		GV1  a2=new GV1 ("Govi","Saindhavi");
		
		System.out.println(a1.getFirstName());
		System.out.println(a1.getLastName());
		
		System.out.println(a2);
		
		
		
		
		GV1  a3=new GV1 ();
		
		GV1  a4;
		//System.out.println(a4);
		
		a4=a2;
		System.out.println(a4);
		
		

	}

}