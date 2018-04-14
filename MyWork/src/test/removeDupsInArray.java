package test;

import java.util.ArrayList;
import java.util.List;

public class removeDupsInArray {

	//@SuppressWarnings("null")
	public static void main(String[] args) {

		int a[] = {1,2,3,3,4,4,5,5,6};
		int b[] = new int[10];

		/*List<Integer> dup = new ArrayList<>();

		for(int i=0;i<a.length;i++) {
			if(!dup.contains(a[i])) {
				dup.add(a[i]);
			}

	}
		for(Integer j : dup)
			System.out.println(j.intValue());
		 */
		int current = a[0];
		boolean found = false;

		for(int i=0 ; i<a.length ;i++) {
			if(current == a[i] && !found) {
				found = true;
			}
			else if( current != a[i]) {
				System.out.println(current);
				current = a[i];
				found = false;
			}
		}
	}
}