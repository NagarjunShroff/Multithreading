package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class hackerRankTestPatternSyntaxChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String pattern;
		
		for(int i=0;i<num;i++) {
			 pattern = sc.nextLine();
			 try {
			 Pattern.compile(pattern);
			 System.out.println("Valid");
			 }catch(Exception e) {
				 System.out.println("Invalid");
			 }
		}
	}

}
