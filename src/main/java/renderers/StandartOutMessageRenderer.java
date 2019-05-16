package renderers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaces.MessageProvider;
import interfaces.MessageRenderer;

@Service("renderer")
public class StandartOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;
	
	@Override
	public void render() {
		// TODO Auto-generated method stub
	if (messageProvider==null) {
		throw new RuntimeException("You must set property messageProvider of class:" + StandartOutMessageRenderer.class);
	}
	System.out.println(messageProvider.getMessage());
	}
	
	@Autowired
	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider=provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		
		return this.messageProvider;
	}

	
}
