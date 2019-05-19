package hack;

import java.util.ArrayList;


public class Algorithm {
	ArrayList<ArrayList<Course>>available;
	
	
	public void sinun(Course a[],Constraints c ) {
		boolean good=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.Constraint.size();j++) {
				if(a[i].getTime().equals(c.Constraint.get(j))) {
					good=false;
					break;
				}
				if(good) {
					int x=0;
				for(;x<available.size();x++) {
					if(available.get(x).get(0).getTime().equals(a[i].getTime()))break;
				}
				available.
					this.available[i].add(a[i]);
				}
				good=true;
					
				}
			}
		}





	}
