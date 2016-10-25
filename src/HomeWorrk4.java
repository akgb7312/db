import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HomeWorrk4 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		Scanner sc = new Scanner(System.in);

		boolean bl = true;
		String line, str, find;
		String[] caption = new String[2000];
		int[] time = new int[2000];
		int BI, EI;
		int synk = 0, count = 0;

		line = fscan.nextLine();
		while (fscan.hasNextLine()) {

			line = fscan.nextLine();

			if (line.indexOf("<SYNC") != -1) {

				BI = line.indexOf("Start") + 6;
				EI = line.indexOf(">");
				str = line.substring(BI, EI);
				synk = Integer.parseInt(str);

			} else {
				if (synk == 0) {

				} else {
					time[count] = synk;
					line =line.replace("<br>", "");
					caption[count] = line;
					count++;
				}

			}

		}
		count = 0;
		System.out.printf("검색할 자막을 입력해 주세요 : ");
		find = sc.next();
		System.out.printf(" '%s'  검색을 시작합니다.\n", find);
		while (bl) {
			if (caption[count].indexOf(find) != -1) {
				System.out.println(time[count] + " " + caption[count]);
			} else if (caption[count].indexOf("/BODY") != -1) {
				System.out.println("탐색을 종료합니다.");
				bl = false;
			} else {
			}
			count++;
		}

		fscan.close();
		fis.close();

	}

}
