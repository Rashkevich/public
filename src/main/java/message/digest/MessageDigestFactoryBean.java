package message.digest;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageDigestFactoryBean implements
FactoryBean<MessageDigest>, InitializingBean{
	
	private String algorithmName = "MD5";
	private MessageDigest messageDigest = null;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		messageDigest = MessageDigest.getInstance(algorithmName);
		
	}

	@Override
	public MessageDigest getObject() throws Exception {
		// TODO Auto-generated method stub
		return messageDigest;
	}

	@Override
	public Class<MessageDigest> getObjectType() {
		// TODO Auto-generated method stub
		return MessageDigest.class;
	}
	
	public boolean isSingleton() {
		return true;
	}
	
	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
		}

}
