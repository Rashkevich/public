package dependecyLookup;

public class ContextualizedDependencyLookup implements ManagedComponent{
private Dependency dependency;

@Override
public void PerformLookup(Container container) {
	// TODO Auto-generated method stub
	this.dependency=(Dependency)container.getDependency("MyDependency");
			
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return dependency.toString();
}

	
}
