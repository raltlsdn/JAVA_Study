package study.d200606;

public class Chap4Ex05 {
	public static void main(String[] args) {
		// ��ø for �� ��� 4x+5y=60�� ��� �� ���ؼ� (x, y) ���·� ����ϱ�
		// x�� y�� 10 ������ �ڿ���
		int x;
		int y;
		
		for (x=1; x<=10; x++) {
			for (y=1; y<=10; y++) {
				int sum = 4*x + 5*y;
				if (sum == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}
