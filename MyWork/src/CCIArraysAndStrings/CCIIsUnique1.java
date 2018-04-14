package CCIArraysAndStrings;

import java.util.Scanner;

public class CCIIsUnique1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		CCIIsUnique1 test = new CCIIsUnique1();
		boolean result = test.checkUnique(str);
		if(result) {
			System.out.println("The Given string is unique");
		}else {
			System.out.println("The Given string is not unique");
		}
	}
public boolean checkUnique(String str) {
	boolean[] strSet = new boolean[256];
	
	for(int i=0;i<str.length();i++) {
		
		int val = str.charAt(i);
		if(strSet[val]) {
			 return false;
		}
		strSet[val] = true;
	}
return true;	
}
}

