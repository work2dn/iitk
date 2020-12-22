package com.iitk.esc101.L07;

public class PositiveDecimalToBinary {

	public static void main(String[] args) {

		int n = 9, y = 0, polyTerm = 1;
		
		if (n < 0) {
			
			System.out.println("Sorry, cannot handle negative integers today!");
			
		} else {
			
			while (n > 0) {
				y += (polyTerm * (n % 2));
				n /= 2;
				polyTerm *= 10;
				
			}
			
			System.out.println("Required binary: " + y);

		}
	}

}
