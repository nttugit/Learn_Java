package write_text_file;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		try {
			String filePath = "C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\write_text_file\\java_71.txt";
			PrintWriter pw = new PrintWriter(filePath, "UTF-8");
			pw.println("Hello World");
			pw.print("my age: ");
			pw.print(23);
			pw.println();
			Student studentA = new Student(100, "Nguyen Van A");
			pw.println(studentA);
			pw.flush(); 

			pw.close();
//			System.out.println();
		}catch(Exception e) {
			
		}
	
	}
}
