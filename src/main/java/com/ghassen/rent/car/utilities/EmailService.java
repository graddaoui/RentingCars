package com.ghassen.rent.car.utilities;

import com.ghassen.rent.car.entities.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    @Qualifier("gmail")
    private JavaMailSender javaMailSender;

    public String sendEmail(EmailDetails emailDetails){

        MimeMessagePreparator preparator = mimeMessage -> {
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setTo(emailDetails.getReceiver());
            message.setFrom("ghassen.raddaoui.512@gmail.com","Ghassen Raddaoui");
            message.setSubject(emailDetails.getSubject());
            message.setText(emailDetails.getBody(), false);
        };
        javaMailSender.send(preparator);

        return " email sent successfully";

    }

}
