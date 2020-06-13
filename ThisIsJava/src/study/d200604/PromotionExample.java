package study.d200604;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;		// byte를 int로 변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; 			// char를 int로 변환
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 500;
		long longValue = intValue;		// int를 long으로 변환
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// int를 double로 변환
		System.out.println(doubleValue);
	}

}
