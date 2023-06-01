package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void copyAll(File source, File des) {
		try {
			Files.copy(source.toPath(), des.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (source.isDirectory()) {
			File[] childFiles = source.listFiles();
			for (File childFile : childFiles) {
				File newChildFile = new File(des.getAbsoluteFile() + "\\" + childFile.getName());
				copyAll(childFile, newChildFile);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// is existing file
//		File folder1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java");
//		System.out.println("Learn_Java folder is existed: " + folder1.exists());
//
//		File file1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\Main.java");
//		System.out.println("Main.java is existed: " + file1.exists());
//
//		File newFolder1 = new File(
//				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\child_files");
//		newFolder1.mkdir();
//
//		File newFolder2 = new File(
//				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\child_files\\child_files2\\child_files3");
//		newFolder2.mkdirs();
//
//		// Createa new file
//		File newFile2 = new File(
//				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\Test.java");
//		// Có thể phát sinh rất nhiều lỗi trong quá trình tạo tập tin, nên phải bắt lỗi
//		try {
//			newFile2.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		// other methods
//		System.out.println("Test.java can be executed: " + newFile2.canExecute());
//		System.out.println("Test.java file name: " + newFile2.getName());
//		System.out.println("Test.java file parent: " + newFile2.getName());
//		System.out.println("Test.java file name: " + newFile2.getName());

		// LESSON 70
//		"C:\Users\ADMIN\eclipse-workspace\Learn_Java\Java_concepts\src\files\file_1.txt"
		File f0 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\file_1.txt");
		File f1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\file_2.txt");
		File f2 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\file_2xyz.txt");

//		// 1. Đổi tên file
//		f0.renameTo(f1);

//		// 2. Di chuyền file
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		//  Di chuyển file vào thư mục F0
//		File f_2new = new File(
//				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0\\file_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 3. Copy file (hoac folder)
		File f_0 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0");
		File f_0_copy = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0_copy");
		File f_0_copy_new = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0_copy_new");
//		try {
//			// Chỉ copy được thư mục rỗng
//			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace(); 
//		}

		// Copy cả thưc mục con
		copyAll(f_0, f_0_copy_new);
		System.out.println("OK");

	}
}
