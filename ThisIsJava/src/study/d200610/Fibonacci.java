package study.d200610;

public class Fibonacci {
	public static void main(String[] args) {
		int i=1 ;
		int j=1;
		int sum=0;
		
		System.out.print(i);
		
		for (int k =0; k<100; k++) {
			System.out.print("  ");
			System.out.print(j);
			sum = i+j;
			i = j;
			j = sum;
		}
	}
}
