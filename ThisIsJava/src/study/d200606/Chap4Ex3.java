package study.d200606;

public class Chap4Ex3 {
	public static void main(String[] args) {
		//1 ���� 100���� ���� �� 3�� ��� ��
		int i;
		int sum = 0;
		
		for (i=1; i<=100; i++) {
			if( i%3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3�� ����� �� : " + sum);
	}
}
