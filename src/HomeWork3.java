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
			// ���� ��ũ���� ��°�
			if (line.indexOf("<SYNC") != -1) { // Start ��� ������ ������
				BI = line.indexOf("Start") + 6; // �������� ����
				EI = line.indexOf(">"); // ���� ����
				st = line.substring(BI, EI); // ���̰� �߶����
				synk = Integer.parseInt(st); // ���ڷ� ����ȯ

			} else {

				if (synk == 0) {
					
				}else if(line.indexOf("<br") != -1){
					EI = line.indexOf("<br");
					st = line.substring(0,EI);
					System.out.printf("%d  %s \n", synk, st);
				}
				else 
				{
					System.out.printf("%d  %s \n", synk, line); // ��ũ���� ���
					
				}
			}
		}
		fis.close();
		fscan.close();
	}
}
