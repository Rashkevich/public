package providers;

import org.springframework.stereotype.Component;

import interfaces.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World";
		
	}

}
