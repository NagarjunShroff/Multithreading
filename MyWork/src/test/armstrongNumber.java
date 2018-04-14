package test;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		int number = new Scanner(System.in).nextInt();
		
	int a = number, r=0, s=0;
	
	while(a!=0) {
		r=a%10;
		System.out.println("r :"+r);
		a=a/10;
		s= s + r*r*r;
	}
 if(s==number) {
	 System.out.println("the number "+number+" is Armstrong");
 }else
 {
	 System.out.println("the number "+number+" is not Armstrong");
 }
	}
}
