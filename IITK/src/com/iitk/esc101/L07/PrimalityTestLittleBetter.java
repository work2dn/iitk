package com.iitk.esc101.L07;

public class PrimalityTestLittleBetter {

	public static void main(String[] args) {



		int n = 43, d;
		
		if(n<=1) {
			
			System.out.println(n + " is not a prime..");
			
		} else  {
			
			// here conditional statement is changed to d*d <= n
			// so if it will run d*d
			for(d=2; d*d<=n; d++) {
				
				if((n%d) == 0) {
					
					System.out.println(n + " n is not a prime.");
					break;
					
				}
			}
			
			//
			if(d*d > n) {
				
				System.out.println(n + " is a prime");
				
			}	
			
		}
		
		
		
	
	}

}
