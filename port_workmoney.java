import java.util.*;
//ok!
public class port_workmoney {
	void salarymoney() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 하루 일한 시간을 입력하세요");
		double a = scan.nextDouble();
		System.out.print(">> 한 달동안 일한 일 수를 입력하세요.");
		double b = scan.nextDouble();
		
		port_workmoney2 c = new port_workmoney2(a,b);
		c.salarycalc();
		System.out.println("급여는 "+ c.calcmoney()+"원 입니다.");

	}
}
