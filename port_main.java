import java.util.*;
import java.io.InterruptedIOException;
import java.sql.Time;
import java.time.*;
//ok
public class port_main {
	// 날짜계산해주는 메소드입니다!!
	public static void printCalendar(String msg, Calendar cal) {
		// 오늘 날짜 계산해주는 부분!!!!
		int year = cal.get(Calendar.YEAR); // 년도
		int month = cal.get(Calendar.MONTH) + 1; // 월
		int day = cal.get(Calendar.DAY_OF_MONTH); // 일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //
		int hour = cal.get(Calendar.HOUR);// 시간
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		// 년도부터 요일까지 출력!
		System.out.print(msg + year + "년 " + month + "월" + day + "일 ");
		// 월요일~일요일 출력 안내문.
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일 ");
			break;
		case Calendar.MONDAY:
			System.out.print("월요일 ");
			break;
		case Calendar.TUESDAY:
			System.out.print("화요일 ");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일 ");
			break;
		case Calendar.THURSDAY:
			System.out.print("목요일 ");
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일 ");
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일 ");
			break;
		} // 요일로 출력해주는 case문 끝!
			// 오전인지 오후인지 판별!!
		if (ampm == Calendar.AM) {
			System.out.print("오전");
		} else {
			System.out.print("오후");
		}
		// 현재 시,분,초 출력
		System.out.println(hour + "시 " + minute + "분 " + second + "초 입니다.");
	} // 오늘 날짜 계산해주는 부분 끝!!!!!

	// 메인 프로그램!!
	public static void main(String[] args) throws InterruptedIOException {
		// 프로그램 실행 안내문
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│     	회사복지프로그램에오신것을환영합니다         │");
		System.out.println("└───────────────────────────────────┘");
		// 오늘 날짜 안내 (오늘은 ----년 --월 --일 --요일 --시 --분 --초 입니다.)
		Calendar now = Calendar.getInstance();
		printCalendar("오늘은 ", now);
		System.out.println("****************************************");

		// \\\\\\\
		Scanner scan = new Scanner(System.in);
		int menuchoice = 0;
		while (menuchoice != 6) {
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("│          Plz Select Menu         │");
			System.out.println("│                                  │");
			System.out.println("│         1근로계약서 확인 및 수정                     │");
			System.out.println("│             2직원관리                                 │");
			System.out.println("│             3급여계산                                 │");
			System.out.println("│             4환율계산                                 │");
			System.out.println("│             5쉬어가기                                 │");
			System.out.println("│             6종료하기                                 │");
			System.out.println("└──────────────────────────────────┘");

			System.out.print(">> 메뉴를 선택해주세요.");
			menuchoice = scan.nextInt();

			switch (menuchoice) {			
			case 1: // 근로계약서처럼....근로계약서 //왆료!!!!!!!!
				System.out.println("1번 근로계약서 확인및수정메뉴를 선택하셨습니다.");
				port_workagreement pwa = new port_workagreement();
				pwa.main(args);
				break;
				
				
			case 2: // 직원 관리
				System.out.println("2번 직원관리를 선택하셨습니다!");
				port_employeeinfomenu pei = new port_employeeinfomenu();
				pei.main(args);
				break;
				
						
			case 3: // 급여계산...... 상속 이용(추상메소드..)와 math에서...
				System.out.println("5번 급여계산메뉴를 선택하셨습니다.");
				port_workmoney pw = new port_workmoney();
				pw.salarymoney();
				break; // 완료!!
				
			case 4: // 환율계산 // interface/ implements 활용  
				System.out.println("6번 출장가는 직원분들을 위한 서비스 환율계산을 선택하셨군요!!");
				port_exchangemenu pe = new port_exchangemenu(); // port_exchangemenu.java에있는거.
				pe.exchange();
				break;
				// 완료!!
				
			case 5: // 미니게임(로또게임)과 겜블링...쉬어가는 메뉴..회사퀴즈.....
				// 로또게임은 math활용
				// 겜블링게임은
				// 퀴즈게임은 hashmap 이용
				System.out.println("7번 쉬어가는 메뉴를 선택하셨습니다.");
				System.out.println("쉬어가는 메뉴에서는 3가지 게임을 선택하실 수 있습니다.");	
				System.out.println("--------------------------------------");
				System.out.println("       1.로또      2. 시간맞추기        3. 퀴즈");
				System.out.println("--------------------------------------"); 
				System.out.println("**4번을 누르면 종료됩니다.");
				
				int gamechoice=0;
				System.out.print(">> 시작할 게임을 선택해주세요.");
				
				gamechoice=scan.nextInt();
				port_game pg = new port_game();
				port_CapitalGame pcg = new port_CapitalGame();
				
				if(gamechoice==1) { // game 1번 선택
					pg.game1Lotto();
				} else if(gamechoice==2) {
					pg.game2Gambling();
				} else if(gamechoice==3) {
			
					pcg.run();			
				} else if(gamechoice==4) {
					break;
				} else {
					System.out.println("번호를 다시 선택하세요!!");
				}
				break;
				
			case 6: // 프로그램 자체를 종료!!!
				System.out.println("**회사복지프로그램을 종료합니다**");
				break;
				
			default:
				System.out.println("회사복지프로그램에서 제공하는 메뉴는 7번까지입니다...");
				System.out.println("다른 메뉴를 선택해주시기바랍니다...");
				System.out.println("프로그램은 계속 개발하도록 하겠습니다!!!");
				break;	

			}
		}
	}
}
