package study.d200607;
import java.util.Scanner;

public class Chap5Ex9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				
			} else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"] > ");
					scores[i] = scanner.nextInt();
				}
				
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"] = " + scores[i]);
				}
				
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg;
				for(int i =0; i<scores.length; i++) {
					if(scores[i] >= max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum/scores.length;
				System.out.println("���� : " + sum);
				System.out.println("��� : " + avg);
				System.out.println("�ְ��� : " + max);
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");
	}
}
