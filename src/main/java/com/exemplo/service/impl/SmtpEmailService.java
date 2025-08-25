package main.java.com.exemplo.service.impl;
import com.*;

public class SmtpEmailService implements EmailService {
    @Override
    public void sendEmailConfirmation(String email) {
        System.out.println("Enviando e-mail via SMTP para: " + email);
    }
}
