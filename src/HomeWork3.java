import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		String line, st;
		String[] str;
		int BI, EI;
		int synk = 0;
		while (fscan.hasNextLine()) {
			line = fscan.nextLine();
			// 위에 싱크숫자 찍는거
			if (line.indexOf("<SYNC") != -1) { // Start 라는 문장이 있으면
				BI = line.indexOf("Start") + 6; // 시작점에 설정
				EI = line.indexOf(">"); // 끝점 설정
				st = line.substring(BI, EI); // 사이값 잘라오기
				synk = Integer.parseInt(st); // 숫자로 형변환

			} else {

				if (synk == 0) {
					
				}else if(line.indexOf("<br") != -1){
					EI = line.indexOf("<br");
					st = line.substring(0,EI);
					System.out.printf("%d  %s \n", synk, st);
				}
				else 
				{
					System.out.printf("%d  %s \n", synk, line); // 싱크숫자 출력
					
				}
			}
		}
		fis.close();
		fscan.close();
	}
}
