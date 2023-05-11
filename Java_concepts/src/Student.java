
public class Student implements Comparable<Student> {
	private int studentId;
	private String fullName;
	private String className;
	private double GPA;

	public Student(int studentId, String fullName, String className, double GPA) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.className = className;
		this.GPA = GPA;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getVietnameseFirstname() {
		String fullName = this.fullName.trim();
		// Ko can check cung duoc, vi mac dinh tim ko duoc no se = -1, -1 + 1 = 0, se lay tu dau
		if(fullName.lastIndexOf(" ") == -1) {
			return fullName;
		}
		return fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length());
	}

	@Override
	public int compareTo(Student o) {
//		return this.studentId - o.studentId;
		String myName = getVietnameseFirstname();
		String oName = o.getVietnameseFirstname();
		return myName.compareTo(oName);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", className=" + className + ", GPA="
				+ GPA + "]";
	}

	
	
}
