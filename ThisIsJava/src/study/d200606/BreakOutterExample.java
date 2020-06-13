package study.d200606;

public class BreakOutterExample {
	public static void main(String[] args) {
		Outter : for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <= 'z'; lower++) {
				if(lower=='g') {
					break Outter;
				}
				System.out.println((upper+""+lower));
			}
			
		}
	System.out.println("프로그램 종료");
	}
}
