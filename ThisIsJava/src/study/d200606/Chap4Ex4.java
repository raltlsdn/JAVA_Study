package study.d200606;

public class Chap4Ex4 {
	public static void main(String[] args) {
		//while�� Math.random �޼ҵ� ���, 
		//�� ���� �ֻ��� ������ �� ������ ���� (��1, ��2) ���·� ���
		//���� ���� 5�� �ƴϸ� �ֻ��� ���, 5�� ���߱�
		int v1;
		int v2;		
		
		while (true) {
			v1 = (int)(Math.random()*6) + 1;
			v2 = (int)(Math.random()*6) + 1;
			System.out.println("("+v1+","+v2+")");
			if ( v1+v2 == 5 ) {
				break;
			}
			
		}
		
	}
}
