import java.util.Scanner;

public class Homework_Sh {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int sum = 0; // ��
		int temp = 0; // x,y ġȯ��
		int menu = 0; // �޴���
		int check = 0; // ���� Ȯ�� �� ���� Ƚ��
		Scanner sc = new Scanner(System.in);

		main: while (true) {
			System.out.println("������������������������������������������������������������������������������������������");
			System.out.println("��            ���� ���ϴ� ���α׷�               ��");
			System.out.println("������������������������������������������������������������������������������������������");
			System.out.println("1.���Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.println("4.����");

			menu = sc.nextInt();
			switch (menu) {
			case 1:

				do {

					if (menu == 1 | menu == 2) { // ó�� ���� �Ǵ� ���Է��Ұ��

						System.out.println("������������������������������������������������������������������������������������������");
						System.out.println("��               ��   ��   ��                    ��");
						System.out.println("������������������������������������������������������������������������������������������");
						System.out.println("���� �Է��ϼ���");

						x = sc.nextInt();
						y = sc.nextInt();
						if (x > y) // ���� ���� �� Ŭ���
						{
							temp = x;
							x = y;
							y = temp;

						}

						System.out.printf("%d �� %d �ǰ��� �ԷµǾ����ϴ�.\n", x, y);
						System.out.println("���� �޴��� �̵�(yes - 1/���Է� - 2)");

						check = 0; // �ʱ�ȭ
					} else // �ٸ� ���� ������ ���
					{

						System.out.println("�ٽ� �Է����ּ��� >������(yes -1 /���Է� -2)<");
						System.out.printf("����Ƚ�� : %d \n", check);
					}
					menu = sc.nextInt();
					check++;

				}

				while (menu == 2 | menu != 1); // ���Է� �Ǵ� �߸��� �Է°��� �ĺ�
				check = 0; // �ʱ�ȭ
				break;

			case 2:

				do {
					if (check == 0) { // ù �������� �ĺ�

						sum = (y - x + 1) * (x + y) / 2;

						System.out.println("������������������������������������������������������������������������������������������");
						System.out.println("��                 �� �� �� ��                  ��");
						System.out.println("������������������������������������������������������������������������������������������");
						System.out.printf("   [%d}����[%d]������ ���� : [%d]�Դϴ�.\n", x, y, sum);
						System.out.println(" �����޴��� �̵� yes : 1");
						sum = 0; // ���� ����� ���� �ʱ�ȭ

						if (menu == 1)
							break;
					} else { // �ٸ� ���ڸ� �Է������� ������ ����
						System.out.println("�ٽ� �Է����ּ��� >������(yes -1)<");
						System.out.printf("����Ƚ�� : %d \n", check);
					}
					menu = sc.nextInt();
					check++;

				} while (menu != 1); // 1�� �ƴ� �ٸ������� �ĺ�
				check = 0; // �ʱ�ȭ
				break;

			case 3:

				do {
					if (check == 0) {
						System.out.println("����: ������~");
						System.out.println("���� �޴��� �̵�(yes - 1)");
					} else {
						System.out.println("�ٽ� �Է����ּ��� >������(yes -1)<");
						System.out.printf("����Ƚ�� : %d \n", check);
					}
					menu = sc.nextInt();
					check++;

				} while (menu != 1);

				check = 0; // �ʱ�ȭ
				break;

			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break main;

			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			}

		}

	}

}
