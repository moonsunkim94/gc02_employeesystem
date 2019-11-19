import java.util.InputMismatchException;
import java.util.Scanner;

// 환율 계산....
public class port_exchangemenu implements Coin {
	public void exchange() {

		Scanner scan = new Scanner(System.in);
		int haneulchoice = 0;

		int koreamoney; // 환율을 계산할 우리나라돈 입력
		double haneulmoney; // 환율계산완료한 돈

		while (haneulchoice != 4) {
			System.out.println("환율은 3개의 나라만 제공합니다.");
			System.out.println(">> 1. 일본  2. 중국  3. 미국 ");
			System.out.println(">> 4를 누르면 종료합니다.\t");
			System.out.print(">> 나라를 선택해주세요.\t");
			haneulchoice = scan.nextInt(); /// 환율 나라 선택

			switch (haneulchoice) {
			case 1: // 일본 환율 => 100엔이 1000원 :: 1엔이 10원
				System.out.println("일본 환율 계산을 선택하셨습니다.");
				System.out.print(">> 바꿀 돈을 입력하세요..\t");
				// 금액을 입력해야하는데,, 문자입력하면 예외처리발생시키기!!!!!
				try { // try catch문 활용!!
					koreamoney = scan.nextInt(); // a 3 5
				} catch (InputMismatchException ie) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					scan.next(); // 입력만 받고 저장은 하지 않음!!
					continue;
				}

				haneulmoney = koreamoney * japan;
				System.out.println(koreamoney + "엔은 " + haneulmoney + "원입니다.");
				break;

			case 2: // 중국 환율 :: 1위안이 171원
				System.out.println("중국 환율 계산을 선택하셨습니다.");
				System.out.print(">> 바꿀 돈을 입력하세요..\t");
				try { // try catch문 활용!!
					koreamoney = scan.nextInt(); // a 3 5
				} catch (InputMismatchException ie) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					scan.next(); // 입력만 받고 저장은 하지 않음!!
					continue;
				}
				haneulmoney = koreamoney * china;
				System.out.println(koreamoney + "위안은 " + haneulmoney + "원입니다.");
				break;

			case 3: // 미국 환율:: 1달러가 1200원 100달러가 120000
				System.out.println("미국 환율 계산을 선택하셨습니다.");
				System.out.print(">> 바꿀 돈을 입력하세요..\t");
				try { // try catch문 활용!!
					koreamoney = scan.nextInt(); // a 3 5
				} catch (InputMismatchException ie) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					scan.next(); // 입력만 받고 저장은 하지 않음!!
					continue;
				}
				haneulmoney = koreamoney * usa;
				System.out.println(koreamoney + "달러는 " + haneulmoney + "원입니다.");
				break;

			case 4: // 4을 누르면 환율 프로그램 종료 합니다...
				System.out.println("**환율 메뉴를 종료합니다**");
				break;

			default:
				System.out.println("회사에서 환율정보를 제공하는 것은 3개 나라뿐입니다.");
				System.out.println("일본, 중국, 미국 중 1가지를 선택해주세요.");
				break;

			}
		}
	}
}
