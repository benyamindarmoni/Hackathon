package hack;

import java.util.ArrayList;

public class ScheduleContainer {
	ArrayList<Schedule> scheduleList;
	
	public ScheduleContainer() {
		scheduleList =new ArrayList<Schedule>();
	}
	
	public void AddSchedule(Schedule s) {
		scheduleList.add(s);
	}
	
	public ArrayList<Schedule> getList() {
		return scheduleList;
	}
	
}
