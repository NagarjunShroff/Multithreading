package test;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int i,fact=1;
		
		for(i=1;i<=number;i++) {
			fact=fact * i;
		}
		System.out.println("Factorial of the number "+number+ " is "+ fact);
	}

}
