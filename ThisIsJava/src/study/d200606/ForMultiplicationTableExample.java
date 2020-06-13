package study.d200606;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			System.out.println("=== " + i + " ´Ü ===");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("");
		}
	}

}
