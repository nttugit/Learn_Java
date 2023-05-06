
public class Book {
	private String name;
	private double price;
	private int publishedYear;
	private Author author;

	public Book(String name, double price, int publishedYear, Author author) {
		this.name = name;
		this.price = price;
		this.publishedYear = publishedYear;
		this.author = author;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getPublishedYear() {
		return publishedYear;
	}



	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public void printBookName() {
		System.out.println(this.getName());
	}
	
	public boolean checkTheSameYearBooks(Book book) {
		return this.publishedYear == book.publishedYear;
	}
	
	/**
	 * 
	 * @param x discount percentage
	 * @return
	 */
	public double getDiscountPriceByPercent(double x) {
		return this.price * (1 -  (x / 100));
	}
}
