package study.d200604;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128;
		// Byte.MIN_VALUE �� byte Ÿ���� ���� �� �ִ� �ּҰ��� �ǹ�
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ�����ּ���");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}
