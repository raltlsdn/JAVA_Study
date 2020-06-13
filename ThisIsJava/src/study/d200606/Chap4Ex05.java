package study.d200606;

public class Chap4Ex05 {
	public static void main(String[] args) {
		// 중첩 for 문 사용 4x+5y=60의 모든 해 구해서 (x, y) 형태로 출력하기
		// x와 y는 10 이하의 자연수
		int x;
		int y;
		
		for (x=1; x<=10; x++) {
			for (y=1; y<=10; y++) {
				int sum = 4*x + 5*y;
				if (sum == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}
