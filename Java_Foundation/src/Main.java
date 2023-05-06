
public class Main {
	public static void main(String[] args) {
////		Quản lý sách
//		Date daleCarnegieDOB = new Date(24,11,1888);
//		Date tuanTuDOB = new Date(30,07,1889);
//		Author daleCarnegie = new Author("Dale Carnegie",daleCarnegieDOB);
//		Author tuanTu = new Author("Nguyen Tuan Tu",tuanTuDOB);
//		Book book1 = new Book("Dac Nhan Tam", 100000, 1936, daleCarnegie);
//		Book book2 = new Book("Dac Nhan Tam Fake", 15000, 1936, tuanTu);
//		Book book3 = new Book("Dac Nhan Tam Fake 2023", 5000, 2023, tuanTu);
//		
//		book1.printBookName();
//		book2.printBookName();
//		book3.printBookName();
//		boolean checkBook1AndBook2TheSameYear = book1.checkTheSameYearBooks(book2);
//		boolean checkBook1AndBook3TheSameYear = book1.checkTheSameYearBooks(book3);
//		System.out.println("Book1's published year is same as book2s: " + checkBook1AndBook2TheSameYear);
//		System.out.println("Book1's published year is same as book3s: " + checkBook1AndBook3TheSameYear);
//		
//		double book1DiscountPrice = book1.getDiscountPriceByPercent(20);
//		System.out.println("Book1 discount price: " + book1DiscountPrice);

		// Quản lý rạp phim
		Date latMat6ReleaseDate = new Date(28, 04, 2023);
		Date nhaBaNuReleaseDate = new Date(28, 04, 2023);

		Producer latmat6Producer = new Producer("Ly Hai Production", "Viet Nam");
		Producer nhaBaNuProducer = new Producer("Hao Quang Ruc Ro Production", "Viet Nam");

		Film latMat6Film = new Film("Lat Mat 6", 2023, latmat6Producer, 90000, latMat6ReleaseDate);
		Film nhaBaNuFilm = new Film("Nha Ba Nu", 2023, nhaBaNuProducer, 130000, nhaBaNuReleaseDate);

		boolean isLatMat6TicketPriceCheaperThanNhaBaNu = latMat6Film.checkTicketPriceIsCheaper(nhaBaNuFilm);
		System.out.println(
				"Is 'Lat Mat 6' ticket price cheaper than 'Nha Ba Nu': " + isLatMat6TicketPriceCheaperThanNhaBaNu);

		String latMat6ProducerName = latMat6Film.getProducerName();
		String nhaBaNuProducerName = nhaBaNuFilm.getProducerName();
		System.out.println("\nLat Mat 6 producer: " + latMat6ProducerName);
		System.out.println("Nha Ba Nu producer: " + nhaBaNuProducerName);

		double latMat6DiscountPrice = latMat6Film.getDiscountPrice(20);
		double nhaBaNuDiscountPrice = nhaBaNuFilm.getDiscountPrice(0);
		System.out.println("\nLat Mat 6 discount price: " + latMat6DiscountPrice);
		System.out.println("Nha Ba Nu discount price: " + nhaBaNuDiscountPrice);
		
		// So sánh 2 phim có ra cùng ngày hay không?
		System.out.println(latMat6Film.getReleaseDate().equals(nhaBaNuFilm.getReleaseDate()));
		
	}
}
