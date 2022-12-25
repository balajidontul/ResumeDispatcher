package com.project.ResumeDispatcher.service;

import java.io.IOException;

import com.project.ResumeDispatcher.dto.EmailDetails;

public interface EmailService {
    // To send a simple email
    String sendSimpleMail(EmailDetails details);
 
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details) throws IOException;
}
