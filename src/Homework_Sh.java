import java.util.Scanner;

public class Homework_Sh {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int sum = 0; // 합
		int temp = 0; // x,y 치환용
		int menu = 0; // 메뉴값
		int check = 0; // 실패 확인 및 실패 횟수
		Scanner sc = new Scanner(System.in);

		main: while (true) {
			System.out.println("┌───────────────────────────────────────────┐");
			System.out.println("│            합을 구하는 프로그램               │");
			System.out.println("└───────────────────────────────────────────┘");
			System.out.println("1.값입력");
			System.out.println("2.결과보기");
			System.out.println("3.도움말");
			System.out.println("4.종료");

			menu = sc.nextInt();
			switch (menu) {
			case 1:

				do {

					if (menu == 1 | menu == 2) { // 처음 실행 또는 재입력할경우

						System.out.println("┌───────────────────────────────────────────┐");
						System.out.println("│               값   입   력                    │");
						System.out.println("└───────────────────────────────────────────┘");
						System.out.println("값을 입력하세요");

						x = sc.nextInt();
						y = sc.nextInt();
						if (x > y) // 앞의 값이 더 클경우
						{
							temp = x;
							x = y;
							y = temp;

						}

						System.out.printf("%d 와 %d 의값이 입력되었습니다.\n", x, y);
						System.out.println("상위 메뉴로 이동(yes - 1/재입력 - 2)");

						check = 0; // 초기화
					} else // 다른 값이 들어왔을 경우
					{

						System.out.println("다시 입력해주세요 >나가기(yes -1 /재입력 -2)<");
						System.out.printf("실패횟수 : %d \n", check);
					}
					menu = sc.nextInt();
					check++;

				}

				while (menu == 2 | menu != 1); // 재입력 또는 잘못된 입력값을 식별
				check = 0; // 초기화
				break;

			case 2:

				do {
					if (check == 0) { // 첫 실행인지 식별

						sum = (y - x + 1) * (x + y) / 2;

						System.out.println("┌───────────────────────────────────────────┐");
						System.out.println("│                 결 과 보 기                  │");
						System.out.println("└───────────────────────────────────────────┘");
						System.out.printf("   [%d}부터[%d]까지의 합은 : [%d]입니다.\n", x, y, sum);
						System.out.println(" 상위메뉴로 이동 yes : 1");
						sum = 0; // 다음 결과를 위해 초기화

						if (menu == 1)
							break;
					} else { // 다른 숫자를 입력했을때 나오는 문구
						System.out.println("다시 입력해주세요 >나가기(yes -1)<");
						System.out.printf("실패횟수 : %d \n", check);
					}
					menu = sc.nextInt();
					check++;

				} while (menu != 1); // 1이 아닌 다른수인지 식별
				check = 0; // 초기화
				break;

			case 3:

				do {
					if (check == 0) {
						System.out.println("도움말: 히히힝~");
						System.out.println("상위 메뉴로 이동(yes - 1)");
					} else {
						System.out.println("다시 입력해주세요 >나가기(yes -1)<");
						System.out.printf("실패횟수 : %d \n", check);
					}
					menu = sc.nextInt();
					check++;

				} while (menu != 1);

				check = 0; // 초기화
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				break main;

			default:
				System.out.println("잘못된 입력입니다.");

			}

		}

	}

}
