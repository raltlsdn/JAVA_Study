package study.d200610;
import java.util.Scanner;

public class BankApplication {
	private static Account20[] accountArray = new Account20[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		// 작성 위치
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("계좌주 : ");
		String owner = scanner.next();

		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();

		Account20 newAccount = new Account20(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("새 계좌가 생성되었습니다.");
				break;

			}

		}
	}

	// 계좌 목록보기
	private static void accountList() {
		// 작성 위치
		System.out.println("---------------");
		System.out.println("계좌목록");
		System.out.println("---------------");

		for (int i = 0; i < accountArray.length; i++) {
			Account20 accountList = accountArray[i];
			if (accountList != null) {
				System.out.println(
						accountList.getAno() + "    " + accountList.getOwner() + "    " + accountList.getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {
		// 작성 위치
		System.out.println("---------------");
		System.out.println("예금하기");
		System.out.println("---------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("예금액 : ");
		int input = scanner.nextInt();

		Account20 depositAccount = findAccount(ano);

		if (depositAccount == null) {
			System.out.println("계좌가 없습니다.");
		} else {
			depositAccount.setBalance(depositAccount.getBalance() + input);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
	}

	// 출금하기
	private static void withdraw() {
		// 작성 위치
		System.out.println("---------------");
		System.out.println("출금하기");
		System.out.println("---------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("출금액 : ");
		int output = scanner.nextInt();

		Account20 withdrawAccount = findAccount(ano);
		if (withdrawAccount == null) {
			System.out.println("계좌가 없습니다.");
			return;
		} else {
			withdrawAccount.setBalance(withdrawAccount.getBalance() - output);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
	}

	// Account20 배열에서 ano와 동일한 Account 객체 찾기
	private static Account20 findAccount(String ano) {
		// 작성 위치
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (ano.equals(accountArray[i].getAno())) {
					return accountArray[i];
				}
			}

		}
		return null;
	}
}
