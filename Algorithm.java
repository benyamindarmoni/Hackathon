package hack;

import java.util.ArrayList;


public class Algorithm {
	ArrayList<Course>[]available;
	
	
	public void sinun(Course a[],Constraints c ) {
		available =new ArrayList[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.Constraint.size();j++) {
				if(!a[i].crash(c.Constraint.size())) {
					
				}
			}
		}





	}
