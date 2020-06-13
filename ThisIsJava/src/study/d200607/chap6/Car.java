package study.d200607.chap6;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;

	Car() {
		
	}
	
	Car(String model){
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		this(model, color, 300);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
