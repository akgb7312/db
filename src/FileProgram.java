import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("E:\\wokrspace\\JavaPrj\\src\\Hello.java");
		FileOutputStream fos = new FileOutputStream("E:\\wokrspace\\JavaPrj\\src\\Hello1.java");
		
		int count = 0;
		// �Է� ��Ʈ�� ��ü�� ���� ����� ���� ���� ���?
		/*
		 * int c;
		 * 
		 * while((c = fis.read()) != -1) System.out.printf("%c",c);
		 */

		Scanner sc = new Scanner(fis);
		PrintStream fout = new PrintStream(fos);
		
		/*String line;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			System.out.println(line);
			num++;
		}*/
		

		
		
		String word;
		word = sc.next();
		while (sc.hasNext()) {
			word = sc.next();
			System.out.println(word);
			fout.println(word);
			count++;
		}
		
		System.out.printf(" �� %d�� �ܾ ��µǾ����ϴ�.",count);
		fis.close();
		fout.close();
		fos.close();
		sc.close();
	}

}
