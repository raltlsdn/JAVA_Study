package study.d200604;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;		// byte�� int�� ��ȯ
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; 			// char�� int�� ��ȯ
		System.out.println("���� �����ڵ�:" + intValue);
		
		intValue = 500;
		long longValue = intValue;		// int�� long���� ��ȯ
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// int�� double�� ��ȯ
		System.out.println(doubleValue);
	}

}
