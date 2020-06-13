package study.d200611.chap9Ex5;

public class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
