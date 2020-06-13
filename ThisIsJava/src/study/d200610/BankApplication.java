package study.d200610;
import java.util.Scanner;

public class BankApplication {
	private static Account20[] accountArray = new Account20[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("----------------------------------------------");
			System.out.print("���� >");

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
		System.out.println("���α׷� ����");
	}

	// ���� �����ϱ�
	private static void createAccount() {
		// �ۼ� ��ġ
		System.out.println("---------------");
		System.out.println("���»���");
		System.out.println("---------------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();

		System.out.print("������ : ");
		String owner = scanner.next();

		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();

		Account20 newAccount = new Account20(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("�� ���°� �����Ǿ����ϴ�.");
				break;

			}

		}
	}

	// ���� ��Ϻ���
	private static void accountList() {
		// �ۼ� ��ġ
		System.out.println("---------------");
		System.out.println("���¸��");
		System.out.println("---------------");

		for (int i = 0; i < accountArray.length; i++) {
			Account20 accountList = accountArray[i];
			if (accountList != null) {
				System.out.println(
						accountList.getAno() + "    " + accountList.getOwner() + "    " + accountList.getBalance());
			}
		}
	}

	// �����ϱ�
	private static void deposit() {
		// �ۼ� ��ġ
		System.out.println("---------------");
		System.out.println("�����ϱ�");
		System.out.println("---------------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();

		System.out.print("���ݾ� : ");
		int input = scanner.nextInt();

		Account20 depositAccount = findAccount(ano);

		if (depositAccount == null) {
			System.out.println("���°� �����ϴ�.");
		} else {
			depositAccount.setBalance(depositAccount.getBalance() + input);
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
	}

	// ����ϱ�
	private static void withdraw() {
		// �ۼ� ��ġ
		System.out.println("---------------");
		System.out.println("����ϱ�");
		System.out.println("---------------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();

		System.out.print("��ݾ� : ");
		int output = scanner.nextInt();

		Account20 withdrawAccount = findAccount(ano);
		if (withdrawAccount == null) {
			System.out.println("���°� �����ϴ�.");
			return;
		} else {
			withdrawAccount.setBalance(withdrawAccount.getBalance() - output);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		}
	}

	// Account20 �迭���� ano�� ������ Account ��ü ã��
	private static Account20 findAccount(String ano) {
		// �ۼ� ��ġ
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
