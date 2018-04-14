package test;

import java.util.Scanner;

public class contigousIntegers {

	public static void main(String[] args) {
		
		/*System.out.println("Enter the number of test case");
		Scanner sc =new Scanner(System.in);
		int testNum = sc.nextInt();
		System.out.println("Enter the array length");
		int arrayLength = sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i =0 ;i<=testNum;i++) {
			for(int j=0;j<arrayLength;j++) {
				
			}
		}*/
		
		int arr[] = {1,9,3,4,5};
		//int arr[] = {34,20,30};
		//System.out.println("array length:"+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			int a = arr[i];
			if(arr[i]<=arr[i+1]) {
			   System.out.println("Yes");
			}else
				System.out.println("No");
			break;
			
		}
		

	}

}
