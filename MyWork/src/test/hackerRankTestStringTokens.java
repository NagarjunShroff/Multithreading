package test;

import java.util.Scanner;

public class hackerRankTestStringTokens {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String delimt = "[ !, ?._'@]+";
		String[] arr = str.split(delimt);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}	

	}

}
