package struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CaptionProgram {

	public static void inputArray(CaptionList list) throws FileNotFoundException {

		// 파일 입력, 시스템 입력 객체 생성
		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		Scanner sc = new Scanner(System.in);

		// 변수 선언
		String line, str;
		int BI, EI;
		int sync = 0;
		int count = 0;		// 숫자 세기
		
		
		// 파일 입력받기 시작

		line = fscan.nextLine();

		while (fscan.hasNextLine()) {
			line = fscan.nextLine();
			
			if (line.indexOf("<SYNC") != -1) { // sync

				BI = line.indexOf("Start") + 6;
				EI = line.indexOf(">");
				str = line.substring(BI, EI);
				sync = Integer.parseInt(str);
				list.caps[list.num].time = sync; // 싱크값 넣어줌
				str = fscan.nextLine();		// 다음 문장을 str에 넣음

				if (str.indexOf("<SYNC") == -1) { // 다음 문장에 싱크가 중복이 아니라면

					
					if (line.indexOf("KRCC") != -1) { // 한글 자막이라면

						
						if (str.indexOf("<br>") != -1) { // <br> 발견시
							
							str = str.replace("<br>", ""); // <br> 잘라서 라인에 다시 넣어줌
							str += fscan.nextLine();
							list.caps[list.num].kor = str;
							list.num++;
							count ++;
		
						} else { // <br>검사 if
							
							list.caps[list.num].kor = str;
							list.num++;
							count++;
							
						}

					} else { // 한글자막 검사 if 영어라면
						if (line.indexOf("ENCC") != -1) {
						
							if (str.indexOf("<br>") != -1) { // <br> 발견시
								
//								System.out.println("<br> : "+str);
								str = str.replace("<br>", "");
								str += fscan.nextLine();
//								System.out.println("입력값 : "+list.caps[list.num-count].time+" "+str);
								list.caps[list.num-count].eng = str;
								count --;
							
							} else { // <br>검사 if
							
//								System.out.printf("입력값 : %d  %s \n", list.caps[list.num-count].time,str);
								
								list.caps[list.num-count].eng = str;
								count--;
							}
						}else{
							System.out.println(" 뭐   냐");
						}
					}
					
				} else { // 다음 문장에 싱크가 나온경우
					
//					System.out.println("line1 : " + line);
//					System.out.println("str :  "+str);

					BI = str.indexOf("Start") + 6;
					EI = str.indexOf(">");
					sync = Integer.parseInt(str.substring(BI, EI));
					list.caps[list.num].time = sync;
					
//					System.out.println("sync : "+sync);

					line = fscan.nextLine();
					
					
//					System.out.println("line2 : 	" + line);
					
					if (str.indexOf("Class=KRCC") != -1) {
						
//						System.out.println("실행됌");
						
/*						list.caps[list.num].kor = line;
						list.num++;
						count ++;
				*/		
						if (line.indexOf("<br>") != -1) { // <br> 발견시
							
							line = line.replace("<br>", ""); // <br> 잘라서 라인에 다시 넣어줌
							line += fscan.nextLine();
							list.caps[list.num].kor = line;
							list.num++;
							count ++;
		
						} else { // <br>검사 if
							
							list.caps[list.num].kor = line;
							list.num++;
							count++;
							
						}

						
					}else if(str.indexOf("Class=ENCC") != -1) {
						
/*						list.caps[list.num].eng = line;
						list.num++;
						count ++;*/

						if (line.indexOf("<br>") != -1) { // <br> 발견시
//							System.out.println("< br> 에 걸린"+line);
							line = line.replace("<br>", "");
							line += fscan.nextLine();
							list.caps[list.num-count].eng = line;
							count --;
						
						} else { // <br>검사 if
						
							list.caps[list.num-count].eng = line;
							count--;
						}
						
						
					}else{
//						System.out.println("중복 자막값 실행안됌");
					}
					
				}

			}else{
				
				//System.out.println("처음 자막 없는곳");
			}
			
		} // while

	}
	
	public static void Search(CaptionList list){
		
		Scanner sc = new Scanner(System.in);
		String search, temp ;
		int count = 0;
		
		System.out.printf("검색할 자막을 입력해 주세요 : ");
		
		search = sc.next();
		
		System.out.printf(" '%s'  검색을 시작합니다.\n", search);
		
		while (true) {
			
			if (list.caps[count].kor.indexOf(search) != -1){
				
				temp = list.caps[count].kor.replace(search, "＾" + search + "＾");
				temp = temp.replace("<br>","");
				
				System.out.printf("%d  %s \n",list.caps[count].time, temp);
				System.out.printf("%d  %s \n",list.caps[count].time, list.caps[count].eng);
				
			}else if(list.caps[count].eng.indexOf(search) != -1){
				
				temp = list.caps[count].eng.replace(search, "＾" + search + "＾");
				temp = temp.replace("<br>","");
				
				System.out.printf("%d  %s \n",list.caps[count].time, temp);
				System.out.printf("%d  %s \n",list.caps[count].time, list.caps[count].kor);
			}
			else if (count == list.num-1) 
			{
				System.out.println("탐색을 종료합니다.");
				break;
			} 
			else
			{
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


		inputArray(list); // 배열에 자막,싱크 넣기
		
		for(int i = 0; i<list.num; i++)
		System.out.println(list.caps[i].time  +"  "+  list.caps[i].eng);
		//Search(list);	// 자막 검색


		fscan.close();
		fis.close();

	}

}
