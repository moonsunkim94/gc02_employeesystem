// ���θ޴����� 1���� �������� ��, ����Ǵ� Ŭ�����Դϴ�!!
// �ٷΰ�༭ Ȯ�� �� ���� �׸��Դϴ�.
// 1�� �ٷΰ�༭�� ����ϰ�  �����ʴ� ���� Ȯ�εǸ� StringBuffer����� ���� ���������ϰԲ�....
import java.io.InterruptedIOException;
import java.util.*;
//ok
public class port_workagreement extends Thread {

	String workday = "2019.05.25 ~ 2019.10.30"; // �ٷΰ��Ⱓ
	String workhour = "09:20 ~ 18:10"; // �ٷνð�
	String weekworkday = "�� 5�� �ٹ�"; // 5�� �ٹ��� �޹��� ex> �� 5��/ ����
	String workmoneytype = "����"; // �ñ��̳�? �����̳�? �����̳�??
	String money = "2,000,000 ��"; // ���ޱݾ�!!
	//port_workagreement pwa = new port_workagreement();
//===============�ٷΰ�༭ �����޴�
	void changedoc() {
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ");

		System.out.println(">> ���� 1���� ����� �����ϰ� ������ �ٸ� ���� �����ϰ��� �ϸ� �λ�η� �湮���ֽñ�ٶ��ϴ�.");

		System.out.println("*********************************************");
		System.out.println("       Only ���� ��ɸ� �ֽ��ϴ�!!");
		System.out.println("*********************************************");
		int choicemun = 0;
		while (choicemun != 5) {
			System.out.println("");
			System.out.println("������ �κ��� checking!! ");
			System.out.println("====================================");
			System.out.println("            ��. �ٷΰ��Ⱓ ");
			System.out.println("            ��. �ٷνð�");
			System.out.println("            ��. �ٹ���/����");
			System.out.println("            ��. �ӱ�");
			System.out.println("            ��. ����");
			System.out.println("");
			System.out.println("  # 2.�ٹ���ҿ� 3.���������� �����Ұ��Դϴ� #   ");
			System.out.println("====================================");
			System.out.print("������ �׸��� �������ּ���(�Է�) >>");

			choicemun = scan.nextInt();
			String aftercom = null;  // ����ڰ� ���� ������ ������ �Է¹޴� ����.

			switch (choicemun) {
			case 1: // 1���� ������ �ٷΰ��Ⱓ�� ����.,
				System.out.println("@ 1�� �ٷΰ��Ⱓ �׸��� �����մϴ�.");
				System.out.println("@ ����:0000.00.00 ~ 0000.00.00");
				System.out.print(">> ������ �Ⱓ�� �Է����ּ���! ");
				aftercom = scan.next();
				workday = workday.replace(workday, aftercom);
				break;
				
			case 2: // 2���� ������ �ٷνð��� ����/
				System.out.println("@ 4�� �ٷνð��� �����մϴ�.");
				System.out.println("@ ����:00:00 ~ 00:00");
				System.out.print(">> ������ �ٷνð��� �Է����ּ���!");
				aftercom = scan.next();
				workhour = workhour.replace(workhour, aftercom);
				break;
				
			case 3: // 3���� ������ 5���׸� ���� �ٹ���,���Ͽ� ���� ����..!!!
				System.out.println("@ 5. �ٹ���/���� �׸��� �����մϴ�.");
				System.out.print(">> ������ �ٹ���/������ �Է����ּ���!");
				aftercom = scan.next();
				weekworkday = weekworkday.replace(weekworkday, aftercom);
				break;
				
			case 4: // 4���� ������ 6�� �ӱ��׸��� ����!!!
				System.out.println("@ 6. �ӱ� �׸��� �����մϴ�.");
				System.out.print(">> ������ �ݾ�(�ӱ�)�� �Է����ּ���!");
				aftercom = scan.next();
				money = money.replace(money, aftercom);
				break;
				
			case 5: // 5���� ������ ������ ����!!
				System.out.println("�ٷΰ�༭ ��������� �����մϴ�..");	
				break;
				
			default: // ���������ʴ� ��ȣ�� ������ ��� ��ȯ!!
				System.out.println("������ �κ��� �ٽ� �������ּ���!!");
				break;
			}
		// ������ ������ Ȯ���ϴ� �������� �ٽ� ����մϴ�!!!
			System.out.println("");
			System.out.println("@@ ������ ������ Ȯ���ϼ���!");
			String doc, doc0, doc1, doc2, doc3, doc4, doc5, doc6;
			doc1 = "1. �ٷΰ��Ⱓ : \t" + workday + "\n";
			doc2 = "2. �ٹ����: \t �׸����� 7��\n";
			doc3 = "3. ��������: \t ������\n";
			doc4 = "4. �ٷνð�: \t" + workhour + "\n";
			doc5 = "5. �ٹ���/����: \t" + weekworkday + "\n";
			doc6 = "6. �ӱ�: \t" + workmoneytype + " " + money + "\n";
			System.out.println(doc1 + doc2 + doc3 + doc4 + doc5 + doc6);
			System.out.println("");
		}
	}
//======================================�����׸�
	void main(String[] args) throws InterruptedIOException { 
		// �ٷΰ�༭�� �ҷ��������� �׸����� thread�� ���ݴϴ���
		String workday = "2019.05.25 ~ 2019.10.30"; // �ٷΰ��Ⱓ
		String workhour = "09:20 ~ 18:10"; // �ٷνð�
		String weekworkday = "�� 5�� �ٹ�"; // 5�� �ٹ��� �޹��� ex> �� 5��/ ����
		String workmoneytype = "����"; // �ñ��̳�? �����̳�? �����̳�??
		String money = "2,000,000 ��"; // ���ޱݾ�!!

		// ������ �ٷΰ�༭������ ����ϰ�....
		Scanner scan = new Scanner(System.in);
		System.out.print(">> �ٷ��� �̸��� �Է��ϼ��� : ");
		String name = scan.nextLine();
// ���������� ���..
		System.out.println("==> " + name + "���� �ٷΰ�༭������ ����մϴ�(ȸ��db���� �ҷ����Ƿ� 3~6�� �ҿ�˴ϴ�.)");
		System.out.println("");
		String doc, doc0, doc1, doc2, doc3, doc4, doc5, doc6;
		doc = "[[ �ٷ� ��༭ ]]  \n";
		doc0 = name + "(���� '��' �̶� ��)��  (��)���ֽ�ȸ��(���� '��'�̶� ��)�� ������ ���� �ٷΰ���� ü���Ѵ�. \n";
		doc1 = "1. �ٷΰ��Ⱓ : \t" + workday + "\n";
		doc2 = "2. �ٹ����: \t �׸����� 7��\n";
		doc3 = "3. ��������: \t ������\n";
		doc4 = "4. �ٷνð�: \t" + workhour + "\n";
		doc5 = "5. �ٹ���/����: \t" + weekworkday + "\n";
		doc6 = "6. �ӱ�: \t" + workmoneytype + " " + money + "\n";
// �ٷΰ�༭������ �����.
// 3�� �ڿ� thread�� �Ἥ ��¥ ��񿡼� �ҷ����� ��ó�� �ϱ�..		
		try {
			Thread.sleep(3 * 1000); // 3�� �ڿ� �ٷΰ�༭ ���� �ҷ����� ô�ϱ�..��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(doc + doc0 + doc1 + doc2 + doc3 + doc4 + doc5 + doc6);
// ���� �ٷΰ�༭ �ۼ��Ѱ��� �����ְ� ���....
// ��������� �ִ� �޴� ���..	
		int doccheck = 0; // 0�̸� �Ϻ��ϹǷ� ����!! 1�̸� ������������ ������� ����
		System.out.println("== ���� " + name + "���� �ٷΰ�༭�����ϴ� ==");
		System.out.print(">> ���������� �����Ű���(������0,������1)??? ");

		doccheck = scan.nextInt(); // ����ڷκ��� �ٷΰ�༭�� �����ִ� ������ ������ 0�� ���� ����
		// 1�� ���� ������� ��� // �� ���� ���� ������ �ٽùݺ�.!!
		if (doccheck == 0) { // �ٷΰ�༭������ Ȯ���� �ٸ� ������ ���� ��� �����Ų��.
			System.out.println("0�� Ȯ�α���� �����ϼ̽��ϴ�.");
			System.out.println("�ٷΰ�༭ Ȯ���� �����մϴ�.");

		} else if (doccheck == 1) { // 1���� ������ ��������� ����ִ� �޼ҵ� �����մϴ�.
			System.out.println("1�� �ٷΰ�༭ ������ �����ϼ̽��ϴ�.");
			System.out.println("�� �ý��� ���� ��밡���� ������ɵ��� �ҷ��ɴϴ�.");
			port_workagreement cd = new port_workagreement();
			cd.changedoc(); // �������� ����.

		} else { // 0���� 1�� ���� ��ȣ�� �������� �� �������� ���
			System.out.println("��ȣ�� �ٽ� �������ֽñ�ٶ��ϴ�.");
			System.out.println("������ ������ �����ø� 0��, ������ ������ �����ø� 1���� �����ּ���!!");
		}
	}
}
