package study.d200608;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas∞° æ¯¥Ÿ");
			return false;
		} 
		System.out.println("gas∞° ¿÷¥Ÿ");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("¥ﬁ∏≥¥œ¥Ÿ. gas ¿‹∑Æ : "+gas);
				gas -= 1;
			} else {
				System.out.println("∏ÿ√‰¥œ¥Ÿ. gas ¿‹∑Æ : "+gas);
				return;
			}
		}
	}
}
