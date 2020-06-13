package study.d200604;

public class CastingExample {
	public static void main(String arge[]) {
		// 강제 형변환 ( casting )
		// 실수를 정수로 변환하거나 하면 데이터 손실이 있을 수 있다
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
