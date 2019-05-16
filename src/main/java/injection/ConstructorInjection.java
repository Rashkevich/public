package injection;

import dependecyLookup.Dependency;

public class ConstructorInjection {
private Dependency dependency;

public ConstructorInjection(Dependency dependency) {
	super();
	this.dependency = dependency;
}

@Override
public String toString() {
	
	return dependency.toString();
}


}
