package study.d200606;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("사과 한개에서 \n0.7조각을 빼면,\n" 
							+ result 
							+ "조각이 남는다.");
	}

}
