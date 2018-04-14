package test;

public class bubbleSort {

	public static void main(String[] args) {

		int[] arr = { 9,2,7,3,6,1,5};
		int temp;
		for(int i=0 ;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]> arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int k = 0; k<arr.length;k++) {

			System.out.println(arr[k]);
		}
	}

}
