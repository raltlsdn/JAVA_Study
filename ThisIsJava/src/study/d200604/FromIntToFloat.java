package study.d200604;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		// float Ÿ���� ��ȣ(1��Ʈ) ����(8��Ʈ) ����(23��Ʈ) �� int 32��Ʈ�� ǥ���� �� ����
		// ���� ������ �ս��� �߻��ϰ� ��
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
