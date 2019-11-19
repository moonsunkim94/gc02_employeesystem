
// 메인메뉴 중 2번 직원관리메뉴에 대한 클래스파일입니다.
// 직원등록,직원조회 등등을 가능하게 할 예정임.
// 배열말고 ArrayList를 활용해서 사용할 예정입니다.

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// 직원관리메뉴메인입니다!!----------------------------------------------
public class port_employeeinfomenu {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // 입력값을 받기 위해 scanner를 사용.
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));

		int SelectNumber = 0; // 프로그램 시작시 보기에서 선택을 받음.
		// 직원이름과 사원번호, 전화번호, 이메일을 초기화한다.
		int emp_Num = 0;
		String emp_Name = " ";
		int emp_Phone = 0;
		String emp_Email = " ";

		int delete_Num = 0;
// ArrayList로 직원정보를 등록하기 위해 3개를 선언한다...
// 배열을 선언해서 ArrayList로 변경해서 사용하려했지만 의문의 빨간줄이 체크된다..
// 고이고이 접어 하늘로 보낸다... 바로 ArrayList를 사용한다.
		// 이름이니깐 String
		ArrayList<String> list1 = new ArrayList<String>(); // 직원 이름에 대한 ArrayList 선언함
		// 전화번호니깐 integer를 ...
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // 직원 전화번호에 대한 ArrayList 선언함ㄴ
		// 이메일이니깐 String을 정해주도록..해야한다...!!
		ArrayList<String> list3 = new ArrayList<String>(); // 직원 이메일주소에 대한 ArrayList 선언함
		// 999개의 arrayList의 방을 초기화 해주는 작업
		// 직원은 딱 1000명만 받기로 한다..
		// 그 이상의 명수는 생략한다.. 1000명도 많다아...
		for (int a = 1; a < 1000; a++) { // 직원정보등록/
			list1.add("null"); // 이름
			list2.add(0); // 전화번호
			list3.add("null"); // 이메일
		}

		System.out.println("");
		System.out.println("         [[ 직원 관리 메뉴 ]]");

		while (true) { // 무한 루프
			// 직원관리메뉴에 대한 세부메뉴항목을 출력합니다.
			System.out.println("------------ 보기 ------------");
			System.out.println("       1. 직원 정보 등록");
			System.out.println("       2. 직원 리스트 출력");
			System.out.println("       3. 직원 검색");
			System.out.println("       4. 직원 삭제");
			System.out.println("       5. 프로그램 종료(exit)");
			System.out.println("-----------------------------");
			System.out.println("무엇을 하시겠습니까?  ");
			System.out.print("위의 보기에서 해당 번호를 찾아 입력하십시오. >>");
			// 입력하시오....
			SelectNumber = input.nextInt(); // 직원관리메뉴 안에 있는 메뉴 번호 선택 입력란.

// 1번을 누를경우 출력되는 항목이다. 직원정보를 등록하겠다.
			if (SelectNumber == 1) { 
				System.out.println("");
				System.out.println("** 직원 정보 등록 **");
				// 1.
				while (true) { // while 1번문 사원번호
					System.out.print(">> 사원 번호 입력(1~999)");
					emp_Num = input.nextInt();
					if (emp_Num < 1000 && emp_Num > 0) // 1부터 999사이의 값을 입력하지 않으면 다시 입력받는다.
						break;
				}
				// 2.
				while (true) { // while 2번문 이름
					System.out.print(">> 직원 이름 입력(한글 2~4자)");
					try {
						emp_Name = dis.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					if (emp_Name.length() < 5 && emp_Name.length() > 1)
						// 이름이 2자~4자 입력가능...
						break;
				}
				// 3.
				System.out.print(">> 직원 전화번호 입력(ex)01012345678/- 생략):");
				emp_Phone = input.nextInt(); 
				// 4. 
				System.out.print(">> 직원 이메일 주소를 입력(ex)abc1234@naver.com):");
				emp_Email = input.next();

				list1.set(emp_Num, emp_Name);
				list2.set(emp_Num, emp_Phone);
				list3.set(emp_Num, emp_Email);

				System.out.println("직원정보 등록을 완료했습니다!!");
				System.out.println("");
				continue;

			}

// 2번 직원리스트 출력 메뉴이다..
// 2번을 누를 경우, 등록되어있는 모든 직원들이 출력된다.!!
			if (SelectNumber == 2) { // 2.모든 직원 정보 출력
				System.out.println("");
				System.out.println("** 직원 리스트 출력 **");

				int number = 1;
				for (int i = 0; i < list1.size(); i++) {

					if (list1.get(i) == "null")
						continue;
					System.out.print("(" + number + ") ");
					number++;
					System.out.print("직원번호 : " + i);
					System.out.print(" / 이름 : " + list1.get(i));
					System.out.print(" / 전화번호 : " + list2.get(i));
					System.out.println(" / 이메일주소 : " + list3.get(i));
				}
				continue;
			}
			
// 3번 직원검색을 하는 메뉴이다.
// 검색조건을 나누면 좋을것같다..
// 흠.. 사원번호,이름,전화번호,이메일주소.. 모두 가능하게 해볼 예정이다..
// 		
			if (SelectNumber == 3) { // 3. 직원 검색
				System.out.println("");

				int temp = 0;

				System.out.println("**** 직원 검색 ****");
				System.out.println("");
				System.out.println("다음 중 원하는 검색 조건을 입력하세요.(1~4중 선택)");
				System.out.println("1. 사원 번호로 검색");
				System.out.println("2. 이름으로 검색 ");
				System.out.println("3. 전화번호로 검색");
				System.out.println("4. 이메일 주소로 검색");
				System.out.print(">> 조건을 입력하세요 :  ");
				temp = input.nextInt(); // 어떤 조건을 선택할 것인가 누르세요
				
				// 1번 사원 번호 조건으로 검색
				if (temp == 1) { 
					System.out.print("검색할 사원 번호 입력 : ");
					int num1 = input.nextInt();

					String s1 = list1.get(num1);
					int s2 = list2.get(num1);
					String s3 = list3.get(num1);
					// 검색결과를 출력한다...
					System.out.println("< 검색결과 >");
					System.out.println("사원 번호 :" + num1 + " / 사원 이름 : " 
							+ s1 + " / 전화번호 : " + s2 + " / 이메일 : " + s3);
				}

				// 2번 이름 조건으로 사원을 검색하게 한다.
				if (temp == 2) { 
					System.out.print("검색할 사원 이름 입력: ");

					String name1 = input.next();
					int index = list1.indexOf(name1);
					String s1 = list1.get(index);
					int s2 = list2.get(index);
					String s3 = list3.get(index);
					// 검색결과를 출력한다...
					System.out.println("< 검색결과 >");
					System.out.println("사원 번호 : " + index + " / 사원 이름 : " 
							+ s1 + " / 전화번호 : " + s2 + " / 이메일 : " + s3);
					System.out.println("");
				}
				
				// 3번 전화번호로 검색 선택
				if (temp == 3) { 
					System.out.print("검색할 사원 전화 번호 입력: ");
					int phone1 = input.nextInt();
					int index = list2.indexOf(phone1);
					String s1 = list1.get(index);
					int s2 = list2.get(index);
					String s3 = list3.get(index);
					// 검색결과를 출력한다...
					System.out.println("< 검색결과 >");
					System.out.println("사원 번호 : " + index + " / 사원 이름 : " 
							+ s1 + " / 전화번호 : " + s2 + " / 이메일 : " + s3);
					System.out.println("");
				}
				
				// 4번 이메일 주소로 검색 선택
				if (temp == 4) { 
					System.out.print("검색할 사원의 이메일 주소를 입력: ");
					String email1 = input.next();
					int index = list3.indexOf(email1);
					String s1 = list1.get(index);
					int s2 = list2.get(index);
					String s3 = list3.get(index);
					// 검색결과를 출력한다...
					System.out.println("< 검색결과 >");
					System.out.println("사원 번호 : " + index + " / 사원 이름 : " 
							+ s1 + " / 전화번호 : " + s2 + " / 이메일 : " + s3);
					System.out.println("");

				}
				continue;
			}  // 3번 직원검색에 대한 항목 if문 종료
			
			// 4번 직원삭제를 하겠다.. 퇴직하면 있어야되는 메뉴.!
			if (SelectNumber == 4) { // 4.직원 삭제
				System.out.println("");
				System.out.println("** 직원 삭제 **");
				System.out.println("삭제하고 싶은 직원의 번호를 입력하세요.");
				System.out.println("(직원 번호를 모르면 직원 검색 기능을 이용하여 번호를 입력하십시오.)");

				int number1 = input.nextInt();

				list1.remove(number1);
				list2.remove(number1);
				list3.remove(number1);
				list1.add(number1, "null"); // remove()를 수행하고 나서 인덱스값이 하나씩 줄어드는 현상을 막기 위함.
				list2.add(number1, 0);
				list3.add(number1, "null");

				// 삭제 완료 !!
				System.out.println("삭제 완료 !");
				continue;
			}
			//  5번을 누르면 직원관리메뉴 바2바2!!
			if (SelectNumber == 5) {
				break;
			}
		}
		System.out.println("...직원관리프로그램을 종료합니다...");
		System.out.println("");
	}
}
