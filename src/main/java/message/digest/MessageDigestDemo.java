package message.digest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestDemo {
	public static void main(String... args) {
		GenericXmlApplicationContext ctx =new GenericXmlApplicationContext();
		ctx.load("digestContext.xml");
		ctx.refresh();
		MessageDigester digester = ctx.getBean("digester", MessageDigester.class);
		digester.digest("Hello World!");
		ctx.close();
		}
}
