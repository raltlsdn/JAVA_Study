package study.d200607.chap6;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println(result1);
		
		int result2 = myCom.sum2(values1);
		System.out.println(result2);
		
		int result3 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println(result4);
	}
}
