package test;

import java.util.Arrays;

public class sortingTheAssortedArray {

	public static void main(String[] args) {

        int arr1[] = {0,6,2,3,1,1,1,0,0,2,3,1};
        
        for ( int i=arr1.length -1 ; i>=0;i--) {
        	
        	for(int j = 1; j<=i ;j ++) {
        		if(arr1[j-1] > arr1[j]) {
        			 int temp = arr1[j-1];
        			 arr1[j-1] = arr1[j];
        			 arr1[j] = temp;
        		}
        	}
        	
        }
        for ( int k =0 ;k < arr1.length; k++) {
        	System.out.println(arr1[k]);
        }
	}

}
