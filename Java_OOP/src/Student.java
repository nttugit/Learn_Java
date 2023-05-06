
public class Student extends Person{
	private String className;
	private String schoolName;
	
	public Student(String fullName, int yob, String className, String schoolName) {
		super(fullName, yob);
		this.className = className;
		this.schoolName = schoolName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void doHomeWork() {
		System.out.println("Do the Java homeworks....");
	}
}
