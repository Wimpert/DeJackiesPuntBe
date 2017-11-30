package be.dejackies.jackiessite;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


@RestController
public class GreetingController {

    @RequestMapping("/greetings")
    public String greet() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/mail")
    public String sendMail() {

        final String username = "de_jackies@hotmail.com";
        final String password = "spelvreugde666";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.port", "587");


        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("de_jackies@hotmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("holvoetwim@hotmail.com"));
            message.setSubject("Testing Subject");
            message.setText("Dear Mail Crawler,"
                    + "\n\n No spam to my email, please!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        return "Ok";
    }

}