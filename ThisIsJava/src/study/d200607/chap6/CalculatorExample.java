package study.d200607.chap6;

public class CalculatorExample {	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		System.out.println(cal.plus(10, 20));
		cal.powerOff();
		
	}
}
