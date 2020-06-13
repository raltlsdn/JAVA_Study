package study.d200611.chap9Ex4;


public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
				
		Car.Engine engine = new Car.Engine();
	}
}
