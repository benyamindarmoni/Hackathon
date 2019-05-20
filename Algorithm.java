package hack;

import java.util.ArrayList;


public class Algorithm {
Course availble[][];


	public void sinun(Course before[],Constraints c) {
		availble =new Course [before.length][before.length];
		boolean good=true;
		for(int i=0;i<before.length;i++) {
			for(int j=0;j<c.Constraint.size();j++) {
				if(availble[0][i].getTime().doesCollide(c.Constraint.get(j))) {
					good=false;
					break;
				}
				if(j+1==c.Constraint.size()&&good) {
					//need to add a[i] 2 case: name of course a[i] is inside or not.

					available.get(index)
				}


			}
			good=true;
		}
	}
	public void build_scheduls() {
		
	}





}
