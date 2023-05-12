package test;

public class TestEnum {
	public static void main(String[] args) {
		Schedule mondaySchedule = new Schedule(DayEnum.Monday,"Math, Physics, Chemistry");
		Schedule tuesdaySchedule = new Schedule(DayEnum.Monday,"Physical Education, Literature, History");
		Schedule wednesdaySchedule = new Schedule(DayEnum.Monday,"Information technology, Math, Music");
//		System.out.println(mondaySchedule.toString());
		
		int julyNumOfDays = MonthsEnum.July.getNumOfDays();
		System.out.println(julyNumOfDays);
	}

}

