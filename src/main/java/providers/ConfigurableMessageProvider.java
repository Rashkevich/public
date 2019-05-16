package providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import interfaces.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider{
private String message;


	@Autowired
	public ConfigurableMessageProvider
	(@Value("Configurable message")String message) {
	this.message = message;
}



	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
