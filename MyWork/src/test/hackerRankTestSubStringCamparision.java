package test;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class hackerRankTestSubStringCamparision {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		
		SortedSet<String> set = new TreeSet<String>();
	
		for(int i=0;i<=s.length()-k;i++) {
			set.add(s.substring(i, i+k));
		}
		System.out.println(set.first());
		System.out.println(set.last());
	}

}
