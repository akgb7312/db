package com.newlecture.javaprj.entity;

public class Exam {

	private int kor;
	private int eng;
	private int math;
	
	public Exam(){
		this(0,0,0);
		 
	}
	public Exam(int kor,int eng,int math){
		this.kor = kor; 
		this.eng = eng;
		this.math =math;
	}
	
/*	public static int total(Exam exam){
		
		return exam.kor + exam.eng + exam.math;
	}
	public static float avg(Exam exam){
		
		return 0;
	}
*/	
	
	public int total(){
		
		return eng + kor + math;
	}
	public float avg(){
		
		return total()/3;
	}

	public int getKor(){
		
		return kor;
	}
	public int getEng(){
		
		return eng;
	}
	public int getMath(){
		
		return math;
	}
	public void setKor(int kor) {
		this.kor = kor;
		
	}
	public void setEng(int eng) {
		this.eng = eng;
		
	}
	public void setMath(int math) {
		
		this.math = math;
		
	}

	
}
