
package com.exemplo.service.impl;

import com.exemplo.service.EmailService;

public class SmtpEmailService implements EmailService {
    @Override
    public void sendEmailConfirmation(String email) {
        System.out.println("Enviando e-mail via SMTP para: " + email);
    }
}
