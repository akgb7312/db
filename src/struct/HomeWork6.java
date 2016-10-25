package struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork6 {
	public static void inputKor(CaptionList list) throws FileNotFoundException {

		// 파일 입력, 시스템 입력 객체 생성
		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		Scanner sc = new Scanner(System.in);

		// 변수 선언
		String line, str;
		int BI, EI;
		int sync = 0;
		int num = 0;
		int count = 0; // 숫자 세기

		// 파일 입력받기 시작

		line = fscan.nextLine();

		while (fscan.hasNextLine()) {
			line = fscan.nextLine();

			if (line.indexOf("<SYNC") != -1) { // sync

				BI = line.indexOf("Start") + 6;
				EI = line.indexOf(">");
				sync =  Integer.parseInt(line.substring(BI, EI));
				list.caps[num].time = sync; // 싱크값 넣어줌
				
				str = fscan.nextLine(); // 다음 문장을 str에 넣음

				if (str.indexOf("<SYNC") != -1) { // 다음 문장에도 싱크가 있을때
					
					BI = str.indexOf("Start") + 6;
					EI = str.indexOf(">");
					sync =  Integer.parseInt(str.substring(BI, EI));
					list.caps[num].time = sync; // 싱크값 넣어줌
					
					str = fscan.nextLine(); // 다음 문장을 str에 넣음
				}

					if (line.indexOf("KRCC") != -1) { // 한글 자막이라면

						if (str.indexOf("<br>") != -1) { // <br> 발견시

							str = str.replace("<br>", ""); // <br> 잘라서 라인에 다시
															// 넣어줌
							str += fscan.nextLine();
							list.caps[num].kor = str;
							num++;
							count++;

						} else { // <br>검사 if

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

		System.out.printf("검색할 자막을 입력해 주세요 : ");

		search = sc.next();

		System.out.printf(" '%s'  검색을 시작합니다.\n", search);

		while (true) {

			if (list.caps[count].kor.indexOf(search) != -1) {

				temp = list.caps[count].kor.replace(search, "＾" + search + "＾");
				temp = temp.replace("<br>", "");

				System.out.printf("%d  %s \n", list.caps[count].time, temp);
				System.out.printf("%d  %s \n", list.caps[count].time, list.caps[count].eng);

			} else if (list.caps[count].eng.indexOf(search) != -1) {

				temp = list.caps[count].eng.replace(search, "＾" + search + "＾");
				temp = temp.replace("<br>", "");

				System.out.printf("%d  %s \n", list.caps[count].time, temp);
				System.out.printf("%d  %s \n", list.caps[count].time, list.caps[count].kor);
			} else if (count == list.num - 1) {
				System.out.println("탐색을 종료합니다.");
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

		Caption[] caps = new Caption[3000]; // Caption 클래스 객체 이름표 만듬
		CaptionList list = new CaptionList();

		for (int i = 0; i < caps.length; i++) { // 생성
			caps[i] = new Caption();
		}

		list.caps = caps;
		list.num = 0;

		inputKor(list); // 배열에 자막,싱크 넣기

		for (int i = 0; i < list.num; i++)
			System.out.println(list.caps[i].time + "  " + list.caps[i].kor);
		// Search(list); // 자막 검색

		fscan.close();
		fis.close();

	}

}
