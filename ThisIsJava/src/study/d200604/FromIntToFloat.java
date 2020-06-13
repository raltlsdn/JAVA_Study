package study.d200604;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		// float 타입은 부호(1비트) 지수(8비트) 가수(23비트) 로 int 32비트를 표현할 수 없다
		// 따라서 데이터 손실이 발생하게 됨
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
