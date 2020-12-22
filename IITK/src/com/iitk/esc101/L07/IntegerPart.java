package com.iitk.esc101.L07;

// lecture 7
public class IntegerPart {

	public static void main(String[] args) {

		double x = -3.7;
		int ipart;
		double aval;
		ipart = ((x >= 0) || ((int) x == x)) ? (int) x : (int) (x - 1);
		aval = (x >= 0) ? x : -x;
		System.out.println("Integer part of " + x + " is " + ipart + ". Absolute value is " + aval + ".");
		System.out.println((int) x);
		
	}

}
