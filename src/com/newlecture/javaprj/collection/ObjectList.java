package com.newlecture.javaprj.collection;

import com.newlecture.javaprj.entity.Exam;

import struct.omok.Omok;

public class ObjectList {
   private Object[] objs;
   // �����͸� �߰��ϱ����� ��ġ����
   private int index;
   // ������ �ø��� ���� ���������
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
      // ������ ���ڶ�� �ø���
      if (index >= capacity) {
         // 1.���ο� temp�迭�� �����.
         Object[] temp = new Object[capacity + amount];
         // 2.omoks���� temp�� ������ �ű��.
         for (int i = 0; i < capacity; i++)
            temp[i] = objs[i];
         // 3.���ο� ũ��� capacity�� �����Ѵ�.
         capacity += amount;
         // 4. ���ο� �迭(temp)�� �̸��� omoks �� ������ �ش�.
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