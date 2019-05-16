package injection;

import dependecyLookup.Dependency;

public class SetterInjection {
private Dependency dependency;

public void setDependency(Dependency dependency) {
	this.dependency = dependency;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return dependency.toString();
}


}
