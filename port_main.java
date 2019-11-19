import java.util.*;
import java.io.InterruptedIOException;
import java.sql.Time;
import java.time.*;
//ok
public class port_main {
	// ��¥������ִ� �޼ҵ��Դϴ�!!
	public static void printCalendar(String msg, Calendar cal) {
		// ���� ��¥ ������ִ� �κ�!!!!
		int year = cal.get(Calendar.YEAR); // �⵵
		int month = cal.get(Calendar.MONTH) + 1; // ��
		int day = cal.get(Calendar.DAY_OF_MONTH); // ��
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //
		int hour = cal.get(Calendar.HOUR);// �ð�
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		// �⵵���� ���ϱ��� ���!
		System.out.print(msg + year + "�� " + month + "��" + day + "�� ");
		// ������~�Ͽ��� ��� �ȳ���.
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("�Ͽ��� ");
			break;
		case Calendar.MONDAY:
			System.out.print("������ ");
			break;
		case Calendar.TUESDAY:
			System.out.print("ȭ���� ");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("������ ");
			break;
		case Calendar.THURSDAY:
			System.out.print("����� ");
			break;
		case Calendar.FRIDAY:
			System.out.print("�ݿ��� ");
			break;
		case Calendar.SATURDAY:
			System.out.print("����� ");
			break;
		} // ���Ϸ� ������ִ� case�� ��!
			// �������� �������� �Ǻ�!!
		if (ampm == Calendar.AM) {
			System.out.print("����");
		} else {
			System.out.print("����");
		}
		// ���� ��,��,�� ���
		System.out.println(hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
	} // ���� ��¥ ������ִ� �κ� ��!!!!!

	// ���� ���α׷�!!
	public static void main(String[] args) throws InterruptedIOException {
		// ���α׷� ���� �ȳ���
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��     	ȸ�纹�����α׷������Ű���ȯ���մϴ�         ��");
		System.out.println("��������������������������������������������������������������������������");
		// ���� ��¥ �ȳ� (������ ----�� --�� --�� --���� --�� --�� --�� �Դϴ�.)
		Calendar now = Calendar.getInstance();
		printCalendar("������ ", now);
		System.out.println("****************************************");

		// \\\\\\\
		Scanner scan = new Scanner(System.in);
		int menuchoice = 0;
		while (menuchoice != 6) {
			System.out.println("������������������������������������������������������������������������");
			System.out.println("��          Plz Select Menu         ��");
			System.out.println("��                                  ��");
			System.out.println("��         1�ٷΰ�༭ Ȯ�� �� ����                     ��");
			System.out.println("��             2��������                                 ��");
			System.out.println("��             3�޿����                                 ��");
			System.out.println("��             4ȯ�����                                 ��");
			System.out.println("��             5�����                                 ��");
			System.out.println("��             6�����ϱ�                                 ��");
			System.out.println("������������������������������������������������������������������������");

			System.out.print(">> �޴��� �������ּ���.");
			menuchoice = scan.nextInt();

			switch (menuchoice) {			
			case 1: // �ٷΰ�༭ó��....�ٷΰ�༭ //����!!!!!!!!
				System.out.println("1�� �ٷΰ�༭ Ȯ�ι׼����޴��� �����ϼ̽��ϴ�.");
				port_workagreement pwa = new port_workagreement();
				pwa.main(args);
				break;
				
				
			case 2: // ���� ����
				System.out.println("2�� ���������� �����ϼ̽��ϴ�!");
				port_employeeinfomenu pei = new port_employeeinfomenu();
				pei.main(args);
				break;
				
						
			case 3: // �޿����...... ��� �̿�(�߻�޼ҵ�..)�� math����...
				System.out.println("5�� �޿����޴��� �����ϼ̽��ϴ�.");
				port_workmoney pw = new port_workmoney();
				pw.salarymoney();
				break; // �Ϸ�!!
				
			case 4: // ȯ����� // interface/ implements Ȱ��  
				System.out.println("6�� ���尡�� �����е��� ���� ���� ȯ������� �����ϼ̱���!!");
				port_exchangemenu pe = new port_exchangemenu(); // port_exchangemenu.java���ִ°�.
				pe.exchange();
				break;
				// �Ϸ�!!
				
			case 5: // �̴ϰ���(�ζǰ���)�� �׺�...����� �޴�..ȸ������.....
				// �ζǰ����� mathȰ��
				// �׺�������
				// ��������� hashmap �̿�
				System.out.println("7�� ����� �޴��� �����ϼ̽��ϴ�.");
				System.out.println("����� �޴������� 3���� ������ �����Ͻ� �� �ֽ��ϴ�.");	
				System.out.println("--------------------------------------");
				System.out.println("       1.�ζ�      2. �ð����߱�        3. ����");
				System.out.println("--------------------------------------"); 
				System.out.println("**4���� ������ ����˴ϴ�.");
				
				int gamechoice=0;
				System.out.print(">> ������ ������ �������ּ���.");
				
				gamechoice=scan.nextInt();
				port_game pg = new port_game();
				port_CapitalGame pcg = new port_CapitalGame();
				
				if(gamechoice==1) { // game 1�� ����
					pg.game1Lotto();
				} else if(gamechoice==2) {
					pg.game2Gambling();
				} else if(gamechoice==3) {
			
					pcg.run();			
				} else if(gamechoice==4) {
					break;
				} else {
					System.out.println("��ȣ�� �ٽ� �����ϼ���!!");
				}
				break;
				
			case 6: // ���α׷� ��ü�� ����!!!
				System.out.println("**ȸ�纹�����α׷��� �����մϴ�**");
				break;
				
			default:
				System.out.println("ȸ�纹�����α׷����� �����ϴ� �޴��� 7�������Դϴ�...");
				System.out.println("�ٸ� �޴��� �������ֽñ�ٶ��ϴ�...");
				System.out.println("���α׷��� ��� �����ϵ��� �ϰڽ��ϴ�!!!");
				break;	

			}
		}
	}
}
