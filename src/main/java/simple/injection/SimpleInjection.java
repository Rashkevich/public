package simple.injection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleInjection {
private String name;
private int age;
private float height;
private boolean programmer;
private Long ageInSeconds;
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setHeight(float height) {
	this.height = height;
}
public void setProgrammer(boolean programmer) {
	this.programmer = programmer;
}
public void setAgeInSeconds(Long ageInSeconds) {
	this.ageInSeconds = ageInSeconds;
}
@Override
public String toString() {
return "Name: " + name + "\n"
+ "Age: " + age + "\n"
+ "Age in Seconds: " + ageInSeconds + "\n"
+ "Height: " + height + "\n"
+ "Is Programmer?: " + programmer;

}
public static void main(String...args) {
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
	ctx.load("simple_inj_context.xml");
	ctx.refresh();
	SimpleInjection si=(SimpleInjection) ctx.getBean("simpleInjection");
	System.out.println(si);
}

}
