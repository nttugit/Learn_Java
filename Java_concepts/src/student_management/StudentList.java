package student_management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
	ArrayList<Student> studentList;

	public StudentList(ArrayList<Student> studentList) {

		this.studentList = studentList;
	}

	public StudentList() {
		// declare an array list
		this.studentList = new ArrayList<Student>();
	}

	public void addAStudent(Student student) {
		if (this.checkExistingStudent(student)) {
			System.out.println("Cannot add the student, the student is existing already");
			return;
		}
		this.studentList.add(student);
	}

	public void printStudents() {
		int order = 1;
		for (Student student : this.studentList) {
			System.out.println(student.toString(order));
			order++;
		}
	}

	public boolean checkIsEmpty() {
		return this.studentList.isEmpty();
	}

	public int count() {
		return this.studentList.size();
	}

	public void clearList() {
		this.studentList.clear();
	}


	public boolean checkExistingStudent(Student student) {
		return this.studentList.contains(student);
	}

	public boolean removeAStudent(Student student) {
		return this.studentList.remove(student);
	}

	public boolean removeAStudentByID(String studentID) {
		Student student = new Student(studentID);
		if (this.checkExistingStudent(student)) {
			return this.studentList.remove(student);
		}
		return false;
	}

	public ArrayList<Student> findStudentsByName(String name) {
		ArrayList<Student> students = new ArrayList<Student>();

		for (Student student : this.studentList) {
			if (student.getFullName().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				students.add(student);
			}
		}
		return students;
	}

	public void sortByGPAByDescencingOrder() {
		Collections.sort(this.studentList, new Comparator<Student>() {

			public int compare(Student std1, Student std2) {
				if (std1.getGPA() > std2.getGPA())
					return -1;
				else if (std1.getGPA() < std2.getGPA())
					return 1;
				return 0;
			}

		});
	}

	public void saveStudentListIntoFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (Student student : this.studentList) {
				oos.writeObject(student);
			}

			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readDataFromFile(File file) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			Student student = null;
			while (true) {
				Object studentObj = ois.readObject();
				if (studentObj != null) {
					student = (Student) studentObj;
					System.out.println("student " + student);
					this.studentList.add(student);
				} else {
					break;
				}
			}
//			C:\Users\ADMIN\eclipse-workspace\Learn_Java\Java_concepts\src\student_management\students.txt
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}