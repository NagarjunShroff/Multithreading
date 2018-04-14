package test;

import java.util.Scanner;

public class hackerRankTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result = a+result;
            for(int j=0;j<=n-1;j++){
                result = (int) (result + (Math.pow(2.0, j)* b));
                System.out.println(result);
            }
        }
        in.close();

}
}
