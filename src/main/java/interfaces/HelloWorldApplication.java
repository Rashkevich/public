package interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import configuration.HelloWorldConfiguration;
import factories.MessageSupportFactory;
import providers.ConfigurableMessageProvider;
import providers.HelloWorldMessageProvider;
import renderers.StandartOutMessageRenderer;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HelloWorldApplication.class, args);
//		MessageRenderer mr=new StandartOutMessageProvider();
//		MessageProvider mp=new HelloWorldMessageProvider();
//		mr.setMessageProvider(mp);
//		mr.render();
		
//		MessageRenderer mr=MessageSupportFactory.getInstance().getMessageRenderer();
//		MessageProvider mp=MessageSupportFactory.getInstance().getMessageProvider();
//		mr.setMessageProvider(mp);
//		mr.render();
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("app-context.xml");
//		MessageRenderer mr= context.getBean("renderer", MessageRenderer.class);
//		mr.render();
		
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//		MessageRenderer r=ctx.getBean("renderer", MessageRenderer.class);
//		r.render();
		
//		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
//		ctx.load("app-context.xml");
//		ctx.refresh();
//		MessageRenderer mr=ctx.getBean("renderer", MessageRenderer.class);
//		mr.render();
//		ctx.close();
		
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//		MessageRenderer mr=ctx.getBean("renderer", MessageRenderer.class);
//		mr.render();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("conf_mess_prov_context.xml");
		MessageProvider mp=(MessageProvider)context.getBean("messageProvider");
		System.out.println(mp.getMessage());
	}
}