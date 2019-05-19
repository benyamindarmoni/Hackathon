package hack;

public class Course {
	private long id;
	private String Course_Name;
	private String Lecture_Name;
	private int points;
	private double[] hours=new double[2];
	private char day;
	private boolean usual;

	public Course() {
		id=0;
		Course_Name=null;
		Lecture_Name=null;
		points=0;
		day='A';
		usual=false;
	}
	public Course( long id,String Course_Name,String Lecture_Name, int points, double[] hours,char day,boolean usual) {
		this.id=id;
		this.Course_Name=Course_Name;
		this.Lecture_Name=Lecture_Name;
		this.points=points;
		this.day=day;
		this.usual=usual;
		this.hours=hours;
	}
	public Course(Course a) {
		id=a.id;
		this.Course_Name=a.Course_Name;
		this.Lecture_Name=a.Lecture_Name;
		this.points=a.points;
		this.day=a.day;
		this.usual=a.usual;
		this.hours=a.hours;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public String getLecture_Name() {
		return Lecture_Name;
	}
	public void setLecture_Name(String lecture_Name) {
		Lecture_Name = lecture_Name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double[] getHours() {
		return hours;
	}
	public void setHours(double[] hours) {
		this.hours = hours;
	}
	public char getDay() {
		return day;
	}
	public void setDay(char day) {
		this.day = day;
	}
	public boolean isUsual() {
		return usual;
	}
	public void setUsual(boolean usual) {
		this.usual = usual;
	}




}
