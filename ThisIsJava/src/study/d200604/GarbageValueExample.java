package study.d200604;

public class GarbageValueExample {

	public static void main(String[] args) {
		// 데이터 타입의 한계를 넘으면 다시 최소값부터 들어가기 시작함
		byte var1 = 125;
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1 :" + var1 + "\t" + "var2 :" + var2);
		}
	}

}
