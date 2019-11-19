// 환율....
interface Coin { // 환율비율 정보를 저장하는 인터페이스.
	double usa = 1200;
	double japan = 10 ;
	double china = 171;
}

public class port_exchangemenu2 {
	public static void main(String[] args) {
		System.out.println("환율은 " + Coin.japan + "원입니다.");
	}
}