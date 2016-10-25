import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) throws IOException {

		/*
		// ,를 기준으로 나누는 방법 , 문자열의 길이를 출력하는 방법
		String str = "홍길동,강호동,유재석,차태현,서현진";
		
		String [] ss= str.split(",");
		
		System.out.println(ss[0].length());
		*/
		
		
		
		/*// 숫자 <--> 문자열		
		String str = "30";
		
		int i = Integer.parseInt(str);
		str =String.valueOf(i);
		*/

		
		
		
		/*	
		FileInputStream fis = new FileInputStream("res/joomok.ini");
		Scanner fsc = new Scanner(fis);

	String line = "";
		String s;
		//String s = line.substring(0,5);	
		while (fsc.hasNextLine()) {
			
			line = fsc.nextLine();
			
			if(line.indexOf("오목판 크기")!=-1){
				line = fsc.nextLine();
				int BI = line.indexOf("너비")+3;
				System.out.println(BI);
				int EI = line.indexOf("너비",3)-2;
				//int EI = line.indexOf("/")-1;
				System.out.println(EI);
				s=line.substring(BI,EI);
				System.out.println(s);
				break;
				
			}			
		}
		fsc.close();
		fis.close();
		
		
		*/
		
		
	/*	char[] ok = new char[]{'o','k','\0'};
		
		String s = new String(ok);
		
		System.out.println(s);
		System.out.println(ok);
		
		String a = "dragon".concat("ball");
		
		System.out.println(a);*/
	}

}
