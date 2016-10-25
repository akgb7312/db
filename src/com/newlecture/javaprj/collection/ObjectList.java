package com.newlecture.javaprj.collection;

import com.newlecture.javaprj.entity.Exam;

import struct.omok.Omok;

public class ObjectList {
   private Object[] objs;
   // 데이터를 추가하기위한 위치변수
   private int index;
   // 공간을 늘리기 위한 멤버변수들
   private int capacity;
   private int amount;

   public ObjectList(int capacity, int amount) {
      this.capacity = capacity;
      this.amount = amount;

      objs = new Object[capacity];
      index = 0;
   }

   public ObjectList() {
      capacity = 10;
      amount = 10;

      objs = new Object[capacity]; 
      index = 0;
   }

   public void add(Object obj) {
      // 공간이 모자라면 늘리자
      if (index >= capacity) {
         // 1.새로운 temp배열을 만든다.
         Object[] temp = new Object[capacity + amount];
         // 2.omoks에서 temp로 내용을 옮긴다.
         for (int i = 0; i < capacity; i++)
            temp[i] = objs[i];
         // 3.새로운 크기로 capacity를 설정한다.
         capacity += amount;
         // 4. 새로운 배열(temp)의 이름을 omoks 로 지정해 준다.
         objs = temp;
      }
      objs[index++] = obj;
   }
	public Object get(int index){
		
		return objs[index];
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