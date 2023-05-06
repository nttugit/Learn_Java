
public class Film {
	private String name;
	private int year;
	private Producer producer;
	private double ticketPrice;
	private Date releaseDate;
	private datetime dateBabe;
	public Film(String name, int year, Producer producer, double ticketPrice, Date releaseDate) {
		super();
		this.name = name;
		this.year = year;
		this.producer = producer;
		this.ticketPrice = ticketPrice;
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public boolean checkTicketPriceIsCheaper(Film film) {
		return this.ticketPrice < film.ticketPrice;
	}
	
	public String getProducerName() {
		return this.producer.getName();
	}
	
	public double getDiscountPrice(double percent) {
		return this.ticketPrice * (1 - percent/100);
	}
}
