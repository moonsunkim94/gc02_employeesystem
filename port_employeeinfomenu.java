
// ���θ޴� �� 2�� ���������޴��� ���� Ŭ���������Դϴ�.
// �������,������ȸ ����� �����ϰ� �� ������.
// �迭���� ArrayList�� Ȱ���ؼ� ����� �����Դϴ�.

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// ���������޴������Դϴ�!!----------------------------------------------
public class port_employeeinfomenu {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // �Է°��� �ޱ� ���� scanner�� ���.
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));

		int SelectNumber = 0; // ���α׷� ���۽� ���⿡�� ������ ����.
		// �����̸��� �����ȣ, ��ȭ��ȣ, �̸����� �ʱ�ȭ�Ѵ�.
		int emp_Num = 0;
		String emp_Name = " ";
		int emp_Phone = 0;
		String emp_Email = " ";

		int delete_Num = 0;
// ArrayList�� ���������� ����ϱ� ���� 3���� �����Ѵ�...
// �迭�� �����ؼ� ArrayList�� �����ؼ� ����Ϸ������� �ǹ��� �������� üũ�ȴ�..
// ���̰��� ���� �ϴ÷� ������... �ٷ� ArrayList�� ����Ѵ�.
		// �̸��̴ϱ� String
		ArrayList<String> list1 = new ArrayList<String>(); // ���� �̸��� ���� ArrayList ������
		// ��ȭ��ȣ�ϱ� integer�� ...
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // ���� ��ȭ��ȣ�� ���� ArrayList �����Ԥ�
		// �̸����̴ϱ� String�� �����ֵ���..�ؾ��Ѵ�...!!
		ArrayList<String> list3 = new ArrayList<String>(); // ���� �̸����ּҿ� ���� ArrayList ������
		// 999���� arrayList�� ���� �ʱ�ȭ ���ִ� �۾�
		// ������ �� 1000�� �ޱ�� �Ѵ�..
		// �� �̻��� ����� �����Ѵ�.. 1000�� ���پ�...
		for (int a = 1; a < 1000; a++) { // �����������/
			list1.add("null"); // �̸�
			list2.add(0); // ��ȭ��ȣ
			list3.add("null"); // �̸���
		}

		System.out.println("");
		System.out.println("         [[ ���� ���� �޴� ]]");

		while (true) { // ���� ����
			// ���������޴��� ���� ���θ޴��׸��� ����մϴ�.
			System.out.println("------------ ���� ------------");
			System.out.println("       1. ���� ���� ���");
			System.out.println("       2. ���� ����Ʈ ���");
			System.out.println("       3. ���� �˻�");
			System.out.println("       4. ���� ����");
			System.out.println("       5. ���α׷� ����(exit)");
			System.out.println("-----------------------------");
			System.out.println("������ �Ͻðڽ��ϱ�?  ");
			System.out.print("���� ���⿡�� �ش� ��ȣ�� ã�� �Է��Ͻʽÿ�. >>");
			// �Է��Ͻÿ�....
			SelectNumber = input.nextInt(); // ���������޴� �ȿ� �ִ� �޴� ��ȣ ���� �Է¶�.

// 1���� ������� ��µǴ� �׸��̴�. ���������� ����ϰڴ�.
			if (SelectNumber == 1) { 
				System.out.println("");
				System.out.println("** ���� ���� ��� **");
				// 1.
				while (true) { // while 1���� �����ȣ
					System.out.print(">> ��� ��ȣ �Է�(1~999)");
					emp_Num = input.nextInt();
					if (emp_Num < 1000 && emp_Num > 0) // 1���� 999������ ���� �Է����� ������ �ٽ� �Է¹޴´�.
						break;
				}
				// 2.
				while (true) { // while 2���� �̸�
					System.out.print(">> ���� �̸� �Է�(�ѱ� 2~4��)");
					try {
						emp_Name = dis.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					if (emp_Name.length() < 5 && emp_Name.length() > 1)
						// �̸��� 2��~4�� �Է°���...
						break;
				}
				// 3.
				System.out.print(">> ���� ��ȭ��ȣ �Է�(ex)01012345678/- ����):");
				emp_Phone = input.nextInt(); 
				// 4. 
				System.out.print(">> ���� �̸��� �ּҸ� �Է�(ex)abc1234@naver.com):");
				emp_Email = input.next();

				list1.set(emp_Num, emp_Name);
				list2.set(emp_Num, emp_Phone);
				list3.set(emp_Num, emp_Email);

				System.out.println("�������� ����� �Ϸ��߽��ϴ�!!");
				System.out.println("");
				continue;

			}

// 2�� ��������Ʈ ��� �޴��̴�..
// 2���� ���� ���, ��ϵǾ��ִ� ��� �������� ��µȴ�.!!
			if (SelectNumber == 2) { // 2.��� ���� ���� ���
				System.out.println("");
				System.out.println("** ���� ����Ʈ ��� **");

				int number = 1;
				for (int i = 0; i < list1.size(); i++) {

					if (list1.get(i) == "null")
						continue;
					System.out.print("(" + number + ") ");
					number++;
					System.out.print("������ȣ : " + i);
					System.out.print(" / �̸� : " + list1.get(i));
					System.out.print(" / ��ȭ��ȣ : " + list2.get(i));
					System.out.println(" / �̸����ּ� : " + list3.get(i));
				}
				continue;
			}
			
// 3�� �����˻��� �ϴ� �޴��̴�.
// �˻������� ������ �����Ͱ���..
// ��.. �����ȣ,�̸�,��ȭ��ȣ,�̸����ּ�.. ��� �����ϰ� �غ� �����̴�..
// 		
			if (SelectNumber == 3) { // 3. ���� �˻�
				System.out.println("");

				int temp = 0;

				System.out.println("**** ���� �˻� ****");
				System.out.println("");
				System.out.println("���� �� ���ϴ� �˻� ������ �Է��ϼ���.(1~4�� ����)");
				System.out.println("1. ��� ��ȣ�� �˻�");
				System.out.println("2. �̸����� �˻� ");
				System.out.println("3. ��ȭ��ȣ�� �˻�");
				System.out.println("4. �̸��� �ּҷ� �˻�");
				System.out.print(">> ������ �Է��ϼ��� :  ");
				temp = input.nextInt(); // � ������ ������ ���ΰ� ��������
				
				// 1�� ��� ��ȣ �������� �˻�
				if (temp == 1) { 
					System.out.print("�˻��� ��� ��ȣ �Է� : ");
					int num1 = input.nextInt();

					String s1 = list1.get(num1);
					int s2 = list2.get(num1);
					String s3 = list3.get(num1);
					// �˻������ ����Ѵ�...
					System.out.println("< �˻���� >");
					System.out.println("��� ��ȣ :" + num1 + " / ��� �̸� : " 
							+ s1 + " / ��ȭ��ȣ : " + s2 + " / �̸��� : " + s3);
				}

				// 2�� �̸� �������� ����� �˻��ϰ� �Ѵ�.
				if (temp == 2) { 
					System.out.print("�˻��� ��� �̸� �Է�: ");

					String name1 = input.next();
					int index = list1.indexOf(name1);
					String s1 = list1.get(index);
					int s2 = list2.get(index);
					String s3 = list3.get(index);
					// �˻������ ����Ѵ�...
					System.out.println("< �˻���� >");
					System.out.println("��� ��ȣ : " + index + " / ��� �̸� : " 
							+ s1 + " / ��ȭ��ȣ : " + s2 + " / �̸��� : " + s3);
					System.out.println("");
				}
				
				// 3�� ��ȭ��ȣ�� �˻� ����
				if (temp == 3) { 
					System.out.print("�˻��� ��� ��ȭ ��ȣ �Է�: ");
					int phone1 = input.nextInt();
					int index = list2.indexOf(phone1);
					String s1 = list1.get(index);
					int s2 = list2.get(index);
					String s3 = list3.get(index);
					// �˻������ ����Ѵ�...
					System.out.println("< �˻���� >");
					System.out.println("��� ��ȣ : " + index + " / ��� �̸� : " 
							+ s1 + " / ��ȭ��ȣ : " + s2 + " / �̸��� : " + s3);
					System.out.println("");
				}
				
				// 4�� �̸��� �ּҷ� �˻� ����
				if (temp == 4) { 
					System.out.print("�˻��� ����� �̸��� �ּҸ� �Է�: ");
					String email1 = input.next();
					int index = list3.indexOf(email1);
					String s1 = list1.get(index);
					int s2 = list2.get(index);
					String s3 = list3.get(index);
					// �˻������ ����Ѵ�...
					System.out.println("< �˻���� >");
					System.out.println("��� ��ȣ : " + index + " / ��� �̸� : " 
							+ s1 + " / ��ȭ��ȣ : " + s2 + " / �̸��� : " + s3);
					System.out.println("");

				}
				continue;
			}  // 3�� �����˻��� ���� �׸� if�� ����
			
			// 4�� ���������� �ϰڴ�.. �����ϸ� �־�ߵǴ� �޴�.!
			if (SelectNumber == 4) { // 4.���� ����
				System.out.println("");
				System.out.println("** ���� ���� **");
				System.out.println("�����ϰ� ���� ������ ��ȣ�� �Է��ϼ���.");
				System.out.println("(���� ��ȣ�� �𸣸� ���� �˻� ����� �̿��Ͽ� ��ȣ�� �Է��Ͻʽÿ�.)");

				int number1 = input.nextInt();

				list1.remove(number1);
				list2.remove(number1);
				list3.remove(number1);
				list1.add(number1, "null"); // remove()�� �����ϰ� ���� �ε������� �ϳ��� �پ��� ������ ���� ����.
				list2.add(number1, 0);
				list3.add(number1, "null");

				// ���� �Ϸ� !!
				System.out.println("���� �Ϸ� !");
				continue;
			}
			//  5���� ������ ���������޴� ��2��2!!
			if (SelectNumber == 5) {
				break;
			}
		}
		System.out.println("...�����������α׷��� �����մϴ�...");
		System.out.println("");
	}
}
