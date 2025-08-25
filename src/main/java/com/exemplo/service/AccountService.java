package main.java.com.exemplo.service;

public class AccountService {
    private final EmailService emailService;
    private final LoggerService loggerService;

    public AccountService(EmailService emailService, LoggerService loggerService) {
        this.emailService = emailService;
        this.loggerService = loggerService;
    }

    public void createAccount(String username, String email) {
        // Lógica de criação de conta
        System.out.println("Conta criada para: " + username);

        // Delegando responsabilidades
        emailService.sendEmailConfirmation(email);
        loggerService.logAccountCreation(username);
    }
}