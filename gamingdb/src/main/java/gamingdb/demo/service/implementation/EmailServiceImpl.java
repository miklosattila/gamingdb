package gamingdb.demo.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import gamingdb.demo.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	@Value("${spring.mail.username}")
	private String MESSAGE_FROM;
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public void setJavaMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
		
	}

	public void sendMessage(String email, String activation_code) {
		SimpleMailMessage message = null;
		
			message = new SimpleMailMessage();
			message.setFrom(MESSAGE_FROM);
			message.setTo(email);
			message.setSubject("Sikeres regisztrálás");
			message.setText("Kedves " + email + "! \n \n Köszönjük, hogy regisztráltál az oldalunkra! \n \n Activalas:  " + "localhost:8091/activation/"+activation_code );
			javaMailSender.send(message);
		
		
	}
}
