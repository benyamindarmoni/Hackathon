package hack;
import java.util.ArrayList;
public class Algorithm {
	ArrayList<ArrayList<Course>> availble;//availble.get(i) = main courses, 
	//availble.get(i).get(j) = sub times.
	int []counter;
	public Algorithm() {
		availble = new ArrayList<ArrayList<Course>>();
		counter=null;
	}
	public void sinun(Course before[],Constraints c ) {

		boolean good=true;
		for(int i=0;i<before.length;i++) {
			for(int j=0;j<c.constraint.size();j++) {
//				if (availble.size()!=0)
//				{
					if(before[i].getTime().doesCollide(c.constraint.get(j))) {
						good=false;
						break;
					}
//				}
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

		counter=new int[availble.size()];

		while(counter[0]<availble.get(0).size()) {
			Schedule a=new Schedule ();
			for(int i=0; i < availble.size() ; i++) {
				if(!(counter[i]>=availble.get(i).size())) {
				boolean ans=a.insert(availble.get(i).get(counter[i]));
				if(!ans)a.grade++;
				}
			}

			int help=1;
			counter[counter.length-help]++;
			while(counter[counter.length-help]-1>=availble.get(availble.size()-help).size()) {
				counter[counter.length-help]=0;
				help++;
				counter[counter.length-help]++;
			}
			ScheduleContainer.scheduleList().add(a);
		}
	}
	
	public Course [] toArray(ArrayList<Course> al)
	{
		Course [] co = new Course[al.size()];
		
		for (int i = 0; i < co.length; i++)
			co[i] = al.get(i);
		
		return co;
	}
	
}
