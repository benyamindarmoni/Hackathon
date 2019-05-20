package hack;

import java.util.ArrayList;


public class Algorithm {
	ArrayList<ArrayList<Course>> availble;//availble.get(i) = main courses, 
	//availble.get(i).get(j) = sub times.
	

	public Algorithm() {
		availble = new ArrayList<ArrayList<Course>>();
	}
	public void sinun(Course before[],Constraints c ) {

		boolean good=true;
		for(int i=0;i<before.length;i++) {
			for(int j=0;j<c.constraint.size();j++) {
				if(availble.get(i).get(j).getTime().doesCollide(c.constraint.get(j))) {
					good=false;
					break;
				}
				if(j+1==c.constraint.size()&&good) {
					//need to add a[i] 2 case: name of course a[i] is inside or not.
					boolean found=false;
					for(int x=0;x<availble.size();x++) {
						if(availble.get(x).get(0).getCourse_Name().equals(before[i].getCourse_Name())) {
							availble.get(x).add(before[i]);
							found=true;
							break;
						}
					}
					if(!found) {
						availble.add(new ArrayList<Course>());
						availble.get(availble.size()-1).add(before[i]);
					}


				}
				good=true;
			}
		}
	}
	public void build_scheduls() {

	}





}
