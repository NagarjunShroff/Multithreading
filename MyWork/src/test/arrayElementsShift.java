package test;

public class arrayElementsShift {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
				
		int amount = 2 ;
		
	for (int i=0 ; i< amount; i++) {
		 int a = arr[0];
		 int j ;
		for(j=0;j<arr.length-1;j++) {
			arr[j] = arr[j+1];
		}
		arr[j] = a;
	}
		for(int k=0 ;k<arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
