package test;

import java.util.Scanner;

public class concatAndFindPrime {


	public boolean checkPrime(int n) {
		int flag = 0;
		int ret =0;
		int j =0;
		if(n==0 || n==1)
			return false;
		else {
			for( j=2;j<=n/2;j++) {
				if(n%j==0) {
					//System.out.println("not prime");
					flag=1;
					break;
				}
			}
			if (flag == 0) {
				//System.out.println(n);
				//System.out.println("prime");
				ret =1;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		concatAndFindPrime c = new concatAndFindPrime();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];

		boolean isPrimeArr[] = new boolean[num];

		for(int i=0 ;i<num ;i++) {
			boolean prime = c.checkPrime(i);
			if(prime) {
				isPrimeArr[i] = true;
			} else {
				isPrimeArr[i] = false;
			}
		}

		StringBuffer primesComninations = new StringBuffer("");
		for(int i=0;i<isPrimeArr.length;i++) {
			if(isPrimeArr[i]) {
				System.out.println("Satrting with: " + i);

				for(int j=0;j<isPrimeArr.length;j++) {
					if(isPrimeArr[j]) {
						primesComninations.append(i + "" + j + ",");
					}
				}
			}
		}

		System.out.println("primesComninations: " + primesComninations);
		//int[] primes = Integer.parseInt(primesComninations.toString().split(","));
		//for(Integer str : primes) {
		//.checkPrime(str);
		}
//	}
}