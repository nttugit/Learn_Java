package files;

import java.io.File;
import java.util.Scanner;

public class FileMethodExample {
	File file;

	public FileMethodExample(String filePath) {
		this.file = new File(filePath);
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(String filePath) {
		this.file = new File(filePath);
	}

	public boolean isExisting() {
		return this.file.exists();
	}

	public boolean isExcutable() {
		return this.file.canExecute();
	}

	public boolean isReadable() {
		return this.file.canRead();
	}

	public boolean isWritable() {
		return this.file.canWrite();
	}

	public void printAbsolutePath() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void printFileName() {
		System.out.println(this.file.getName());
	}

//	public void printDirectory() {
//		System.out.println(this.file.di);
//	}

	public void printIsFileOrDirectory() {
		String result = this.file.isFile() ? "Là file"
				: (this.file.isDirectory() ? "Là dicrectory" : "Không phải file hoặc directory");
		System.out.println(result);
	}

	public void printChildrenFiles() {
		if (this.file.isDirectory()) {
			System.out.println("Danh sách các file/directory   con: ");
			File[] childrenFiles = this.file.listFiles();
			for (File childFile : childrenFiles) {
				System.out.println(childFile.getAbsoluteFile());
			}
		} else if (this.file.isFile()) {
			System.out.println("Đây là file, không phải directory");
		} else {
			System.out.println("Đây không phải directory hoặc file");
		}
	}

	public void printDirectoryTree(File currentFile, int degree, String tab) {
//		for(int i =0 ;i < degree; i++) {
//			System.out.println("\t");
//		}
		if (currentFile.isDirectory()) {
			System.out.println(tab + "|_" + currentFile.getName());

			File[] childrenItems = currentFile.listFiles();
			for (File childItem : childrenItems) {
				printDirectoryTree(childItem, degree + 1, tab + "\t");
			}
		} else {
			System.out.println(tab + "|_" + currentFile.getName());
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userOption = 0;
		String filePath;
		System.out.println("Nhập đường đẫn đến file: ");
		filePath = scanner.nextLine();
		// FIle bình thường
		// C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\Main.java
		// File đã phân quyền chỉ đọc
		// C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\Java_concepts\\src\\files\\Test.java

		FileMethodExample fme = new FileMethodExample(filePath);

		do {

			System.out.println(
					"MENU ------------\n1. Kiểm tra file có thể thực thi\r\n" + "2. Kiểm tra file có thể đọc\r\n"
							+ "3. Kiểm tra file có thể ghi\r\n" + "4. In đường dẫn\r\n" + "5. In tên file\r\n"
							+ "6. Kiểm tra file là thư mục hoặc tập tin\r\n" + "7. In ra danh sách các file con\r\n"
							+ "8. In ra cây thư mục\r\n" + "9. Đổi đường dẫn file\n" + "0. Thoát chương trình");
			userOption = scanner.nextInt();
			scanner.nextLine();

			String result = "";
			switch (userOption) {
			case 1:
				result = fme.isExcutable() ? "Có" : "Không";

				break;
			case 2:
				result = fme.isWritable() ? "Có" : "Không";
				break;
			case 3:
				result = fme.isReadable() ? "Có" : "Không";
				break;
			case 4:
				fme.printAbsolutePath();
				break;
			case 5:
				fme.printFileName();
				break;
			case 6:
				fme.printIsFileOrDirectory();
				break;
			case 7:
				fme.printChildrenFiles();
				break;
			case 8:
				fme.printDirectoryTree(fme.getFile(), 1, "");
				break;
			case 9:
				System.out.println("Nhập đường đẫn đến file: ");
				filePath = scanner.nextLine();
				fme.setFile(filePath);
				break;
			default:
				System.out.println("Xin cảm ơn!!");
				break;

			}

			if (result != "") {
				System.out.println(result);
			}

		} while (userOption != 0);
	}
}
