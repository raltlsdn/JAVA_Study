package study.d200606;
import java.util.Scanner;

public class Chap4Ex7 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.println("���� > ");
			
			String inputString = scanner.nextLine();
			
			if(inputString.equals("1")) {
				
				System.out.println("���ݾ� >");
				int in = Integer.parseInt(scanner.nextLine());
				balance = balance + in;
				
			} else if (inputString.equals("2")) {
				
				System.out.println("��ݾ� >");
				int out = Integer.parseInt(scanner.nextLine());
				if(balance < out) {
					System.out.println("�ܰ� ���ڶ��ϴ�.");
					out = 0;
				}
				balance = balance - out;
				
			} else if (inputString.equals("3")) {
				
				System.out.println("�ܰ� >" + balance);

			} else if(inputString.equals("4")) {

				run = false;

			} else {

				System.out.println("�߸��� �Է��Դϴ�.");

			}
			
		}
		System.out.println("���α׷� ����");
	}
}
