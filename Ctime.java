package hack;

public class Ctime {
	
	int day;
	double start;
	double duration;
	
	public Ctime(String t) {
		
	}
<<<<<<< HEAD
public Ctime(Ctime t) {
		day=t.day;
		start=t.start;
		duration=t.duration;
	}
	public Ctime(int _day, int _start, int _duration) {
=======
	public Ctime(int _day, double _start, double _duration) {
>>>>>>> 922b0f91c67290a437ba2c19dd6e39e6bda524a1
		day = _day;
		start = _start;
		duration = _duration;

}
	public int getDay() {
		return day;
	}
<<<<<<< HEAD
	public boolean equals(Ctime a) {
		if(day==a.day&&start==a.start&&duration==a.duration)return true;
		return false;
	}
	public int getStart() {
=======
	public double getStart() {
>>>>>>> 922b0f91c67290a437ba2c19dd6e39e6bda524a1
		return start;
	}
	public double getDuration() {
		return duration;
	}
}
