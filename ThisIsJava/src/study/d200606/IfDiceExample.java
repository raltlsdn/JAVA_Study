package study.d200606;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*6) + 1;
		int i ;
		
		for (i=1; i<=6; i++) {
			if(num == i) {
				System.out.println(num + "번이 나왔습니다.");		
			}
		}
	}
}
