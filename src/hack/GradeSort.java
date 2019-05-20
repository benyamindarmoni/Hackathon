package hack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSort {
	
	ScheduleContainer sc;
	
	public GradeSort(ScheduleContainer _sc) {
		sc = _sc;
	}
	/**
	 * this function sorts schedules list by grades.
	 */
	public void sortByGrades() {
		ArrayList<Schedule> sList = sc.getList();
		Collections.sort(sList);
	}
	
	public static void sortByGradesstatic(ScheduleContainer sc) {
		ArrayList<Schedule> sList = sc.getList();
		Collections.sort(sList);
	}
	
}
