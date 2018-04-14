package SortingAlgorithms;

public class insertionSort {
	
	public void insertionSort(int[] a) {
		int temp,i,j;
		
		for(i=0;i<a.length-1; i++) {
			for(j=i+1;j>0;j--) {
				if(a[j] < a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}else {
					break;
				}
			}
		}
		for(int k : a) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,3,4,1,2};
		insertionSort is = new insertionSort();
		is.insertionSort(array);

	}

}
