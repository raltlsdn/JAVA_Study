package study.d200611.chap9Ex5;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			public void run() {
				System.out.println("트럭이 달립니다.");
				}
			
			}		
		);
	}
}
