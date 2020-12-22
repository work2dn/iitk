package com.iitk.esc101.L07;

public class NaturalSum {

	public static void main(String[] args) {
		int n;
        int y = 1;
        for (n=2; n <=100; n++) {
            y += n;
        }
        
        // n-1 because as in for loop there is post increment of n
        System.out.println("Sum of the first " + (n-1) + " natural numbers is " + y);
        
        anotherMethodSum();
   
	}

	private static void anotherMethodSum() {

		int n;
        int y;
        for (n=2, y=1; n <=100; y += n, n++) { }
        System.out.println("Sum of the first " + (n-1) + " natural numbers is " + y);
        
	}
	
	

}
