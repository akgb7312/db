import java.util.Scanner;

public class Project_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roommen = 8;
		int board = 0;
		int check = 0;

		// �������α׷� ����
		startmenu:
		while(true) {
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("����������������������������������������������������������");
			System.out.println("��                ���� �޴�                    ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("����  1. �����ϱ�                  2.�����ϱ⡡����");
			System.out.println("����������������������������������������������������������������������������������������");

			int start = sc.nextInt();
			int checkout;
			
			submenu:
			switch (start) {

			
			case 1:
				
				
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("����1.�游��⡡����������������������������2.���� ����");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��                 �� �� ��                    ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��19.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��18.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��17.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��16.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��15.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��14.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��13.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��12.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��11.                                       ��");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("����������������������������������������������������������");
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��100.�� ����                                    ��");
				System.out.println("��                                          ��");
				System.out.println("����������������������������������������������������������");
				System.out.println("��                              99.���θ޴�  ��");
				System.out.println("����������������������������������������������������������������������������������������");

				int division = sc.nextInt();
				mainmenu:
				switch (division) {

				case 1:
					System.out.println("�� ������ �Է��� �ֽʽÿ�");
					System.out.print(">");
					String roomname = sc.next();
					System.out.println("�� �ο��� �Է��� �ֽʽÿ�(4~8)");
					System.out.print(">");
					roommen = sc.nextInt();
					System.out.println(roomname+" ���� �����Ǿ����ϴ�(1/"+roommen+")");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��������  : "+roomname+"�������泪����(0) (1/"+roommen+")��");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��                                          ��");
					System.out.println("����������������������������������������������������������");
					System.out.println("��                                          ��");
					System.out.println("����������������������������������������������������������������������������������������");
					
					checkout = sc.nextInt();
						if(checkout == 0){
							System.out.println("���� �����ϴ�."); 
							break mainmenu;
							}
						
					break;
					
				case 2:
					System.out.println("����â���� �̵��մϴ�.");
					break;
				case 19:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 18:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 17:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 16:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 15:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 14:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 13:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 12:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					break;
				case 11:
					System.out.println(division + "���濡 �����ϼ̽��ϴ�.");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("����"+division+"�������泪����(0) (1/"+roommen+")��");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("��                                          ��");
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.println("��                                          ��");
					System.out.println("����������������������������������������������������������");
					System.out.println("��                                          ��");
					System.out.println("����������������������������������������������������������������������������������������");
					break;
				case 99:
					System.out.println();
					System.out.println("���θ޴��� ���ư��ϴ�.");
					System.out.println();
					break;

				case 100:
					System.out.println("������ ��µ�");
				}

				break; //�� ���� ���̽�1 break;

			case 2:
				System.out.println("���α׷��� �����մϴ�.");
				break startmenu;

			default:
				System.out.println();
				System.out.println();
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println();
				System.out.println();
				

			}
		}

	}

}
