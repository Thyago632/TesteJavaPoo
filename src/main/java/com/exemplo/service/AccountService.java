package com.exemplo.service;

import com.exemplo.model.Account;

public class AccountService {
    private final EmailService emailService;
    private final LoggerService loggerService;

    public AccountService(EmailService emailService, LoggerService loggerService) {
        this.emailService = emailService;
        this.loggerService = loggerService;
    }

    public Account createAccount(String username, String email) {
        // Validação básica
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome de usuário não pode ser vazio");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }

        // Criação da conta
        Account account = new Account(username, email);
        System.out.println("Conta criada para: " + username);

        // Delegando responsabilidades
        emailService.sendEmailConfirmation(email);
        loggerService.logAccountCreation(username);

        return account;
    }
}