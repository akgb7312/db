package struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork6 {
	public static void inputKor(CaptionList list) throws FileNotFoundException {

		// ���� �Է�, �ý��� �Է� ��ü ����
		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		Scanner sc = new Scanner(System.in);

		// ���� ����
		String line, str;
		int BI, EI;
		int sync = 0;
		int num = 0;
		int count = 0; // ���� ����

		// ���� �Է¹ޱ� ����

		line = fscan.nextLine();

		while (fscan.hasNextLine()) {
			line = fscan.nextLine();

			if (line.indexOf("<SYNC") != -1) { // sync

				BI = line.indexOf("Start") + 6;
				EI = line.indexOf(">");
				sync =  Integer.parseInt(line.substring(BI, EI));
				list.caps[num].time = sync; // ��ũ�� �־���
				
				str = fscan.nextLine(); // ���� ������ str�� ����

				if (str.indexOf("<SYNC") != -1) { // ���� ���忡�� ��ũ�� ������
					
					BI = str.indexOf("Start") + 6;
					EI = str.indexOf(">");
					sync =  Integer.parseInt(str.substring(BI, EI));
					list.caps[num].time = sync; // ��ũ�� �־���
					
					str = fscan.nextLine(); // ���� ������ str�� ����
				}

					if (line.indexOf("KRCC") != -1) { // �ѱ� �ڸ��̶��

						if (str.indexOf("<br>") != -1) { // <br> �߽߰�

							str = str.replace("<br>", ""); // <br> �߶� ���ο� �ٽ�
															// �־���
							str += fscan.nextLine();
							list.caps[num].kor = str;
							num++;
							count++;

						} else { // <br>�˻� if

							list.caps[num].kor = str;
							num++;
							count++;

						}

					} else break;
					
				}
									

		} // while

	}

	public static void Search(CaptionList list) {

		Scanner sc = new Scanner(System.in);
		String search, temp;
		int count = 0;

		System.out.printf("�˻��� �ڸ��� �Է��� �ּ��� : ");

		search = sc.next();

		System.out.printf(" '%s'  �˻��� �����մϴ�.\n", search);

		while (true) {

			if (list.caps[count].kor.indexOf(search) != -1) {

				temp = list.caps[count].kor.replace(search, "��" + search + "��");
				temp = temp.replace("<br>", "");

				System.out.printf("%d  %s \n", list.caps[count].time, temp);
				System.out.printf("%d  %s \n", list.caps[count].time, list.caps[count].eng);

			} else if (list.caps[count].eng.indexOf(search) != -1) {

				temp = list.caps[count].eng.replace(search, "��" + search + "��");
				temp = temp.replace("<br>", "");

				System.out.printf("%d  %s \n", list.caps[count].time, temp);
				System.out.printf("%d  %s \n", list.caps[count].time, list.caps[count].kor);
			} else if (count == list.num - 1) {
				System.out.println("Ž���� �����մϴ�.");
				break;
			} else {
			}
			count++;
		}
	}

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		Scanner sc = new Scanner(System.in);

		Caption[] caps = new Caption[3000]; // Caption Ŭ���� ��ü �̸�ǥ ����
		CaptionList list = new CaptionList();

		for (int i = 0; i < caps.length; i++) { // ����
			caps[i] = new Caption();
		}

		list.caps = caps;
		list.num = 0;

		inputKor(list); // �迭�� �ڸ�,��ũ �ֱ�

		for (int i = 0; i < list.num; i++)
			System.out.println(list.caps[i].time + "  " + list.caps[i].kor);
		// Search(list); // �ڸ� �˻�

		fscan.close();
		fis.close();

	}

}
