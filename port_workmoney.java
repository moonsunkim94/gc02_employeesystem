import java.util.*;
//ok!
public class port_workmoney {
	void salarymoney() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> �Ϸ� ���� �ð��� �Է��ϼ���");
		double a = scan.nextDouble();
		System.out.print(">> �� �޵��� ���� �� ���� �Է��ϼ���.");
		double b = scan.nextDouble();
		
		port_workmoney2 c = new port_workmoney2(a,b);
		c.salarycalc();
		System.out.println("�޿��� "+ c.calcmoney()+"�� �Դϴ�.");

	}
}
