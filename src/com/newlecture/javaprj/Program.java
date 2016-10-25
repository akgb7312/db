package com.newlecture.javaprj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.newlecture.javaprj.collection.GList;
import com.newlecture.javaprj.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(7);
		set.add(3);		// ���� 3�� ���� �����  
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for (Integer n : set) {
			System.out.println(n);
		}
	
		
		/*Iterator<Integer> it2 = set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		*/
		System.out.println("---------------Map�� Zone--------------");
		Map<String,String> map = new HashMap<>();
		map.put("mid", "newlec");
		map.put("name","����");
		map.put("age", "20");
		
		//key������ ��ȸ�ؼ�  ���¹��
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		// entry��  Ű,�� �� �������� �ִ�
		for (Map.Entry<String, String> en:map.entrySet() )
			System.out.println(en.getKey());
		System.out.println("--------------------------------------");
		
		//String name = map.get("name");

		/*GList<String> list = new GList<>();
		list.add("hello");
		list.add("hi");
		list.add("�ȳ�");
		
		while(list.hasNext()){
			System.out.println(list.next());	
		}
		*/
		
		//List list = new ArrayList();
		//GList<String> list = new GList();
		List<String> list = new ArrayList();
		list.add("hello");
		list.add("hi");
		list.add("fire!!!!!!!!!");
		
		Iterator itr = list.iterator();
		
		for (String n : list) {
			System.out.println(n);
		}
		
		while(itr.hasNext()){
			System.out.println(itr.next());	
		}
		
		// ObjectList list = new ObjectList();
		//List list = new ArrayList();
		/*GLlist list = new GLlist();
		list.add("hello");
		list.add(3);
		list.add(10);
		list.add(new Exam());
		Object a = new Double(3.2);

		Object b = new Integer(3);
		int x = (int) b;

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i));

			if (list.get(i) instanceof Integer)
				sum += (int) list.get(i);
		}
		System.out.println(sum);

*/		/*
		 * ExamConsole console = new ExamConsole();
		 * 
		 * 
		 * EXIT: while(true){
		 * 
		 * int menu = console.inputMenu(); switch(menu){ case 1 :
		 * console.input(); break; case 2 : console.print(); break; case 3 :
		 * break EXIT;
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * Exam exam = new Exam(30,40,90); ExamList list = new ExamList();
		 * 
		 * list.add(exam); Exam temp = list.get(0);
		 * 
		 */

		/*
		 * //Exam.total(exam); int total = exam.total();
		 * 
		 * System.out.println(total); total = exam2.total();
		 * System.out.println(total);
		 */
	}

}
