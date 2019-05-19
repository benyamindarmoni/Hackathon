package hack;

import java.util.ArrayList;


public class Algorithm {
	ArrayList<Course>[]available;
	
	
	public void sinun(Course a[],Constraints c ) {
		boolean good=true;
	
		available =new ArrayList[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.Constraint.size();j++) {
				if(a[i].getTime().equals(c.Constraint.get(j))) {
					good=false;
					break;
				}
				if(good)this.available[i].add(a[i]);
					break;
				}
			}
		}





	}
