package injection;

public interface NewsLetterSender {
void setSmtpServer(String smtpServer);
String getSmtpServer();
void setFromAddress(String fromAddress);
String getFromAddress();

void send();
}
