package com.newlecture.javaprj.ui;

import java.util.Scanner;

import com.newlecture.javaprj.collection.ExamList;
import com.newlecture.javaprj.entity.Exam;

//	고쳐서 사용하는방법 1  - 추상화
//	public abstract class ExamConsole {

//	고쳐서 사용하는방법 2  - 분리 도킹
	public class ExamConsole{
		
	private ExamConsoleListener consoleListener;
	
	private ExamList list;
//	ExamList  list = new ExamList();
	
	public ExamConsole(){
		list = new ExamList();
//		new ExamConsoleListener(); 인터페이스는 객체생성 불가능
	}
	
	

	public void setConsoleListener(ExamConsoleListener consoleListener) {
		this.consoleListener = consoleListener;
	}



	public static int inputMenu(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│　　　   　　　　　　　　　　　　　　　　　　　　　                    　│");
		System.out.println("│                 메인 메뉴                                         │");
		System.out.println("│　　　　　　　　　　　　　　　　　　　　　　                           　　│");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();
		System.out.println();

		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종    료");
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
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                  성적 입력                                         │");
		System.out.println("└──────────────────────────────────────────┘");
		System.out.println();
		System.out.println();
		 
		while(check == 1){
			do {
				System.out.print("국어 :");
				kor = scan.nextInt();
				if (kor < 0 | kor > 100)
					System.out.println("잘못된 점수입력 입니다.");
			} while (kor < 0 | kor > 100);

			do{
				System.out.print("수   :");
				math = scan.nextInt();
				if (math < 0 | math > 100)
					System.out.println("잘못된 점수입력 입니다.");
			}while (math < 0 | math > 100); 
				
			do{
				System.out.print("영어 :");
				eng = scan.nextInt();
				if((eng < 0 | eng > 100))
				System.out.println("잘못된 점수입력 입니다.");
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
			System.out.println("성적 입력이 완료되었습니다.");
			System.out.println();
			
			list.add(exam);
			/*
			list.exams[list.index].kor = kor;
			list.exams[list.index].math = math;
			list.exams[list.index].eng = eng;*/
			//			list.index++;
			//			list.setIndex(list.getIndex()+1);
			
			if(index >= list.size()){
				System.out.println("데이터에 자료가 전부 찼습니다.");
				break;
			}else{
			System.out.println("추가입력 : 1/ 메인으로 : 0");
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
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                  성적 출력                                         │");
		System.out.println("└──────────────────────────────────────────┘");
		//System.out.println("│ 번호 │ 국어 │ 영어 │ 수학 │  총점   │  평균                      │");
		

		for (int i = 0; i < list.size(); i++) {
			Exam exam = list.get(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.total();
			float avg = exam.avg();
			
			System.out.printf("국어 : %d ", kor);
			System.out.printf("영어 : %d ", eng);
			System.out.printf("수학 : %d ", math);
//			onPrint(exam);
			
//			고쳐서 사용하는방법 2  - 분리 도킹
			if(consoleListener != null)			// 도킹잼
				consoleListener.onPrint(exam);

			System.out.printf("총점 : %d ", total);
			System.out.printf("평균 : %f\n", avg);
			
		}
		/*System.out.println("│──────────────────────────────────────────│");
		System.out.println("│                                          │");
		System.out.printf("│%3d | %3d │ %3d │ %3d │ %3d │%6.2f       |\n", i + 1, kor, math, eng, total, avg);
		System.out.println("│                                          │");}
		System.out.println("└──────────────────────────────────────────┘");
*/
		
	}


/*	public void onInput(Exam exam){		// 나중에 추가할 과목이 있을때 추가하기 위한 함수
		
	}		

	public void onPrint(Exam exam){
		
	}*/
//	고쳐서 사용하는방법 1  - 추상화
//	public abstract void onPrint(Exam exam);		
	
//	public avstract void onInput(Exam exam);

}
