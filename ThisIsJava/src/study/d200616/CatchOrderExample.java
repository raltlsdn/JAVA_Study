package study.d200616;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(NumberFormatException e) {
			System.out.println("숫자 변환 불가");
		} catch(Exception e) {
			System.out.println("실행 매개 변수 부족");
		}  finally {
			System.out.println("다시 실행하세요");
		}
	}
}
