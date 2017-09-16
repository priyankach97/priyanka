
package com.student;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd)");
		ArrayList<Student> sg=new ArrayList<Student>();
		Student student=new Student(1001,"pri",sdf.parse("06-06-1995"), 75.00);
		Student student1=new Student(1001,"pri",sdf.parse("06-06-1995"), 75.00);
		Student student2=new Student(1001,"pri",sdf.parse("06-06-1995"), 75.00);
		Student student3=new Student(1001,"pri",sdf.parse("06-06-1995"), 75.00);
		sg.add(student);
		sg.add(student1);
		sg.add(student2);
		sg.toArray();
		StudentGroup sgb=new StudentGroup(sg.size());
		sgb.add(sg.get(0),0);
		sgb.add(sg.get(1),1);
		sgb.add(sg.get(2),2);
		System.out.println(sgb.getStudents());
		sg.remove(3);
		sgb.setStudent(student3,3);
		sgb.removeFromIndex(3);
		
		
		
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
