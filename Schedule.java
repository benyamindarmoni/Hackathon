package hack;

public class Schedule {
	int grade;
	Course mat[][];
	public Schedule() {
		mat = new Course[28][6];
		grade = 0;
	}
	public int[] timeToIndex(Ctime t) {//gets a Ctime object and puts it into index
		int[] index = new int[2];
		index[1] = t.getDay();	// j = day
		index[0] = (int)(t.getStart() - 8) * 2; //start = hour, 
		return index;
	}
	/**
	 * this function insert a course to the schdual array if its not already taken on the same time
	 * @param cor
	 * @return true if sucses to insert the cours, false otherwise
	 */
	public boolean insert(Course cor) {
		int[] index = timeToIndex(cor.getTime());	//index = [i,j] for cor start time. 
		int counter = 0; //to fill up the array by the duration 	
		for (double i = cor.getTime().getDuration(); i>=0;i=i-0.5) {//go over each time 

			if (mat[index[0]][index[1]+counter] == null) {//checks if the array is full
				mat[index[0]][index[1]+counter] = cor;
				counter++;}
			else return false;
		}
		counter = 0;
		for (double i = cor.getTime().getDuration(); i>=0;i=i-0.5) {//insert course to schdual array
			if (mat[index[0]][index[1]+counter] == null) { 
				mat[index[0]][index[1]+counter] = cor;
				counter++;}
		}
		return true;
	}



}





