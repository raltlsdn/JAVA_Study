package study.d200611.chap8Ex4;

public class test {
	public String exp() {
		return "hi";
	}
	
	public static void main(String[] args) {
		test test = new test();
		String a = test.exp();
		System.out.println(a);
	}
}
