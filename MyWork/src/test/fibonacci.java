package test;

import java.util.Scanner;

public class fibonacci {
	
	public int fib(int n) {
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1) + fib (n-2);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int number = new Scanner(System.in).nextInt();
		fibonacci fib = new fibonacci();
		
		for(int i=0;i<number;i++) {
			System.out.println(fib.fib(i));
			
		}
	}

}
