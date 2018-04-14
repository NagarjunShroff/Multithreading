package test;

import java.util.Scanner;

public class reverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String str;
		for(int j=0;j<num;j++) {
			str = sc.nextLine();
			String[] arr = str.split("\\.");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
	}

}
