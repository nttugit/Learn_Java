import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day >= 1 && day <= 31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month >= 1 && month <= 12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 0)
			this.year = year;
	}
	
	@Override
	public String toString() {
		return this.day +"/"+this.month + "/"+this.year;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Date other = (Date)obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}
}

