package test;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		String original = new Scanner(System.in).nextLine();
		String reverse ="";
		int length = original.length();
		
		for(int i= length -1; i>=0;i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println(original+" is a palindrome");
		}else {
			System.out.println(original+" is not a palindrome");
		}
	}

}
