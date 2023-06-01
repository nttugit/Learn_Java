package student_management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	public static Student readAStudentFromFile(File file) {
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			Student student = (Student) ois.readObject();
			ois.close();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void writeAStudentIntoFile(File file, Student student) {
		try {

			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);

			oos.writeObject(student);

			oos.flush();
			oos.close();
			System.out.println("Write ok");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		File studentFile = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\student_management\\student.txt");
		Student studentA = new Student("1", "Nguyen Tuan Tu", 2000, 9);

//		writeAStudentIntoFile(studentFile, studentA);
		Student student = readAStudentFromFile(studentFile);
		System.out.println(student);
	}
}
