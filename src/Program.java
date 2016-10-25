
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor = 0;
		int math = 0;
		int eng = 0;
		int total;
		int menu;

		float avg;

		Scanner scan = new Scanner(System.in);

		mm: while (true) {
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│　　　　　　　　　　　　　　　　　　　　　　　　　　　│");
			System.out.println("│　　　　　　　　　　 메인 메뉴                    │");
			System.out.println("│　　　　　　　　　　　　　　　　　　　　　　　　　　　│");
			System.out.println("└──────────────────────────────────────────┘");
			System.out.println();
			System.out.println();

			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종    료");
			System.out.print(">  ");

			menu = scan.nextInt();
			switch (menu) {

				case 1:
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("┌──────────────────────────────────────────┐");
					System.out.println("│                  성적 입력                  │");
					System.out.println("└──────────────────────────────────────────┘");
					System.out.println();
					System.out.println();
					/*
					 * short pos = (7<<8)|5;
					 * 
					 * System.out.printf("x:%d",pos);
					 * 
					 * int x = 0x00FF& pos;
					 * 
					 * System.out.printf("x:%d",x);
					 */
	
					do {
						System.out.print("국어 :");
						kor = scan.nextInt();
						if (kor < 0 | kor > 100)
							System.out.println("잘못된 점수입력 입니다.");
					} while (kor < 0 | kor > 100);
					
					
					System.out.print("수   :");
					math = scan.nextInt();
					while (math < 0 | math > 100) {
						System.out.println("잘못된 점수입력 입니다.");
						System.out.print("수학 :");
						math = scan.nextInt();
					}
					System.out.print("영어 :");
					eng = scan.nextInt();
					while (eng < 0 | eng > 100) {   
						System.out.println("잘못된 점수입력 입니다.");
						System.out.print("영어 :");
						eng = scan.nextInt();
					}
					System.out.println();
					System.out.println("성적 입력이 완료되었습니다.");
					System.out.println();
					break;
	
				case 2:
	
					total = kor + math + eng;
					avg = total / 3;
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("┌──────────────────────────────────────────┐");
					System.out.println("│                  성적 출력                  │");
					System.out.println("│──────────────────────────────────────────│");
					System.out.println("│     │      │     │      │       │        │");
					System.out.println("│ 번호 │ 국어 │ 영어 │ 수학 │  총점  │  평균   │");
	
					for (int i = 0; i < 3; i++) {
						System.out.println("│──────────────────────────────────────────│");
						System.out.println("│                                          │");
						System.out.printf("│%3d   |%3d  │%3d  │%3d  │%3d   │%6.2f   |\n", i+1, kor, math, eng, total, avg);
						System.out.println("│                                          │");
					}
	
					System.out.println("└──────────────────────────────────────────┘");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
	
					break;
	
				case 3:
					System.out.println("프로그램을 종료합니다.");
	
					break mm;
				default:
					System.out.println("잘못된 입력입니다.");

			}
		}

	}

}
