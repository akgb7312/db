package struct;

import java.util.Scanner;

public class Program {
/*	static int kor = 0;
	static int math = 0;
	static int eng = 0;
	static int total;
	static int menu;

	static float avg;*/

	public static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│　　　　　　　　　　　　　　　　　　　　　　　　　　                     　│");
		System.out.println("│　　　　　　　　　　 메인 메뉴                                                    │");
		System.out.println("│　　　　　　　　　　　　　　　　　　　　　　                     　　　　　│");
		System.out.println("└──────────────────────────────────────────┘");
		System.out.println();
		System.out.println();

		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종    료");
		System.out.print(">  ");

		int menu = scan.nextInt();

		return menu;
	}

	public static void input(ExamList list) {
		Scanner scan = new Scanner(System.in);
		int math,kor,eng,index;
		int check = 1;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                                        성적 입력                                         │");
		System.out.println("└──────────────────────────────────────────┘");
		System.out.println();
		System.out.println();
		
		while(check == 1){
			do {
				System.out.print("국어 :");
				kor = scan.nextInt();
				if (kor < 0 | kor > 100)
					System.out.println("잘못된 점수입력 입니다.");
			} while (kor < 0 | kor > 100);

			do{
				System.out.print("수   :");
				math = scan.nextInt();
				if (math < 0 | math > 100)
					System.out.println("잘못된 점수입력 입니다.");
			}while (math < 0 | math > 100); 
				
			do{
				System.out.print("영어 :");
				eng = scan.nextInt();
				if((eng < 0 | eng > 100))
				System.out.println("잘못된 점수입력 입니다.");
			}while (eng < 0 | eng > 100);
			
			System.out.println();
			System.out.println("성적 입력이 완료되었습니다.");
			System.out.println();
			
			list.exams[list.index].kor = kor;
			list.exams[list.index].math = math;
			list.exams[list.index].eng = eng;
			list.index++;
			if(list.index >= list.exams.length){
				System.out.println("데이터에 자료가 전부 찼습니다.");
				break;
			}else{
			System.out.println("추가입력 : 1/ 종료 : 0");
			check = scan.nextInt();
			}
		}
	}

	public static void print(ExamList list) {
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                  성적 출력                                                               │");
		System.out.println("│──────────────────────────────────────────│");
		System.out.println("│ 번호 │ 국어 │ 영어 │ 수학 │  총점  │  평균                                     │");

		for (int i = 0; i < list.index; i++) {
			int kor = list.exams[i].kor;
			int eng = list.exams[i].eng;
			int math = list.exams[i].math;
			int total;
			float avg;
			total = kor + math + eng;
			avg = total / 3;
			System.out.println("│──────────────────────────────────────────│");
			System.out.println("│                                                                                            │");
			System.out.printf("│%3d   |%3d  │%3d  │%3d  │%3d   │%6.2f                                |\n", i + 1, kor, math, eng, total, avg);
			System.out.println("│                                                                                            │");
		}
		System.out.println("└──────────────────────────────────────────┘");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {

		
		Exam[] exams = new Exam[3];
		exams[0] = new Exam();
		exams[1] = new Exam();
		exams[2] = new Exam();
		
		ExamList list = new ExamList();
		list.exams = exams;
		list.index = 0;
		
		int menu;
		menu = inputMenu(); 
		
		
		
		
		
		mm: while (true) {
			switch (menu) {
			case 1:
//				index =0;
				input(list);
				menu = inputMenu();
				
				break;
			case 2:
				print(list);
				menu = inputMenu();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break mm;

			default:
				System.out.println("잘못된 입력 값입니다.");
			}
			
		}

	}

}
