package com.palindrome;

//Class to check if anumber is palindrome
import java.util.Scanner;

class palindrome {
	public static void main(String args[]) {
		// Accepting input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		// Checking if the number is palindrome
		int copy = num, sum = 0, d;
		while (num > 0) {
			d = num % 10;
			sum = (sum * 10) + d;
			num = num / 10;
		}

		// Display of result
		if (copy == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
			System.out.println("Reverse of the number is " + sum);
		}
		sc.close();
	}
}
