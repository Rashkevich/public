package nested;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Hierarhical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext parent=new GenericXmlApplicationContext();
		parent.load("parent_context.xml");
		parent.refresh();
		
		GenericXmlApplicationContext child=new GenericXmlApplicationContext();
		child.setParent(parent);
		child.load("child_context.xml");
		child.refresh();
		
		Song song1=(Song)child.getBean("song1");
		Song song2=(Song)child.getBean("song2");
		Song song3=(Song)child.getBean("song3");
		
		System.out.println("from parent "+song1.getTitle());
		System.out.println("from child "+song2.getTitle());
		System.out.println("from child "+song3.getTitle());
		
		child.close();
		parent.close();
		
	}

}
