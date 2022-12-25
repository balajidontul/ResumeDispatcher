package com.project.ResumeDispatcher.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ResumeDispatcher.dto.EmailDetails;
import com.project.ResumeDispatcher.service.EmailService;

@RestController
// Class
public class EmailController {
 
    @Autowired 
    private EmailService emailService;
    String status = null ;
 
    // Sending a simple Email
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details)
    {
        status = emailService.sendSimpleMail(details);
        return status;
    }
 
    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(
        @RequestBody EmailDetails details)
    {
        try {
            status = emailService.sendMailWithAttachment(details);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return status;
    }
}