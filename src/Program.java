
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
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("����������������������������������������������������������");
			System.out.println("���������������������� ���� �޴�                    ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println();
			System.out.println();

			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ��    ��");
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
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��                  ���� �Է�                  ��");
					System.out.println("����������������������������������������������������������������������������������������");
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
						System.out.print("���� :");
						kor = scan.nextInt();
						if (kor < 0 | kor > 100)
							System.out.println("�߸��� �����Է� �Դϴ�.");
					} while (kor < 0 | kor > 100);
					
					
					System.out.print("��   :");
					math = scan.nextInt();
					while (math < 0 | math > 100) {
						System.out.println("�߸��� �����Է� �Դϴ�.");
						System.out.print("���� :");
						math = scan.nextInt();
					}
					System.out.print("���� :");
					eng = scan.nextInt();
					while (eng < 0 | eng > 100) {   
						System.out.println("�߸��� �����Է� �Դϴ�.");
						System.out.print("���� :");
						eng = scan.nextInt();
					}
					System.out.println();
					System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
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
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��                  ���� ���                  ��");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��     ��      ��     ��      ��       ��        ��");
					System.out.println("�� ��ȣ �� ���� �� ���� �� ���� ��  ����  ��  ���   ��");
	
					for (int i = 0; i < 3; i++) {
						System.out.println("����������������������������������������������������������������������������������������");
						System.out.println("��                                          ��");
						System.out.printf("��%3d   |%3d  ��%3d  ��%3d  ��%3d   ��%6.2f   |\n", i+1, kor, math, eng, total, avg);
						System.out.println("��                                          ��");
					}
	
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
	
					break;
	
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
	
					break mm;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");

			}
		}

	}

}
