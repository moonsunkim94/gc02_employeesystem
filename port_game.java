import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class port_game {
// ù��° ���� �ζ��Դϴ�!!
	void game1Lotto() { // �ζ�
		System.out.println("Lotto ������ �����մϴ�!!");
		System.out.println("�̹��� ����� �޲ټ���!!");
		System.out.print("�̹��� ����� ��ȣ�� ");
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}

		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.print(list);
		System.out.println(" �Դϴ�.");
	}

// �� ��° �׺�
	void game2Gambling() {
		System.out.println();
		System.out.println("Gambling ������ �����մϴ�!!");
		System.out.println("�̱�� ��, �� ��~~!!!");
		System.out.println("�� ����� �̱� ������� ���� ���.����");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		String name1, name2;
		int starttime1, endtime1, result1, starttime2, endtime2, result2;
		System.out.print(">> [Player1] �̸��� �Է��ϼ���");
		name1 = scan.nextLine();
		System.out.print(">> [Player2] �̸��� �Է��ϼ���");
		name2 = scan.nextLine();

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.println("[" + name1 + "] ���� <Enter>Ű>> ");
		scan.nextLine();
		starttime1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + starttime1);
		System.out.println("10�� ���� �� <Enter>Ű>>");
		scan.nextLine();
		endtime1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + endtime1);

		System.out.println("[" + name2 + "] ���� <Enter>Ű>> ");
		scan.nextLine();
		starttime2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + starttime2);
		System.out.println("10�� ���� �� <Enter>Ű>>");
		scan.nextLine();
		endtime2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + endtime2);

		// ���
		result1 = (endtime1 > starttime1) ? (endtime1 - starttime1) : ((endtime1 + 60) - starttime1);

		result2 = (endtime2 > starttime2) ? (endtime2 - starttime2) : ((endtime2 + 60) - starttime2);
		System.out.println("[" + name1 + "] ���: " + result1 + ", [" + name2 + "] ���: " + result2 + " ");

		if (Math.abs(10 - result1) < Math.abs(10 - result2)) {
			System.out.println("���ڴ� " + name1 + "!");
		} else if (Math.abs(10 - result1) == Math.abs(10 - result2)) {
			System.out.println("���º�");
		} else {
			System.out.println("���ڴ� " + name2 + "!");
		}
		System.out.println("�ݢ���ġ ��ġ ��ġ ��ġ �Ѳٺ��Ѳٻ�~�ݢ�\r\n" + "����ġ ��ġ ��ġ ��ġ �ѲٻѲٻ���~�ݢ�");
		System.out.println();
	}

	
}
