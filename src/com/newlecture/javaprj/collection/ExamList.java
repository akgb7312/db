package com.newlecture.javaprj.collection;

import com.newlecture.javaprj.entity.Exam;

import struct.omok.Omok;

public class ExamList {
	
	private Exam[] exams;
	private int index;
	
	private int capacity;
	private int amount;
	
	public ExamList() {
	
		capacity  = 10;
		amount = 10;
		index = 0;
		exams = new Exam[capacity];
		
		
		
	}
/*	
	public ExamList(int capacity,int amount){
		
		this.capacity = capacity;
		this.amount = amount;
		
		exams = new Exam[capacity];
		index = 0;
		
	}*/
	
	public void add(Exam exam){
		
		if(index >= capacity){		//  허용범위 초과시
			Exam[] temp = new Exam[capacity+amount];
			
			for(int i = 0; i<capacity;i++)
				temp[i] = exams[i];
	
			capacity += amount;		
			exams = temp;		
		}
		
		exams[index++] = exam;
	}
	
	public Exam get(int index){
		
		return exams[index];
	}
	public int size(){
		
		return index;
	}

	public int getIndex() {
		
		return index;
	}
	public void setIndex(int index){
		
		this.index = index;
	}



}
