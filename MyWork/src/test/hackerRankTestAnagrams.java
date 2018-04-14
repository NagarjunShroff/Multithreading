package test;

import java.util.Arrays;
import java.util.Scanner;

public class hackerRankTestAnagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		char arr1[] = a.toLowerCase().toCharArray();
		char arr2[] = b.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagrams");
		}else
			System.out.println("Not Anagrams");

	}

}
