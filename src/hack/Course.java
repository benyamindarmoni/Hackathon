package hack;

public class Course 
{
	private long id;
	private String Course_Name;
	private String Lecture_Name;
	private double points;//Number of points to the course.
	private int capcity;
	private int registered;
	private Ctime time;
	
	public Course(long id,String Course_Name,String Lecture_Name, double points, int capacity, int registered, Ctime time)
	{
		this.id=id;
		this.Course_Name=Course_Name;
		this.Lecture_Name=Lecture_Name;
		this.points=points;
		this.capcity = capacity;
		this.registered = registered;

		this.time=new Ctime(time);
	}
	
	public Course(Course a) {
		id=a.id;
		this.Course_Name=a.Course_Name;
		this.Lecture_Name=a.Lecture_Name;
		this.points=a.points;
		this.time=new Ctime(a.time);
	}
	public Ctime getTime() {
		return time;
	}
	public void setTime(Ctime c) {
		this.time = new Ctime(c);
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
	public double getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public double getLoad()
	{
		return registered/capcity;
	}
}


