package study.d200616;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] = " + data1);
			System.out.println("args[1] = " + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.print("java ArrayIndexOutOfBoundExceptionExample  ");
			System.out.print("값1  값2");
		}
	}
}
