package simple.injection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;


public class SimpleSpel {
	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;

	

public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public float getHeight() {
		return height;
	}



	public boolean isProgrammer() {
		return programmer;
	}



	public Long getAgeInSeconds() {
		return ageInSeconds;
	}



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

	public String toString() {
		return "Name: " + name + "\n"
		+ "Age: " + age + "\n"
		+ "Age in Seconds: " + ageInSeconds + "\n"
		+ "Height: " + height + "\n"
		+ "Is Programmer?: " + programmer;
	}
	public static void main(String...args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("simple_inj_config_context.xml");
		ctx.refresh();
		
		SimpleSpel ss=(SimpleSpel) ctx.getBean("simpleSpel");
		System.out.println(ss);
		ctx.close();
	}
}
