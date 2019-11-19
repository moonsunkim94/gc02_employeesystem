import java.util.*;
//ok!
class port_workmoney2 extends port_workmoney1 {
	Scanner scan = new Scanner(System.in);
	double workhour = 1;
	double workday = 1;

	void salarycalc() {
		System.out.println("급여를 계산합니다.(최저시급은 8,350원)");
	}

	public port_workmoney2(double workhour, double workday) { // wh 하루일한 시간 // wd 한달일한수..
		this.workday = workday;
		this.workhour = workhour;
	}

	public double calcmoney() { // 메서드 오버라이딩

		return minimumwage * workhour * workday;
	}
}
