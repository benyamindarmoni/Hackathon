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
		index[0] = (int)(t.getStart() - 8) * 2; //start = hour, 
		return index;
	}

	public boolean insert(Course cor) {
		int[] index = timeToIndex(cor.getTime());	//index = [i,j] for cor start time. 
		int counter = 0;	
		for (double i = cor.getTime().getDuration(); i>=0;i=i-0.5) {

			if (mat[index[0]][index[1]+counter] == null) {//the 
				mat[index[0]][index[1]+counter] = cor;
				counter++;}
			else return false;
		}

		for (double i = cor.getTime().getDuration(); i>=0;i=i-0.5) {
			if (mat[index[0]][index[1]+counter] == null) {//the 
				mat[index[0]][index[1]+counter] = cor;
				counter++;}
		}
		return true;

	}


}





