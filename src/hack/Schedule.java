package hack;

import java.util.Arrays;
import java.util.Comparator;

public class Schedule implements Comparable<Schedule>{
	int grade;
	Course mat[][];
	public Schedule() {
		mat = new Course[28][6];
		grade = 0;
	}
	public int[] timeToIndex(Ctime t) {//gets a Ctime object and puts it into index
		int[] index = new int[2];
		index[1] = t.getDay() - 1;	// j = day
		double tmp = ((t.getStart() - 8) * 2); //start = hour, 
		index[0] = (tmp < 1) ? 1 : (int)tmp;
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
		for (double i = cor.getTime().getDuration(); i>0;i=i-0.5) {//go over each time 

			if (mat[index[0]+counter-1][index[1]] == null) {//checks if the array is full
				if(index[0]+counter-1 == 27) break;
				counter++;
			}
			else 
				return false;
		}
		counter = 0;
		for (double i = cor.getTime().getDuration(); i>0;i=i-0.5) {//insert course to schdual array
			if (mat[index[0]+counter-1][index[1]] == null) { 
				mat[index[0]+counter-1][index[1]] = cor;
				if(index[0]+counter-1 == 27) break;
				counter++;}
		}
		return true;
	}
	public void addGrade (int num) {
		this.grade += num; 	
	}


	public int getGrade() {
		return this.grade;
	}
	Comparator<Schedule> compareBygrade = new Comparator<Schedule>() {
	    @Override
	    public int compare(Schedule o1, Schedule o2) {
	        return o1.compareTo(o2);
	    }
	

	};
	@Override
	public int compareTo(Schedule o) {
		return this.grade-o.grade;
	}
	
	@Override
	public String toString() 
	{
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		return super.toString();
	}
}





