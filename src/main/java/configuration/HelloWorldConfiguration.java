package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import interfaces.MessageProvider;
import interfaces.MessageRenderer;
import providers.HelloWorldMessageProvider;
import renderers.StandartOutMessageRenderer;

@ComponentScan(basePackages= {"com.apress.prospring5.ch3.annotation"})
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer=new StandartOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
