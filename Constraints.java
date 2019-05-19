package hack;

import java.util.ArrayList;

public class Constraints {
	ArrayList<Ctime> constraint;
	
	public Constraints() {
		constraint = new ArrayList<Ctime>();
	}
	/* Add new Constraint to collection */
	public void AddConstraint(Ctime c) {
		constraint.add(c);
	}

}
