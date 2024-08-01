package com.pack.book.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587); // Use 587 for STARTTLS

        mailSender.setUsername("mendhevivek0@gmail.com");
        mailSender.setPassword("ainlpduqwvkvyapy");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // Ensure STARTTLS is enabled
        props.put("mail.smtp.starttls.required", "true");
        // props.put("mail.debug", "true"); // Optional: to see debug output

        return mailSender;
    }
}

