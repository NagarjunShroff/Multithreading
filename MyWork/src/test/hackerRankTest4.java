package test;

import java.util.Scanner;

public class hackerRankTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = " ";
		s = Integer.toString(n);
		// or s = String.valueOf(n);
		// or s= " "+n;
		
		if(n == Integer.parseInt(s)) {
			System.out.println("Good job");
		}else
		{
			System.out.println("Wrong answer");
		}

	}

}
