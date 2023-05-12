package test;

public class Schedule {
	private DayEnum day;
	private String subject;

	public Schedule(DayEnum day, String subject) {
//		super();
		this.day = day;
		this.subject = subject;
	}

	public DayEnum getDay() {
		return day;
	}

	public void setDay(DayEnum day) {
		this.day = day;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Schedule [day=" + day + ", subject=" + subject + "]";
	}
	
	

}
