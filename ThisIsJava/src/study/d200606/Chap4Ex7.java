package study.d200606;
import java.util.Scanner;

public class Chap4Ex7 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택 > ");
			
			String inputString = scanner.nextLine();
			
			if(inputString.equals("1")) {
				
				System.out.println("예금액 >");
				int in = Integer.parseInt(scanner.nextLine());
				balance = balance + in;
				
			} else if (inputString.equals("2")) {
				
				System.out.println("출금액 >");
				int out = Integer.parseInt(scanner.nextLine());
				if(balance < out) {
					System.out.println("잔고가 모자랍니다.");
					out = 0;
				}
				balance = balance - out;
				
			} else if (inputString.equals("3")) {
				
				System.out.println("잔고 >" + balance);

			} else if(inputString.equals("4")) {

				run = false;

			} else {

				System.out.println("잘못된 입력입니다.");

			}
			
		}
		System.out.println("프로그램 종료");
	}
}
