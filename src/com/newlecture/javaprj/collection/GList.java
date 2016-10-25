package com.newlecture.javaprj.collection;

import java.util.Iterator;

import com.newlecture.javaprj.entity.Exam;

import struct.omok.Omok;
 
public class GList<Sh> implements Iterable{
   private Sh[] shs;
   // 데이터를 추가하기위한 위치변수
   private int index;
   // 공간을 늘리기 위한 멤버변수들
   private int capacity;
   private int amount;
//   private int current;

/*   public Sh next(){
	   
	   return shs[++current];
   }
   */
   public GList(int capacity, int amount) {
      this.capacity = capacity;
      this.amount = amount;

      
      
      
      shs = (Sh[])new Object[capacity];
      index = 0;
      
   }

   public GList() {
      capacity = 10;
      amount = 10;

//      current = -1;
      
      shs = (Sh[])new Object[capacity]; 
      index = 0;
   }

   public void add(Sh sh) {
      // 공간이 모자라면 늘리자
      if (index >= capacity) {
         // 1.새로운 temp배열을 만든다.
         Sh[] temp = (Sh[])new Object[capacity + amount];
         // 2.omoks에서 temp로 내용을 옮긴다.
         for (int i = 0; i < capacity; i++)
            temp[i] = shs[i];
         // 3.새로운 크기로 capacity를 설정한다.
         capacity += amount;
         // 4. 새로운 배열(temp)의 이름을 omoks 로 지정해 준다.
         shs = temp;
      }
      shs[index++] = sh;
   }
	public Sh get(int index){
		
		return shs[index];
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
	/*
	public boolean hasNext() {
		
		if(current+1 >= index)
			return false;
		
		return true;
	}
	   public Sh next(){
	   
	   return shs[++current];
}
	*/
	@Override
	public Iterator iterator() {
		
		return new GIterator();
	}
	
	class GIterator<String> implements Iterator{
		
		private int current;

		public GIterator(){
			current = -1;
		}
		
		@Override
		public boolean hasNext() {
			
			if(current+1 >= index)
				return false;
			
			return true;

		}

		@Override
		public Sh next() {
			
			return shs[++current];
			
		}
		
	}
/*	class GIterator implements Iterator{
	      private int current;
	      
	      public GIterator() {
	         current=-1;
	      }

	      @Override
	      public boolean hasNext() {
	         
	         
	         if(current+1>=index)
	            return false;
	         
	         return true;
	      }

	      @Override
	      public Object next() {
	         
	         return shs[++current];
	      }
	   }
	

*/


}