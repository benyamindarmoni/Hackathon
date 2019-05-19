package hack;

public class Schedule {
	int grade;
	Course mat[][];
	public Schedule() {
		mat = new Course[28][6];
		grade = 0;
	}
	public int[] timeToIndex(Ctime t) {
		int[] index = new int[2];
		index[1] = t.getDay();	// j = day
		index[0] = t.getStart() - 9 * 2; //start = hour, 
		return index;
	}

	public boolean insert(Course cor) {
		double[] index = timeToIndex(cor.getCtime());	//index = [i,j] for cor start time.
		if (mat[index[0]][index[1]] == null)//the 
		{
			for (double i = cor.getCtime().getDuration(); i>=0;i=i-0.5) {
				mat[index[0]][i]=Course;
			}
			return true;
		}
		else  
			return false;

	}
}





