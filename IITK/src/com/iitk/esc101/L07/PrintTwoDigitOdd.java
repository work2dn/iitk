package com.iitk.esc101.L07;

public class PrintTwoDigitOdd {

	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			if ((i % 2) == 0) {
				continue;
			}
			if (((i / 10) % 2) == 1) {
				System.out.println(i + " has odd digits.");
			}
		}
	}

}
