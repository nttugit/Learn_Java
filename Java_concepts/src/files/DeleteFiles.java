package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFiles {
	public static void deleteFiles(File file) {
		if (file.isFile()) {
			file.delete();
			System.out.println("Xoa thanh cong file: " + file.getName());
		} else if (file.isDirectory()) {
			for (File childFile : file.listFiles()) {
				deleteFiles(childFile);
			}
			// Xoá con nó xong xoá chính nó
			file.delete();
			System.out.println("Xoa thanh cong file: " + file.getName());
		}
	}

	public static void deleteFiles2(File file) throws IOException {
		Path filePath = file.toPath();

		if (file.isFile()) {
			try {
				Files.deleteIfExists(filePath);
				System.out.println("Xoa thanh cong file: " + file.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (file.isDirectory()) {
			for(File childFile : file.listFiles()) {
				deleteFiles2(childFile);
			}
			Files.deleteIfExists(filePath);
			System.out.println("Xoa thanh cong file: " + file.getName());
		}
	}

	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0");
		File f0_1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0_1");
		File fViDu = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\vidu.txt");

		File f2 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0\\F1\\F2");
		File f1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\F0\\F1");

//		System.out.println(f0.delete());
//		f0_1.deleteOnExit();
//		System.out.println(fViDu.exists());
//		fViDu.deleteOnExit();
//		System.out.println(fViDu.exists());
//		System.out.println(fViDu.delete());

//		File f0 = new File("C:\Users\ADMIN\eclipse-workspace\Learn_Java\Java_concepts\src\files\F0");

//		deleteFiles(f0);
		try {
			deleteFiles2(f0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
