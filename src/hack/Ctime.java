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
	/**
	 * this function check if 2 time lines collide with each other
	 * @param c - course timeLine
	 * @return	true if not collide, false if collide
	 */
	public boolean doesCollide(Ctime c) {
		if (this.day == c.day) {
			double cStart = c.start;
			double tStart = this.start;
			double cEnd = cStart+c.duration;
			double tEnd = tStart+this.duration;
			if(tStart<cStart && tEnd>cStart) {
				return false;
			}
			else if(cStart<tStart && cEnd > tStart) {
				return false;
			}
		}
		return true;
	}
	
	public double getStart() {
		return start;
	}
	public double getDuration() {
		return duration;
	}
}
