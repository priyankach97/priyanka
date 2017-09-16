package com.student;
import java.util.Date;
import java.util.Arrays;
import java.util.Calander;


/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		for(int i=0;i<students.length;i++)
		{
		if(students[i] == null)
		{
			throw new IllegalArgumentException("there is no student to display");
		}
		else
		{
			System.out.println(students[i].getId());
			System.out.println(students[i].getFullName());
			System.out.println(students[i].getBirthDate());
			System.out.println(students[i].getAvgMark());
			
		}
		
		// Add your implementation here
	
	}
		return students;

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
		{
			throw new IllegalArgumentException("student value is null");
		}
		else
		{
			for(int i=0;i<students.length;i++)
			add(students[i],i);
		}
	}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
if(students[index] == null){
	throw new IllegalArgumentException("student value is null");
}
else
{
	System.out.println("getting student values from the index:"+index);
	System.out.println(students[index].getId());
	System.out.println(students[index].getFullName());
	System.out.println(students[index].getBirthDate());
	System.out.println(students[index].getAvgMark());
	
}
   return students[index];
		// Add your implementation here
	
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
      if(student == null)
      {
    	  throw new IllegalArgumentException("student value is null");
      }
      else{
    	  add(student,index);
      }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student != null)
		{
			add(student,0);
			
		}
		else
		{
			throw new IllegalArgumentException("student value is null");
			
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student != null{
			add(student,students.length-1);
		}
		else
		{
			throw new IllegalArgumentException("student value is null");
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student != null)
		{
			students[index] = student;
		}
		else
		{
			throw new IllegalArgumentException("student value is null");
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException("student value is null");
		}
		else
		{
			for(int i=0;i<students.length;i++)
			{
				if(students[i] == students[index]){
					for(int j=i;j<students.length;j++)
					{
						students[j] = students[j+1];
					}
					break;
				}
			}
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new IllegalArgumentException("student value is null")
		}
		else
		{
			for(int i=0;i<students.length;i++)
			{
				if(student[i] == student)
				{
					remove(i);
					break;
				}
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index <0 ||index >=students.length){
			throw new IllegalArgumentException("student value is null");
			
		}
		else
		{
			remove(index);
			
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
