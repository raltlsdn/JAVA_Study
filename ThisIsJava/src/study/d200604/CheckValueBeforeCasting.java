package study.d200604;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128;
		// Byte.MIN_VALUE 는 byte 타입이 가질 수 있는 최소값을 의미
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}
