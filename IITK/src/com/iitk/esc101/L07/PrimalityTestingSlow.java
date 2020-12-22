package com.iitk.esc101.L07;

public class PrimalityTestingSlow {

	public static void main(String[] args) {

		int n = 43, d;
		
		if(n<=1) {
			
			System.out.println(n + " is not a prime..");
			
		} else  {
			
			// here conditional statement is: d <= n/2
			for(d=2; d<=n/2; d++) {
				
				if((n%d) == 0) {
					
					System.out.println(n + " n is not a prime.");
					break;
					
				}
			}
			
			if(d > n/2) {
				
				System.out.println(n + " is a prime");
				
			}	
			
		}
		
		
		
	}

}
