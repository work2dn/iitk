package com.iitk.esc101.L07;

/**
 * Perfect number, a positive integer that is equal to the sum of its proper divisors. 
 * The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
 * Other perfect numbers are 28, 496, and 8,128
 * 
 * @author rdarshan
 *
 */
public class PerfectNumber {

	public static void main(String[] args) {

		int n = 28;
		
		int d, sigma_n = 1 + n;
		
		for (d = 2; d <= n / 2; d++) {
			
			if ((n % d) != 0) {
				
				continue;
				
			}
			
			sigma_n += d;
			
		}
		
		if (sigma_n == 2 * n) {
			
			System.out.println(n + " is perfect.");
			
		}

	}

}
