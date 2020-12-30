package gamingdb.demo.service;

import org.springframework.mail.javamail.JavaMailSender;

public interface EmailService {

	public void setJavaMailSender(JavaMailSender javaMailSender);

	public void sendMessage(String email, String activation_code);
}