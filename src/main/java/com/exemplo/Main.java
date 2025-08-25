package com.exemplo;

import com.exemplo.service.AccountService;
import com.exemplo.service.EmailService;
import com.exemplo.service.LoggerService;
import com.exemplo.service.impl.SmtpEmailService;
import com.exemplo.service.impl.ConsoleLoggerService;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new SmtpEmailService();
        LoggerService loggerService = new ConsoleLoggerService();

        AccountService accountService = new AccountService(emailService, loggerService);
        accountService.createAccount("joao", "joao@email.com");
    }
}
