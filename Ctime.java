package hack;

public class Ctime {
	
	int day;
	double start;
	double duration;
	
	public Ctime(String t) {
		
	}

public Ctime(Ctime t) {
		day=t.day;
		start=t.start;
		duration=t.duration;
	}


	public Ctime(int _day, double _start, double _duration) {

		day = _day;
		start = _start;
		duration = _duration;

}
	public int getDay() {
		return day;
	}

	public boolean equals(Ctime a) {
		if(day==a.day&&start==a.start&&duration==a.duration)return true;
		return false;
	}
	
	public double getStart() {
		return start;
	}
	public double getDuration() {
		return duration;
	}
}
