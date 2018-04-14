package SortingAlgorithms;

public class SelectionSort {
	
	public void selectionSort(int[] a) {
		int temp;
		for(int i=0; i <a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {5,4,3,2,1};
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(array);

	}

}
