import java.util.*;
//ok!
class port_workmoney2 extends port_workmoney1 {
	Scanner scan = new Scanner(System.in);
	double workhour = 1;
	double workday = 1;

	void salarycalc() {
		System.out.println("�޿��� ����մϴ�.(�����ñ��� 8,350��)");
	}

	public port_workmoney2(double workhour, double workday) { // wh �Ϸ����� �ð� // wd �Ѵ����Ѽ�..
		this.workday = workday;
		this.workhour = workhour;
	}

	public double calcmoney() { // �޼��� �������̵�

		return minimumwage * workhour * workday;
	}
}
