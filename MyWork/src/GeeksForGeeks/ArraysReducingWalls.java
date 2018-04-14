package GeeksForGeeks;

import java.util.Scanner;

public class ArraysReducingWalls {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		//sc.nextLine();

		for(int i=0;i<num;i++) {
			int count =0;
			String input = sc.nextLine();
			int N = Integer.parseInt(input.split(" ")[0]);
			int K = Integer.parseInt(input.split(" ")[1]);
			int [] a = new int[N];
			String[] arrayElements = sc.nextLine().split(" ");
			for(int j=0;j<N;j++) {
				a[j] = Integer.parseInt(arrayElements[j]);
			}
			for(int k=0;k<a.length;k++) {
				if(a[k] > K) {
					while(a[k] > K){
						a[k] -= K ;
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}
}


