package study.d200604;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		// double Ÿ���� ��ȣ(1��Ʈ) ����(11��Ʈ) ����(52��Ʈ) �� int 32��Ʈ�� ǥ���� �� �ִ�
		// ���� ������ �ս��� �߻����� ����
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
