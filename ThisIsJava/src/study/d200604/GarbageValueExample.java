package study.d200604;

public class GarbageValueExample {

	public static void main(String[] args) {
		// ������ Ÿ���� �Ѱ踦 ������ �ٽ� �ּҰ����� ���� ������
		byte var1 = 125;
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1 :" + var1 + "\t" + "var2 :" + var2);
		}
	}

}
