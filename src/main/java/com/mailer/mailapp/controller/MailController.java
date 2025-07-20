package com.mailer.mailapp.controller;

import com.mailer.mailapp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-test-email")
    public String sendTestEmail() {
        String recipient = "mitanshushinde1@gmail.com"; // Change this to a real email address

        emailService.sendSimpleMessage(
                recipient,
                "Test from Spring Boot Mailer by mitanshu shinde",
                "This is a test email sent by Mitanshu shinde  new Spring Boot application! "
        );

        return "Email has been sent to " + recipient;
    }
}