import java.util.InputMismatchException;
import java.util.Scanner;

// ȯ�� ���....
public class port_exchangemenu implements Coin {
	public void exchange() {

		Scanner scan = new Scanner(System.in);
		int haneulchoice = 0;

		int koreamoney; // ȯ���� ����� �츮���� �Է�
		double haneulmoney; // ȯ�����Ϸ��� ��

		while (haneulchoice != 4) {
			System.out.println("ȯ���� 3���� ���� �����մϴ�.");
			System.out.println(">> 1. �Ϻ�  2. �߱�  3. �̱� ");
			System.out.println(">> 4�� ������ �����մϴ�.\t");
			System.out.print(">> ���� �������ּ���.\t");
			haneulchoice = scan.nextInt(); /// ȯ�� ���� ����

			switch (haneulchoice) {
			case 1: // �Ϻ� ȯ�� => 100���� 1000�� :: 1���� 10��
				System.out.println("�Ϻ� ȯ�� ����� �����ϼ̽��ϴ�.");
				System.out.print(">> �ٲ� ���� �Է��ϼ���..\t");
				// �ݾ��� �Է��ؾ��ϴµ�,, �����Է��ϸ� ����ó���߻���Ű��!!!!!
				try { // try catch�� Ȱ��!!
					koreamoney = scan.nextInt(); // a 3 5
				} catch (InputMismatchException ie) {
					System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
					scan.next(); // �Է¸� �ް� ������ ���� ����!!
					continue;
				}

				haneulmoney = koreamoney * japan;
				System.out.println(koreamoney + "���� " + haneulmoney + "���Դϴ�.");
				break;

			case 2: // �߱� ȯ�� :: 1������ 171��
				System.out.println("�߱� ȯ�� ����� �����ϼ̽��ϴ�.");
				System.out.print(">> �ٲ� ���� �Է��ϼ���..\t");
				try { // try catch�� Ȱ��!!
					koreamoney = scan.nextInt(); // a 3 5
				} catch (InputMismatchException ie) {
					System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
					scan.next(); // �Է¸� �ް� ������ ���� ����!!
					continue;
				}
				haneulmoney = koreamoney * china;
				System.out.println(koreamoney + "������ " + haneulmoney + "���Դϴ�.");
				break;

			case 3: // �̱� ȯ��:: 1�޷��� 1200�� 100�޷��� 120000
				System.out.println("�̱� ȯ�� ����� �����ϼ̽��ϴ�.");
				System.out.print(">> �ٲ� ���� �Է��ϼ���..\t");
				try { // try catch�� Ȱ��!!
					koreamoney = scan.nextInt(); // a 3 5
				} catch (InputMismatchException ie) {
					System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
					scan.next(); // �Է¸� �ް� ������ ���� ����!!
					continue;
				}
				haneulmoney = koreamoney * usa;
				System.out.println(koreamoney + "�޷��� " + haneulmoney + "���Դϴ�.");
				break;

			case 4: // 4�� ������ ȯ�� ���α׷� ���� �մϴ�...
				System.out.println("**ȯ�� �޴��� �����մϴ�**");
				break;

			default:
				System.out.println("ȸ�翡�� ȯ�������� �����ϴ� ���� 3�� ������Դϴ�.");
				System.out.println("�Ϻ�, �߱�, �̱� �� 1������ �������ּ���.");
				break;

			}
		}
	}
}
