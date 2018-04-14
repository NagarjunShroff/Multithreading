package SortingAlgorithms;

public class shellSort {
	
	public void insertionSort(int[] a, int startIndex, int increment) {
		int temp,i,j;
		
		for(i=startIndex; i< a.length ;i= i+increment) {
			for(j=Math.min(i+increment, a.length-1 );j-increment>=0; j=j-increment) {
				if(a[j] < a[j - increment]) {
					temp = a[j];
					a[j] = a[j-increment];
					a[j-increment] = temp;
				}else {
					break;
			}
				System.out.println(a[j]);	
		   }
			
		}
	}
	
	public void shellSort(int[] a) {
		int increment = a.length/2;
		while(increment>=1) {
			for(int startIndex=0;startIndex< increment; startIndex++) {
				insertionSort(a,startIndex,increment);
			}
			increment = increment/2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {4,5,6,2,1,7,10,3,8,9};
		shellSort sh = new shellSort();
		sh.shellSort(array);;

	}

}
