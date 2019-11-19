// 메인메뉴에서 1번을 선택했을 시, 실행되는 클래스입니다!!
// 근로계약서 확인 및 수정 항목입니다.
// 1번 근로계약서를 출력하고  맞지않는 것이 확인되면 StringBuffer기능을 통해 수정가능하게끔....
import java.io.InterruptedIOException;
import java.util.*;
//ok
public class port_workagreement extends Thread {

	String workday = "2019.05.25 ~ 2019.10.30"; // 근로계약기간
	String workhour = "09:20 ~ 18:10"; // 근로시간
	String weekworkday = "주 5일 근무"; // 5번 근무일 휴무일 ex> 주 5일/ 주중
	String workmoneytype = "월급"; // 시급이냐? 월급이냐? 연봉이냐??
	String money = "2,000,000 원"; // 월급금액!!
	//port_workagreement pwa = new port_workagreement();
//===============근로계약서 수정메뉴
	void changedoc() {
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ");

		System.out.println(">> 편집 1가지 기능을 제공하고 있으며 다른 것을 편집하고자 하면 인사부로 방문해주시기바랍니다.");

		System.out.println("*********************************************");
		System.out.println("       Only 수정 기능만 있습니다!!");
		System.out.println("*********************************************");
		int choicemun = 0;
		while (choicemun != 5) {
			System.out.println("");
			System.out.println("수정할 부분을 checking!! ");
			System.out.println("====================================");
			System.out.println("            ①. 근로계약기간 ");
			System.out.println("            ②. 근로시간");
			System.out.println("            ③. 근무일/휴일");
			System.out.println("            ④. 임금");
			System.out.println("            ⑤. 종료");
			System.out.println("");
			System.out.println("  # 2.근무장소와 3.업무내용은 수정불가입니다 #   ");
			System.out.println("====================================");
			System.out.print("수정할 항목을 선택해주세요(입력) >>");

			choicemun = scan.nextInt();
			String aftercom = null;  // 사용자가 직접 변경할 내용을 입력받는 변수.

			switch (choicemun) {
			case 1: // 1번을 누르면 근로계약기간을 수정.,
				System.out.println("@ 1번 근로계약기간 항목을 수정합니다.");
				System.out.println("@ 형식:0000.00.00 ~ 0000.00.00");
				System.out.print(">> 변경할 기간을 입력해주세요! ");
				aftercom = scan.next();
				workday = workday.replace(workday, aftercom);
				break;
				
			case 2: // 2번을 누르면 근로시간을 수정/
				System.out.println("@ 4번 근로시간을 수정합니다.");
				System.out.println("@ 형식:00:00 ~ 00:00");
				System.out.print(">> 변경할 근로시간을 입력해주세요!");
				aftercom = scan.next();
				workhour = workhour.replace(workhour, aftercom);
				break;
				
			case 3: // 3번을 누르면 5번항목에 대한 근무일,휴일에 대해 수정..!!!
				System.out.println("@ 5. 근무일/휴일 항목을 수정합니다.");
				System.out.print(">> 변경할 근무일/휴일을 입력해주세요!");
				aftercom = scan.next();
				weekworkday = weekworkday.replace(weekworkday, aftercom);
				break;
				
			case 4: // 4번을 누르면 6번 임금항목을 수정!!!
				System.out.println("@ 6. 임금 항목을 수정합니다.");
				System.out.print(">> 변경할 금액(임금)을 입력해주세요!");
				aftercom = scan.next();
				money = money.replace(money, aftercom);
				break;
				
			case 5: // 5번을 누르면 종료기능 실행!!
				System.out.println("근로계약서 수정기능을 종료합니다..");	
				break;
				
			default: // 제공하지않는 번호를 눌렀을 경우 반환!!
				System.out.println("수정할 부분을 다시 선택해주세요!!");
				break;
			}
		// 수정한 내용을 확인하는 차원에서 다시 출력합니다!!!
			System.out.println("");
			System.out.println("@@ 수정한 내용을 확인하세요!");
			String doc, doc0, doc1, doc2, doc3, doc4, doc5, doc6;
			doc1 = "1. 근로계약기간 : \t" + workday + "\n";
			doc2 = "2. 근무장소: \t 그린빌딩 7층\n";
			doc3 = "3. 업무내용: \t 개발직\n";
			doc4 = "4. 근로시간: \t" + workhour + "\n";
			doc5 = "5. 근무일/휴일: \t" + weekworkday + "\n";
			doc6 = "6. 임금: \t" + workmoneytype + " " + money + "\n";
			System.out.println(doc1 + doc2 + doc3 + doc4 + doc5 + doc6);
			System.out.println("");
		}
	}
//======================================메인항목
	void main(String[] args) throws InterruptedIOException { 
		// 근로계약서를 불러오기위한 항목으로 thread를 써줍니더ㅏ
		String workday = "2019.05.25 ~ 2019.10.30"; // 근로계약기간
		String workhour = "09:20 ~ 18:10"; // 근로시간
		String weekworkday = "주 5일 근무"; // 5번 근무일 휴무일 ex> 주 5일/ 주중
		String workmoneytype = "월급"; // 시급이냐? 월급이냐? 연봉이냐??
		String money = "2,000,000 원"; // 월급금액!!

		// 기존의 근로계약서내용을 출력하고....
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 근로자 이름을 입력하세요 : ");
		String name = scan.nextLine();
// ㅎㅎ쓰레드 사용..
		System.out.println("==> " + name + "님의 근로계약서내용을 출력합니다(회사db에서 불러오므로 3~6초 소요됩니다.)");
		System.out.println("");
		String doc, doc0, doc1, doc2, doc3, doc4, doc5, doc6;
		doc = "[[ 근로 계약서 ]]  \n";
		doc0 = name + "(이하 '갑' 이라 함)과  (주)선주식회사(이하 '을'이라 함)은 다음과 같이 근로계약을 체결한다. \n";
		doc1 = "1. 근로계약기간 : \t" + workday + "\n";
		doc2 = "2. 근무장소: \t 그린빌딩 7층\n";
		doc3 = "3. 업무내용: \t 개발직\n";
		doc4 = "4. 근로시간: \t" + workhour + "\n";
		doc5 = "5. 근무일/휴일: \t" + weekworkday + "\n";
		doc6 = "6. 임금: \t" + workmoneytype + " " + money + "\n";
// 근로계약서내용을 출력함.
// 3초 뒤에 thread를 써서 진짜 디비에서 불러오는 것처럼 하기..		
		try {
			Thread.sleep(3 * 1000); // 3초 뒤에 근로계약서 내용 불러오는 척하기..ㅎ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(doc + doc0 + doc1 + doc2 + doc3 + doc4 + doc5 + doc6);
// 기존 근로계약서 작성한것을 보여주고 물어봄....
// 수정기능이 있는 메뉴 출력..	
		int doccheck = 0; // 0이면 완벽하므로 종료!! 1이면 수정선택으로 수정기능 실행
		System.out.println("== 이하 " + name + "님의 근로계약서였습니다 ==");
		System.out.print(">> 수정사항이 있으신가요(없으면0,있으면1)??? ");

		doccheck = scan.nextInt(); // 사용자로부터 근로계약서에 써져있는 사항이 맞으면 0을 눌러 종료
		// 1을 눌러 수정기능 출력 // 그 외의 것을 누르면 다시반복.!!
		if (doccheck == 0) { // 근로계약서내용을 확인해 다른 사항이 없을 경우 종료시킨다.
			System.out.println("0번 확인기능을 선택하셨습니다.");
			System.out.println("근로계약서 확인을 종료합니다.");

		} else if (doccheck == 1) { // 1번을 누르면 수정기능이 담겨있는 메소드 실행합니다.
			System.out.println("1번 근로계약서 수정을 선택하셨습니다.");
			System.out.println("현 시스템 내에 사용가능한 수정기능들을 불러옵니다.");
			port_workagreement cd = new port_workagreement();
			cd.changedoc(); // 문서내용 수정.

		} else { // 0번과 1번 외의 번호를 선택했을 때 오류내용 출력
			System.out.println("번호를 다시 선택해주시기바랍니다.");
			System.out.println("수정할 내용이 없으시면 0번, 수정할 내용이 있으시면 1번을 눌러주세요!!");
		}
	}
}
