package com.newlecture.javaprj.ui;

import com.newlecture.javaprj.entity.Exam;

public interface ExamConsoleListener {		// ����� ���ϴ°�

	void onInput(Exam exam);
	void onPrint(Exam exam);
	Exam newExam();
	
	
}
