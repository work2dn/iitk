package com.iitk.esc101.L07;

// lecture 7
public class IntegerPartAlternate {

	public static void main(String[] args) {

		double x = -0.3;
		
		int ipart;
		
		double aval;
		
		ipart = ((x < 0) && ((int)x != x))? (int)(x-1) : (int)x;
		
		aval = (x < 0) ? -x : x;
		
		System.out.println("Intger part of x: " + ipart + ". Absolute value is: " + aval) ;
				
	}

}
