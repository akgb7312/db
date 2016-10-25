package com.newlecture.javaprj.ui;

import java.util.Scanner;

import com.newlecture.javaprj.collection.ExamList;
import com.newlecture.javaprj.entity.Exam;

//	���ļ� ����ϴ¹�� 1  - �߻�ȭ
//	public abstract class ExamConsole {

//	���ļ� ����ϴ¹�� 2  - �и� ��ŷ
	public class ExamConsole{
		
	private ExamConsoleListener consoleListener;
	
	private ExamList list;
//	ExamList  list = new ExamList();
	
	public ExamConsole(){
		list = new ExamList();
//		new ExamConsoleListener(); �������̽��� ��ü���� �Ұ���
	}
	
	

	public void setConsoleListener(ExamConsoleListener consoleListener) {
		this.consoleListener = consoleListener;
	}



	public static int inputMenu(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��������   ������������������������������������������                    ����");
		System.out.println("��                 ���� �޴�                                         ��");
		System.out.println("����������������������������������������������                           ������");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println();
		System.out.println();

		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��    ��");
		System.out.print(">  ");

		int menu = scan.nextInt();

		return menu;
		
	}
	
	public void input() {
		
	//	ExamList list = new ExamList();
		
		Scanner scan = new Scanner(System.in);
		int math,kor,eng;
		int index = 0;
		int check = 1;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("��                  ���� �Է�                                         ��");
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println();
		System.out.println();
		 
		while(check == 1){
			do {
				System.out.print("���� :");
				kor = scan.nextInt();
				if (kor < 0 | kor > 100)
					System.out.println("�߸��� �����Է� �Դϴ�.");
			} while (kor < 0 | kor > 100);

			do{
				System.out.print("��   :");
				math = scan.nextInt();
				if (math < 0 | math > 100)
					System.out.println("�߸��� �����Է� �Դϴ�.");
			}while (math < 0 | math > 100); 
				
			do{
				System.out.print("���� :");
				eng = scan.nextInt();
				if((eng < 0 | eng > 100))
				System.out.println("�߸��� �����Է� �Դϴ�.");
			}while (eng < 0 | eng > 100);
			
			
			
			
			
			Exam exam = null;
			if(consoleListener != null)
				exam =consoleListener.newExam();//newExam();	// new Exam();  > list.get(list.getIndex());
			else
				exam = new Exam();
			
			
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			
//			onInput(exam);
			if(consoleListener != null)
			consoleListener.onInput(exam);

			
			System.out.println();
			System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			
			list.add(exam);
			/*
			list.exams[list.index].kor = kor;
			list.exams[list.index].math = math;
			list.exams[list.index].eng = eng;*/
			//			list.index++;
			//			list.setIndex(list.getIndex()+1);
			
			if(index >= list.size()){
				System.out.println("�����Ϳ� �ڷᰡ ���� á���ϴ�.");
				break;
			}else{
			System.out.println("�߰��Է� : 1/ �������� : 0");
			System.out.println("> ");
			check = scan.nextInt();
			}
		}
	}
	

	public Exam newExam() {
		
		return new Exam();
	}


	public void print(){
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("��                  ���� ���                                         ��");
		System.out.println("����������������������������������������������������������������������������������������");
		//System.out.println("�� ��ȣ �� ���� �� ���� �� ���� ��  ����   ��  ���                      ��");
		

		for (int i = 0; i < list.size(); i++) {
			Exam exam = list.get(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.total();
			float avg = exam.avg();
			
			System.out.printf("���� : %d ", kor);
			System.out.printf("���� : %d ", eng);
			System.out.printf("���� : %d ", math);
//			onPrint(exam);
			
//			���ļ� ����ϴ¹�� 2  - �и� ��ŷ
			if(consoleListener != null)			// ��ŷ��
				consoleListener.onPrint(exam);

			System.out.printf("���� : %d ", total);
			System.out.printf("��� : %f\n", avg);
			
		}
		/*System.out.println("����������������������������������������������������������������������������������������");
		System.out.println("��                                          ��");
		System.out.printf("��%3d | %3d �� %3d �� %3d �� %3d ��%6.2f       |\n", i + 1, kor, math, eng, total, avg);
		System.out.println("��                                          ��");}
		System.out.println("����������������������������������������������������������������������������������������");
*/
		
	}


/*	public void onInput(Exam exam){		// ���߿� �߰��� ������ ������ �߰��ϱ� ���� �Լ�
		
	}		

	public void onPrint(Exam exam){
		
	}*/
//	���ļ� ����ϴ¹�� 1  - �߻�ȭ
//	public abstract void onPrint(Exam exam);		
	
//	public avstract void onInput(Exam exam);

}
