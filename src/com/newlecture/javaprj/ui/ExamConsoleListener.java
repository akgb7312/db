package com.newlecture.javaprj.ui;

import com.newlecture.javaprj.entity.Exam;

public interface ExamConsoleListener {		// 약속을 정하는곳

	void onInput(Exam exam);
	void onPrint(Exam exam);
	Exam newExam();
	
	
}
