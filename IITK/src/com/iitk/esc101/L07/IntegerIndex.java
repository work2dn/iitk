package com.iitk.esc101.L07;

// lecture 7

public class IntegerIndex{

	public static void main(String[] args) {

		int n = 3;
		
		double x = 3, y = 1.0;
		
		int m = n;
		
		if(n < 0) {
			
			x = 1/x;
			
			m = -n;
			
		}
		
		while(m > 0) {
			
			y *= x; // y =  y * x;
			
			m--;// m  = m - 1;
			
		}
		
		System.out.println(x + " to the power of " + n + " is " + y);
		
	}

}
