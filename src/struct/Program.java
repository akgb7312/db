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
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("������������������������������������������������������                     ����");
		System.out.println("���������������������� ���� �޴�                                                    ��");
		System.out.println("����������������������������������������������                     ������������");
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println();
		System.out.println();

		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��    ��");
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
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("��                                        ���� �Է�                                         ��");
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println();
		System.out.println();
		
		while(check == 1){
			do {
				System.out.print("���� :");
				kor = scan.nextInt();
				if (kor < 0 | kor > 100)
					System.out.println("�߸��� �����Է� �Դϴ�.");
			} while (kor < 0 | kor > 100);

			do{
				System.out.print("��   :");
				math = scan.nextInt();
				if (math < 0 | math > 100)
					System.out.println("�߸��� �����Է� �Դϴ�.");
			}while (math < 0 | math > 100); 
				
			do{
				System.out.print("���� :");
				eng = scan.nextInt();
				if((eng < 0 | eng > 100))
				System.out.println("�߸��� �����Է� �Դϴ�.");
			}while (eng < 0 | eng > 100);
			
			System.out.println();
			System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			
			list.exams[list.index].kor = kor;
			list.exams[list.index].math = math;
			list.exams[list.index].eng = eng;
			list.index++;
			if(list.index >= list.exams.length){
				System.out.println("�����Ϳ� �ڷᰡ ���� á���ϴ�.");
				break;
			}else{
			System.out.println("�߰��Է� : 1/ ���� : 0");
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
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("��                  ���� ���                                                               ��");
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("�� ��ȣ �� ���� �� ���� �� ���� ��  ����  ��  ���                                     ��");

		for (int i = 0; i < list.index; i++) {
			int kor = list.exams[i].kor;
			int eng = list.exams[i].eng;
			int math = list.exams[i].math;
			int total;
			float avg;
			total = kor + math + eng;
			avg = total / 3;
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                                                                            ��");
			System.out.printf("��%3d   |%3d  ��%3d  ��%3d  ��%3d   ��%6.2f                                |\n", i + 1, kor, math, eng, total, avg);
			System.out.println("��                                                                                            ��");
		}
		System.out.println("����������������������������������������������������������������������������������������");
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
				System.out.println("���α׷��� �����մϴ�.");
				break mm;

			default:
				System.out.println("�߸��� �Է� ���Դϴ�.");
			}
			
		}

	}

}
