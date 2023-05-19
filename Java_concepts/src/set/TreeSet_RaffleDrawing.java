package set;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_RaffleDrawing {

	// thùng chứa phiếu dự thưởng
	Set<String> box = new TreeSet<String>();

	public TreeSet_RaffleDrawing() {
		super();
	}

	public boolean addTicket(String value) {
		return this.box.add(value);
	}

	public boolean removeATicket(String value) {
		return this.box.remove(value);
	}

	public boolean checkExistingTicket(String value) {
		return this.box.contains(value);
	}

	public void removeAllTickes() {
//		return this.box.removeAll(this.box);
		this.box.clear();
	}

	public int count() {
		return this.box.size();
	}

	public String drawTicket() {
		Random random = new Random();
		int index = random.nextInt(this.box.size());
		String result = (String) this.box.toArray()[index];
		this.removeATicket(result);
		return result;
	}

	public void printAllTickets() {
//		Object[] tickets = this.box.toArray();
//		for (int i = 0; i < tickets.length; i++) {
//			System.out.print(tickets[i] + " - ");
//		}
//		System.out.println();
		System.out.println(Arrays.toString(this.box.toArray())); // xịn
	}

	public void generateDefaultTickets() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int value = random.nextInt(10, 100);
			this.box.add(value + "");
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userOption = 0;
		TreeSet_RaffleDrawing raffleDrawing = new TreeSet_RaffleDrawing();

		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("8. Khởi tạo các phiếu mặc định.");
			System.out.println("0. Thoát khỏi chương trình");

			userOption = scanner.nextInt();
			
			switch(userOption) {
			case 0:
				System.out.println("Cảm ơn đã sử dụng dịch vụ");
				break;
			case 1:
				System.out.print("Nhập mã số dự thưởng: ");
				String ticketValue = scanner.next();
				if (raffleDrawing.addTicket(ticketValue)) {
					System.out.println("Thêm thành công mã số " + ticketValue);
				} else {
					System.out.println("Thêm thất bài");
				}
				break;
			case 2:
				System.out.print("Nhập mã số phiếu muốn xoá: ");
				String removeTicket = scanner.next();
				if (raffleDrawing.removeATicket(removeTicket)) {
					System.out.println("Xoá thành công mã số " + removeTicket);
				} else {
					System.out.println("Xoá thất bài");
				}
				break;
			case 3:
				System.out.print("Nhập mã số phiếu muốn kiểm tra: ");
				String yourTicket = scanner.next();
				if (raffleDrawing.checkExistingTicket(yourTicket)) {
					System.out.println("Tòn tại phiếu có mã số " + yourTicket);
				} else {
					System.out.println("Không tồn tại");
				}
				break;
			case 4:
				raffleDrawing.removeAllTickes();
				int countTickets = raffleDrawing.count();
				System.out.println("OK, số lượng phiếu lúc này: " + countTickets);
				break;
			case 5:
				int numberOfTickets = raffleDrawing.count();
				System.out.println("Số lượng thùng phiếu dự thưởng: " + numberOfTickets);
				break;
			case 6:
				// Todo: kiểm tra số lượng phiếu (>=5),
				String firstPrizeValue = raffleDrawing.drawTicket();
				String secondPrizeValue = raffleDrawing.drawTicket();
				String thirdPrizeValue = raffleDrawing.drawTicket();
				String consolationPrizeValue1 = raffleDrawing.drawTicket();
				String consolationPrizeValue2 = raffleDrawing.drawTicket();
				String consolationPrizeValue3 = raffleDrawing.drawTicket();
				System.out.println("Giải nhất: " + firstPrizeValue);
				System.out.println("Giải nhì: " + secondPrizeValue);
				System.out.println("Giải ba: " + thirdPrizeValue);
				System.out.println("Giải khuyến khích: " + consolationPrizeValue1 + ", " + consolationPrizeValue2 + ", "
						+ consolationPrizeValue3);
				break;
			case 7:
				raffleDrawing.printAllTickets();
				break;
			case 8:
				raffleDrawing.generateDefaultTickets();
				break;
			}
		} while (userOption != 0);
	}
}
