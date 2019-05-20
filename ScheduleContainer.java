package hack;

import java.util.ArrayList;

public class ScheduleContainer {
	public static ArrayList<Schedule> scheduleList=new ArrayList<Schedule>();
	
	
	public void AddSchedule(Schedule s) {
		scheduleList.add(s);
	}
	
	public ArrayList<Schedule> getList() {
		return scheduleList;
	}
	
}
