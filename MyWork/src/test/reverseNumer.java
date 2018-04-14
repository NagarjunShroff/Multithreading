package test;

import java.util.Scanner;

public class reverseNumer {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number = new Scanner(System.in).nextInt();
       int rev = 0 ;
		while(number!=0) {
			rev = (rev *10) + (number%10);
			number = number/10;
		}
		System.out.println("Reverse number"+ rev);
	}

}
