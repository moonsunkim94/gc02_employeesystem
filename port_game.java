import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class port_game {
// 첫번째 게임 로또입니다!!
	void game1Lotto() { // 로또
		System.out.println("Lotto 게임을 시작합니다!!");
		System.out.println("이번주 대박을 꿈꾸세요!!");
		System.out.print("이번주 행운의 번호는 ");
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}

		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.print(list);
		System.out.println(" 입니다.");
	}

// 두 번째 겜블링
	void game2Gambling() {
		System.out.println();
		System.out.println("Gambling 게임을 시작합니다!!");
		System.out.println("이기는 편, 내 편~~!!!");
		System.out.println("진 사람은 이긴 사람한테 점심 쏘기.ㅋㅋ");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		String name1, name2;
		int starttime1, endtime1, result1, starttime2, endtime2, result2;
		System.out.print(">> [Player1] 이름을 입력하세요");
		name1 = scan.nextLine();
		System.out.print(">> [Player2] 이름을 입력하세요");
		name2 = scan.nextLine();

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.println("[" + name1 + "] 시작 <Enter>키>> ");
		scan.nextLine();
		starttime1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + starttime1);
		System.out.println("10초 예상 후 <Enter>키>>");
		scan.nextLine();
		endtime1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + endtime1);

		System.out.println("[" + name2 + "] 시작 <Enter>키>> ");
		scan.nextLine();
		starttime2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + starttime2);
		System.out.println("10초 예상 후 <Enter>키>>");
		scan.nextLine();
		endtime2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + endtime2);

		// 결과
		result1 = (endtime1 > starttime1) ? (endtime1 - starttime1) : ((endtime1 + 60) - starttime1);

		result2 = (endtime2 > starttime2) ? (endtime2 - starttime2) : ((endtime2 + 60) - starttime2);
		System.out.println("[" + name1 + "] 결과: " + result1 + ", [" + name2 + "] 결과: " + result2 + " ");

		if (Math.abs(10 - result1) < Math.abs(10 - result2)) {
			System.out.println("승자는 " + name1 + "!");
		} else if (Math.abs(10 - result1) == Math.abs(10 - result2)) {
			System.out.println("무승부");
		} else {
			System.out.println("승자는 " + name2 + "!");
		}
		System.out.println("♬♩한치 두치 세치 네치 뿌꾸빠뿌꾸빵~♬♪\r\n" + "♬한치 두치 세치 네치 뿌꾸뿌꾸빵빵~♬♪");
		System.out.println();
	}

	
}
