package lv.akurss.opinionshare.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SpamService {

    private static final Logger log = LoggerFactory.getLogger(SpamService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Scheduled(fixedRate = 3600000)
//    @Scheduled(cron = "0 */1 10 * * MON-SAT")
    public void sendSpam() {
        log.info("Sending mails");

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("kramerwatchesyou@gmail.com");
        mailMessage.setSubject("Test message");
        mailMessage.setText("Test mesage text");
        mailMessage.setFrom("kramer@mailinator.com");

        mailSender.send(mailMessage);
    }
}