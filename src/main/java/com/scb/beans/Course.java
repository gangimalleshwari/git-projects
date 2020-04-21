package com.scb.beans;
import java.util.List;
public class Course {
	private List<String> subjects;
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public void showCourse() {
		System.out.println("Subjects :");
		for (String subject : subjects) {
			System.out.println(subject);
		}
	}
}
