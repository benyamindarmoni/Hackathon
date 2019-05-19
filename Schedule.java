package hack;

public class Schedule {
	int grade;
	Course mat[][];
	public Schedule() {
		mat = new Course[28][6];
		grade = 0;
	}
	public double[] timeToIndex(Ctime t) {
		double[] index = new double[2];
		index[1] = t.getDay();	// j = day
		index[0] = t.getStart() - 9 * 2; //start = hour, 
		return index;
	}

	public boolean insert(Course cor) {
		double[] index = timeToIndex(cor.getTime());	//index = [i,j] for cor start time. 
			for (double i = cor.getTime().getDuration(); i>=0;i=i-0.5) {
				if (mat[index[0]][index[i]] == null)//the 
				mat[index[0]][i] = Course;
			}
			return true;
		}
		else return false;

	}
	
	
}





