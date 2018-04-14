package test;

import java.util.Scanner;

public class hackerRankTestEOF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		int i = 0;
		while(sc.hasNext()) {
			i++;
			System.out.println(i+ "     "+sc.nextLine());
		}
	}

}
