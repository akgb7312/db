package struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CaptionProgram {

	public static void inputArray(CaptionList list) throws FileNotFoundException {

		// ���� �Է�, �ý��� �Է� ��ü ����
		FileInputStream fis = new FileInputStream("res/ep01.smi");
		Scanner fscan = new Scanner(fis);
		Scanner sc = new Scanner(System.in);

		// ���� ����
		String line, str;
		int BI, EI;
		int sync = 0;
		int count = 0;		// ���� ����
		
		
		// ���� �Է¹ޱ� ����

		line = fscan.nextLine();

		while (fscan.hasNextLine()) {
			line = fscan.nextLine();
			
			if (line.indexOf("<SYNC") != -1) { // sync

				BI = line.indexOf("Start") + 6;
				EI = line.indexOf(">");
				str = line.substring(BI, EI);
				sync = Integer.parseInt(str);
				list.caps[list.num].time = sync; // ��ũ�� �־���
				str = fscan.nextLine();		// ���� ������ str�� ����

				if (str.indexOf("<SYNC") == -1) { // ���� ���忡 ��ũ�� �ߺ��� �ƴ϶��

					
					if (line.indexOf("KRCC") != -1) { // �ѱ� �ڸ��̶��

						
						if (str.indexOf("<br>") != -1) { // <br> �߽߰�
							
							str = str.replace("<br>", ""); // <br> �߶� ���ο� �ٽ� �־���
							str += fscan.nextLine();
							list.caps[list.num].kor = str;
							list.num++;
							count ++;
		
						} else { // <br>�˻� if
							
							list.caps[list.num].kor = str;
							list.num++;
							count++;
							
						}

					} else { // �ѱ��ڸ� �˻� if ������
						if (line.indexOf("ENCC") != -1) {
						
							if (str.indexOf("<br>") != -1) { // <br> �߽߰�
								
//								System.out.println("<br> : "+str);
								str = str.replace("<br>", "");
								str += fscan.nextLine();
//								System.out.println("�Է°� : "+list.caps[list.num-count].time+" "+str);
								list.caps[list.num-count].eng = str;
								count --;
							
							} else { // <br>�˻� if
							
//								System.out.printf("�Է°� : %d  %s \n", list.caps[list.num-count].time,str);
								
								list.caps[list.num-count].eng = str;
								count--;
							}
						}else{
							System.out.println(" ��   ��");
						}
					}
					
				} else { // ���� ���忡 ��ũ�� ���°��
					
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
						
//						System.out.println("������");
						
/*						list.caps[list.num].kor = line;
						list.num++;
						count ++;
				*/		
						if (line.indexOf("<br>") != -1) { // <br> �߽߰�
							
							line = line.replace("<br>", ""); // <br> �߶� ���ο� �ٽ� �־���
							line += fscan.nextLine();
							list.caps[list.num].kor = line;
							list.num++;
							count ++;
		
						} else { // <br>�˻� if
							
							list.caps[list.num].kor = line;
							list.num++;
							count++;
							
						}

						
					}else if(str.indexOf("Class=ENCC") != -1) {
						
/*						list.caps[list.num].eng = line;
						list.num++;
						count ++;*/

						if (line.indexOf("<br>") != -1) { // <br> �߽߰�
//							System.out.println("< br> �� �ɸ�"+line);
							line = line.replace("<br>", "");
							line += fscan.nextLine();
							list.caps[list.num-count].eng = line;
							count --;
						
						} else { // <br>�˻� if
						
							list.caps[list.num-count].eng = line;
							count--;
						}
						
						
					}else{
//						System.out.println("�ߺ� �ڸ��� ����ȉ�");
					}
					
				}

			}else{
				
				//System.out.println("ó�� �ڸ� ���°�");
			}
			
		} // while

	}
	
	public static void Search(CaptionList list){
		
		Scanner sc = new Scanner(System.in);
		String search, temp ;
		int count = 0;
		
		System.out.printf("�˻��� �ڸ��� �Է��� �ּ��� : ");
		
		search = sc.next();
		
		System.out.printf(" '%s'  �˻��� �����մϴ�.\n", search);
		
		while (true) {
			
			if (list.caps[count].kor.indexOf(search) != -1){
				
				temp = list.caps[count].kor.replace(search, "��" + search + "��");
				temp = temp.replace("<br>","");
				
				System.out.printf("%d  %s \n",list.caps[count].time, temp);
				System.out.printf("%d  %s \n",list.caps[count].time, list.caps[count].eng);
				
			}else if(list.caps[count].eng.indexOf(search) != -1){
				
				temp = list.caps[count].eng.replace(search, "��" + search + "��");
				temp = temp.replace("<br>","");
				
				System.out.printf("%d  %s \n",list.caps[count].time, temp);
				System.out.printf("%d  %s \n",list.caps[count].time, list.caps[count].kor);
			}
			else if (count == list.num-1) 
			{
				System.out.println("Ž���� �����մϴ�.");
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

		Caption[] caps = new Caption[3000]; // Caption Ŭ���� ��ü �̸�ǥ ����
		CaptionList list = new CaptionList();
		
		for (int i = 0; i < caps.length; i++) { // ����
			caps[i] = new Caption();
		}
		
		list.caps = caps;
		list.num = 0;


		inputArray(list); // �迭�� �ڸ�,��ũ �ֱ�
		
		for(int i = 0; i<list.num; i++)
		System.out.println(list.caps[i].time  +"  "+  list.caps[i].eng);
		//Search(list);	// �ڸ� �˻�


		fscan.close();
		fis.close();

	}

}
