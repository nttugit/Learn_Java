package files;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// is existing file
		File folder1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java");
		System.out.println("Learn_Java folder is existed: " + folder1.exists());

		File file1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\Main.java");
		System.out.println("Main.java is existed: " + file1.exists());

		File newFolder1 = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\child_files");
		newFolder1.mkdir();

		File newFolder2 = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\child_files\\child_files2\\child_files3");
		newFolder2.mkdirs();

		// Createa new file
		File newFile2 = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\Test.java");
		// Có thể phát sinh rất nhiều lỗi trong quá trình tạo tập tin, nên phải bắt lỗi
		try {
			newFile2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// other methods
		System.out.println("Test.java can be executed: " + newFile2.canExecute());
		System.out.println("Test.java file name: " + newFile2.getName());
		System.out.println("Test.java file parent: " + newFile2.getName());
		System.out.println("Test.java file name: " + newFile2.getName());
	}
}
