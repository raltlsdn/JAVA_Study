package study.d200606;

public class Chap4Ex3 {
	public static void main(String[] args) {
		//1 부터 100까지 정수 중 3의 배수 합
		int i;
		int sum = 0;
		
		for (i=1; i<=100; i++) {
			if( i%3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
	}
}
