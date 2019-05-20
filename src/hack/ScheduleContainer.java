package hack;

import java.util.ArrayList;

public class ScheduleContainer {
	private static ArrayList<Schedule> scheduleList=new ArrayList<Schedule>();
	
	public static ArrayList<Schedule> scheduleList() {return scheduleList;}
	
	public void AddSchedule(Schedule s) {
		scheduleList.add(s);
	}
	
	public ArrayList<Schedule> getList() {
		return scheduleList;
	}
	
}
