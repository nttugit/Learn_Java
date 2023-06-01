package files.read_text_file;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Cach 1
//		try {
//
//			File f = new File(
//					"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\read_text_file\\file.txt");
//			BufferedReader bf = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//			String line = null;
//			while (true) {
//				line = bf.readLine();
//				if (line == null) {
//					break;
//				} else {
//					System.out.println(line);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// Cach 2
		try {
			File f2 = new File(
					"C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\read_text_file\\file.txt");
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String text : allText) {
				System.out.println(text);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
