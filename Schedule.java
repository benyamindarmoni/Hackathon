package hack;

public class Schedule {
	int grade;
	Course mat[][];
	public Schedule() {
		mat = new Course[28][6];
		grade = 0;
	}
public 
	public boolean insert(Course cor) {
	int[] index = timeToIndex(cor.getCtime());	//index = [i,j] for cor start time.
		if (mat[index[0]][index[1]] == null)//the 
		{
			for (double i = cor.getCtime().getDuration(); i>=0;i=i-0.5) {
				
			}
		}
	}


}




}
