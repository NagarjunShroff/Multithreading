package test;

import java.util.Scanner;

public class hackerRankTestStringIntro {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
	
		long length = A.length() + B.length();
	
		System.out.println(length);
		
		
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1) + " "+ B.substring(0, 1).toUpperCase()+B.substring(1));
		

	}

}
