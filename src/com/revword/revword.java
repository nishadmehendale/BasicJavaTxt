package com.revword;

//Class that prints reverse of individual words of a string
import java.util.Scanner;

class revword {
	public static void main(String args[]) {
		// Accepting the input string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();

		// Reversing each word and displaying the complete string
		String[] word = str.split(" ");
		int len = word.length;
		for (int i = 0; i < len; i++) {
			StringBuffer s = new StringBuffer(word[i]);
			System.out.print(s.reverse() + " ");
		}
		sc.close();

	}
}
