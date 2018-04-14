package test;

import java.util.Scanner;

public class primeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number : ");
		int num = new Scanner(System.in).nextInt();
        
		for(int i=1 ; i<=num; i++) {
			int count=0;
			for(int j=2; j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}

}
