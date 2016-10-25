package com.newlecture.javaprj.collection;

import java.util.Iterator;

import com.newlecture.javaprj.entity.Exam;

import struct.omok.Omok;
 
public class GList<Sh> implements Iterable{
   private Sh[] shs;
   // �����͸� �߰��ϱ����� ��ġ����
   private int index;
   // ������ �ø��� ���� ���������
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
      // ������ ���ڶ�� �ø���
      if (index >= capacity) {
         // 1.���ο� temp�迭�� �����.
         Sh[] temp = (Sh[])new Object[capacity + amount];
         // 2.omoks���� temp�� ������ �ű��.
         for (int i = 0; i < capacity; i++)
            temp[i] = shs[i];
         // 3.���ο� ũ��� capacity�� �����Ѵ�.
         capacity += amount;
         // 4. ���ο� �迭(temp)�� �̸��� omoks �� ������ �ش�.
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