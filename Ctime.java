package hack;

public class Ctime {
	
	int day;
	double start;
	double duration;
	
	public Ctime(String t) {
		
	}
	public Ctime(int _day, double _start, double _duration) {
		day = _day;
		start = _start;
		duration = _duration;

}
	public int getDay() {
		return day;
	}
	public double getStart() {
		return start;
	}
	public double getDuration() {
		return duration;
	}
}
