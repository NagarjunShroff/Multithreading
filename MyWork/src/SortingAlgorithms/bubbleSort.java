package SortingAlgorithms;

public class bubbleSort {
	
	public void bubbleSort(int[] a) {
		
		int temp,i,j;
		boolean swapped;
		for(i=0; i<a.length-1; i++) {
			swapped=false;
			for(j=0;j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
		for(int k=a.length-1;k>=0;k--){
			System.out.println(a[k]);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {5,3,1,4,2};
		bubbleSort bb = new bubbleSort();
		bb.bubbleSort(array);

	}

}
