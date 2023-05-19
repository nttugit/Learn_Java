package map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class EnglishVietnameseDictionanry_TreeMap {
	// Nếu key không phải String mà kiểu dữ liệu khác thì cần định nghĩa Comparator
	private Map<String, String> data = new TreeMap<String, String>();

	public String addAWord(String englishWord, String vietnameseWord) {
		return this.data.put(englishWord, vietnameseWord);
	}

	public String deleteAWord(String englishWord) {
		return this.data.remove(englishWord);
	}

	public String search(String englishWord) {
		return this.data.get(englishWord);
	}

	public void printAllWords() {
		Set<String> allWords = this.data.keySet();
		System.out.println(Arrays.toString(allWords.toArray()));
	}

	public int count() {
		return this.data.size();
	}

	public void deleteAllWords() {
		this.data.clear();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EnglishVietnameseDictionanry_TreeMap en_vn_dictionary = new EnglishVietnameseDictionanry_TreeMap();
		int userOption = 0;

		do {
			System.out.println("\n------------ Tra từ điển Anh - Việt ----------\r\n" + "MENU\r\n"
					+ "0. Thoát chương trình\r\n" + "1. Thêm từ (tiếng Anh - tiếng Việt)\r\n" + "2. Xoá từ\r\n"
					+ "3. Tra từ\r\n" + "4. In danh sách các từ đang có\r\n" + "5. In ra số lượng từ\r\n"
					+ "6. Xoá tất cả từ khoá\r\n" + "");

			userOption = scanner.nextInt();
			scanner.nextLine();
			switch (userOption) {
			case 0:
				System.out.println("Cảm ơn đã sử dụng dịch vụ");
				break;
			case 1:
				System.out.print("Nhập từ tiếng Anh: ");
				String englishWord = scanner.nextLine();
				System.out.print("Nhập từ tiếng Việt: ");
				String vietnameseWord = scanner.nextLine();
				String newWord = en_vn_dictionary.addAWord(englishWord, vietnameseWord);
				System.out.println("Thêm thành công " + newWord);
				break;
			case 2:
				System.out.print("Nhập từ cần xoá: ");
				String deletedKey = scanner.nextLine();
				String deletedWord = en_vn_dictionary.deleteAWord(deletedKey);
				System.out.println("Xoá thành công " + deletedWord);
				break;
			case 3:
				System.out.print("Nhập từ khoá: ");
				String searchedKey = scanner.nextLine();
				String searchedWord = en_vn_dictionary.search(searchedKey);

				if (searchedWord == null) {
					System.out.println("Từ bạn tìm kiếm không có");
				} else {
					System.out.println("Nghĩa tiếng Việt: " + searchedWord);
				}

				break;
			case 4:
				en_vn_dictionary.printAllWords();
				break;
			case 5:
				int count = en_vn_dictionary.count();
				System.out.println("Số lượng từ: " + count);
				break;
			case 6:
				en_vn_dictionary.deleteAllWords();
				System.out.println("Đã xoá, số lượng từ hiện có: " + en_vn_dictionary.count());
				break;
			default:
				break;
			}

		} while (userOption != 0);
	}
}
