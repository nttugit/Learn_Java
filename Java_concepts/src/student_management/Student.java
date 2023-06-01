package student_management;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Comparable<Student>, Serializable {
	private String studentId;
	private String fullName;
	private int yob; // year of birth
	private double GPA;

	public Student(String studentId, String fullName, int yob, double gPA) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.yob = yob;
		GPA = gPA;
	}

	public Student(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", yob=" + yob + ", GPA=" + GPA + "]";
	}

	public String toString(int order) {
		return order + ". ID: " + studentId + ", fullName: " + fullName + ", yob: " + yob + ", GPA: " + GPA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(GPA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		result = prime * result + yob;
		return result;
	}

//	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;

		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;

		return true;
	}
//
//	public int compareTo(Student o) {
//		return this.studentId.compareTo(o.studentId);
//	}

	public static void printStudents(ArrayList<Student> students) {
		int order = 1;
		for (Student student : students) {
			System.out.println(student.toString(order));
			order++;
		}
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
