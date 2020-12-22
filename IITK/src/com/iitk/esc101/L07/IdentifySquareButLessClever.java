package com.iitk.esc101.L07;

public class IdentifySquareButLessClever {

	public static void main(String[] args) {

		int n = 50;
		int i;
		boolean findSquare = false;

		if (n < 0) {

			System.out.println(n + " is not a perfect square.");

		} else if ((n == 0) || (n == 1)) {

			System.out.println(n + " is a perfect square.");

		} else {

			for (i = 2; i <= n / 2; i++) {

				if (i * i == n) {

					System.out.println(n + " is perfect square of " + i);

					findSquare = true;
					break;
				}
			}

			if (!findSquare) {

				System.out.println(n + "  is not a perfect square.");

			}

		}

		shorterMethod(n);

	}

	private static void shorterMethod(int n) {

		int i;
		boolean findSquare = false;

		if (n < 0) {

			System.out.println(n + " is not a perfect square.");

		} else if ((n == 0) || (n == 1)) {

			System.out.println(n + " is a perfect square.");

		} else {

			for (i = 2; ((i <= n / 2) && (i * i) <= n); i++) {
				
				if (i * i == n) {
					
					System.out.println(n + " is perfect square of " + i);
					findSquare = true;
				
				}
				
			}
			
			if(!findSquare) {
				
				System.out.println(n + "  is not a perfect square.");
				
			}

		}

	}

}
