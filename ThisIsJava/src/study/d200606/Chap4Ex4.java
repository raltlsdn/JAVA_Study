package study.d200606;

public class Chap4Ex4 {
	public static void main(String[] args) {
		//while과 Math.random 메소드 사용, 
		//두 개의 주사위 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
		//눈의 합이 5가 아니면 주사위 계속, 5면 멈추기
		int v1;
		int v2;		
		
		while (true) {
			v1 = (int)(Math.random()*6) + 1;
			v2 = (int)(Math.random()*6) + 1;
			System.out.println("("+v1+","+v2+")");
			if ( v1+v2 == 5 ) {
				break;
			}
			
		}
		
	}
}
