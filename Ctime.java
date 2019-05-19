package hack;

public class Ctime {
	
	int day;
	int start;
	int duration;
	
	public Ctime(String t) {
		
	}
	public Ctime(int _day, int _start, int _duration) {
		day = _day;
		start = _start;
		duration = _duration;

}
	public int getDay() {
		return day;
	}
	public int getStart() {
		return start;
	}
	public int getDuration() {
		return duration;
	}
}
